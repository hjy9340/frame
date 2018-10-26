package com.sgg.frame.dao.Impl;

import com.sgg.frame.beans.User;
import com.sgg.frame.common.MyHibernateDaoSupport;
import com.sgg.frame.dao.UserDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Override
    public User getUser(String userName,String password) throws Exception {
        List<?> users = hibernateTemplate.find("from User where name=? and password=?",userName,password);
        return users.size()>0?(User)users.get(0):null;//假数据，后期要通过Hibernate去数据库取

    }

    @Override
    public void insertUser(User user) throws Exception {
        hibernateTemplate.save(user);
    }

    @Override
    public User findByName(String name) {
        List<?> users = hibernateTemplate.find("from User where name=?",name);
        return users.size()>0?(User)users.get(0):null;//假数据，后期要通过Hibernate去数据库取
    }
}
