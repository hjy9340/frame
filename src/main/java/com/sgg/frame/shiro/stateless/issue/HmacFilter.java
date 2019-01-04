package com.sgg.frame.shiro.stateless.issue;

import cn.hutool.core.util.StrUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.apache.shiro.web.util.WebUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * 基于HMAC（ 散列消息认证码）的无状态认证过滤器
 * @author wangjie (http://www.jianshu.com/u/ffa3cba4c604) 
 * @date 2016年6月24日 下午2:55:15
 */
public class HmacFilter extends AccessControlFilter {
    
    private static final Logger log = LoggerFactory.getLogger(AccessControlFilter.class);
    
    public static final String DEFAULT_CLIENTKEY_PARAM = "clientKey";
    public static final String DEFAULT_TIMESTAMP_PARAM = "timeStamp";
    public static final String DEFAUL_DIGEST_PARAM = "digest";
    public static final String DEFAUL_PASSWORD_PARAM="password";
 
    /**
     * 是否放行
     */
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response,
                                      Object mappedValue) throws Exception {
        if (null != getSubject(request, response) 
                && getSubject(request, response).isAuthenticated()) {
            return true;//已经认证过直接放行
        }
        return false;//转到拒绝访问处理逻辑
    }
 
    /**
     * 拒绝处理
     */
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response)  
                                                                          throws Exception {
        if(isHmacSubmission(request)){//如果是Hmac鉴权的请求
            //创建令牌
            AuthenticationToken token = createToken(request, response);
            try {
                Subject subject = getSubject(request, response);
                subject.login(token);//认证
                return true;//认证成功，过滤器链继续
            } catch (AuthenticationException e) {//认证失败，发送401状态并附带异常信息
                log.error(e.getMessage(),e);
                WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED,e.getMessage());
            }
        }
        WebUtils.toHttp(response).sendError(HttpServletResponse.SC_UNAUTHORIZED,"request params is not accepted ");

        return false;//打住，访问到此为止
    }
 
    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String clientKey = request.getParameter(DEFAULT_CLIENTKEY_PARAM);
        String timeStamp= request.getParameter(DEFAULT_TIMESTAMP_PARAM);
        String digest= request.getParameter(DEFAUL_DIGEST_PARAM);;
        String password= request.getParameter(DEFAUL_PASSWORD_PARAM);
        Map<String, String[]> parameters = request.getParameterMap();
        String host = request.getRemoteHost();
        return new HmacToken(clientKey,password, timeStamp, digest, host,parameters);
    }
    
    protected boolean isHmacSubmission(ServletRequest request) {
        String clientKey = request.getParameter(DEFAULT_CLIENTKEY_PARAM);
        String timeStamp= request.getParameter(DEFAULT_TIMESTAMP_PARAM);
        String digest= request.getParameter(DEFAUL_DIGEST_PARAM);
        return (request instanceof HttpServletRequest)
                            && StrUtil.isNotBlank(clientKey)
                            && StrUtil.isNotBlank(timeStamp)
                            && StrUtil.isNotBlank(digest);
    }
}
