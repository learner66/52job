package com.job52.dao;

import com.job52.model.User;

import java.util.List;


public interface UserDao {
    public List<User> findUser() throws Exception;
}
