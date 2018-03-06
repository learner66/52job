package com.job52.service;

import com.job52.model.User;

import java.util.List;

public interface UserService {
    public List<User> findUser() throws Exception;
}
