package com.job52.service.impl;

import com.job52.model.Enterprise;
import com.job52.service.EnterpriseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})

public class EnterpriseServiceImplTest {
    @Autowired
    private EnterpriseService enterpriseService;

    @Test
    public void addEnterprise() throws  Exception{
        Enterprise e = new Enterprise("ccc","ccc","ccc","ccc","ccc","ccc",333,"ccc","ccc","ccc","ccc");
        enterpriseService.addEnterprise(e);
    }
}