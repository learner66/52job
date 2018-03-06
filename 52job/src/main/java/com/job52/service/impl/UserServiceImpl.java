package com.job52.service.impl;

import com.job52.dao.UserDao;
import com.job52.model.User;
import com.job52.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public List<User> findUser() throws Exception {
        return userDao.findUser() ;
    }
}
