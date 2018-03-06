package com.job52.service.impl;

import com.job52.dao.PersonMapper;
import com.job52.model.Person;
import com.job52.service.PersonService;
import com.job52.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    public boolean registerPerson(Person person) throws Exception {
        //将密码进行MD5加密
        person.setPassWord(MD5Util.md5(person.getPassWord()));
        personMapper.insert(person);
        return true;
    }

    public boolean personLogin(Person person) throws Exception {
        return false;
    }

    public boolean updatePersonInfo(String pid, Person person) throws Exception {
        return false;
    }

    public boolean UpdatePersonPhone(String pid, String phone) throws Exception {
        return false;
    }

    public boolean updatePersonEmail(String pid, String Email) throws Exception {
        return false;
    }

    public Person queryPerson(String pid) throws Exception {
        return null;
    }
}
