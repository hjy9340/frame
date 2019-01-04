package com.sgg.frame.shiro.stateless.issue;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.subject.SubjectContext;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

/**
 * 扩展自DefaultWebSubjectFactory,对于无状态的TOKEN 类型不创建session
 */
public class AgileSubjectFactory extends DefaultWebSubjectFactory {

    public Subject createSubject(SubjectContext context) {
        AuthenticationToken token = context.getAuthenticationToken();
        if ((token instanceof HmacToken)) {
            // 当token为HmacToken时， 不创建 session 
            context.setSessionCreationEnabled(false);
        }
        return super.createSubject(context);
    }
}