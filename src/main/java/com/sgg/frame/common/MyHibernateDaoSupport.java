package com.sgg.frame.common;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import javax.annotation.Resource;
import java.util.List;

public class MyHibernateDaoSupport extends HibernateDaoSupport {

    @Resource(name = "sessionFactory")
    public void setSuperSessionFactory(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    public List getPager()throws Exception{
        return null;
    }

}
