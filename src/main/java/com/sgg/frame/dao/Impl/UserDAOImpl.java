package com.sgg.frame.dao.Impl;

import com.sgg.frame.beans.User;

import com.sgg.frame.common.MyHibernateDaoSupport;
import com.sgg.frame.dao.UserDAO;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private MyHibernateDaoSupport myHibernateDaoSupport;
    @Override
    public User getUser(String userName,String password) throws Exception {
        List<?> users = myHibernateDaoSupport.getHibernateTemplate().find("from User where name=? and password=?",userName,password);
        return users.size()>0?(User)users.get(0):null;//假数据，后期要通过Hibernate去数据库取

    }
    @Override
    public void insertUser(User user) throws Exception {
        myHibernateDaoSupport.getHibernateTemplate().save(user);
    }

    @Override
    public User findByName(String name) {
        List<?> users = myHibernateDaoSupport.getHibernateTemplate().find("from User where name=?",name);
        return users.size()>0?(User)users.get(0):null;//假数据，后期要通过Hibernate去数据库取
    }

    public List getList()throws Exception{
        final String  sql="select * from user";
        List list= (List) myHibernateDaoSupport.getHibernateTemplate().execute(new HibernateCallback() {
            @Override
            public Object doInHibernate(Session session) throws HibernateException {
                final SQLQuery sqlQuery = session.createSQLQuery(sql);
                return sqlQuery.list();
            }
        });
        return list;
    }
}
