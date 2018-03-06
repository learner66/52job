package com.job52.service;

import com.job52.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})

public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void testFindUser() throws Exception{
        List<User> list = userService.findUser();
        for (User user: list) {
            System.out.println(user);
        }
    }

}