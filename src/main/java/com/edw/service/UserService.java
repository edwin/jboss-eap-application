package com.edw.service;

import com.edw.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * <pre>
 *     com.edw.service.UserService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 18 Jul 2020 13:05
 */
@Repository
@Transactional
public class UserService {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User").list();
    }

}
