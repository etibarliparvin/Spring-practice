package com.company.serivices;

import com.company.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required = false)
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public UserService setUserDao(UserDao userDao) {
        this.userDao = userDao;
        return this;
    }
}
