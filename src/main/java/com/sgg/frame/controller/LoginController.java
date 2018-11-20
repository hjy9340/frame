package com.sgg.frame.controller;

import cn.hutool.crypto.SecureUtil;
import com.alibaba.druid.util.StringUtils;
import com.sgg.frame.beans.User;
import com.sgg.frame.common.Constants;
import com.sgg.frame.entity.ResponseData;
import com.sgg.frame.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Autowired
    UserService userService;

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        return "user/login";
    }

    @ResponseBody
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public ResponseData logon(HttpServletRequest req, User user, BindingResult bindingResult,
                              RedirectAttributes redirectAttributes, ModelMap modelMap, boolean remenberMe)
            throws Exception {
        LOGGER.info("POST请求登录");
        String result = "";
        ResponseData data=new ResponseData();
        if (StringUtils.isEmpty(user.getName())) {
            result = ("用户名不能为空");
            req.setAttribute("msg", result);
            data.setCode("");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            result = ("密码不能为空");
            req.setAttribute("msg", result);

        }
        try {
            String password = user.getPassword();
            user = userService.findByName(user.getName());
            String newPassword = SecureUtil.md5(password+user.getSalt());//PasswordHelper.encryptPasswordR(user.getName(), password, user.getSalt());

            Subject u = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), newPassword.toCharArray());
            token.setRememberMe(true);

            u.login(token);
            //druid监控需要
            req.getSession().setAttribute(Constants.CURRENT_USER, user);
            //req.getSession().setAttribute(Constants.CURRENT_USERNAME, user.getUsername());
        } catch (UnknownAccountException e) {
            LOGGER.error("账号不存在：{}", e);
            result = ("账号不存在");
            req.setAttribute("msg", result);
        } catch (DisabledAccountException e) {
            LOGGER.error("账号未启用：{}", e);
            result = ("账号未启用");
            req.setAttribute("msg", result);
        } catch (IncorrectCredentialsException e) {
            LOGGER.error("密码错误：{}", e);
            result = ("密码错误");
            req.setAttribute("msg", result);
        } catch (RuntimeException e) {
            LOGGER.error("未知错误,请联系管理员：{}", e);
            result = ("未知错误,请联系管理员");
            req.setAttribute("msg", result);
        }
        return data;

    }
}
