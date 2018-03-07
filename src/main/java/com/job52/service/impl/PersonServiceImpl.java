package com.job52.service.impl;

import com.job52.dao.PersonMapper;
import com.job52.model.Person;
import com.job52.service.PersonService;
import com.job52.util.FormatUtil;
import com.job52.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;
import java.util.UUID;

@Service("personService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    /**
     * 1.需要将密码进行加密
     * 2.需要随机生成id
     * 3.需要判断用户名是邮箱还是手机，并设置到相应位置
     * 4.需要随机生成用户名
     */
    @Transactional
    public boolean registerPerson(Person person) throws Exception {
        person.setPassWord(MD5Util.md5(person.getPassWord()));
        String userName = person.getUserName();
        int format = FormatUtil.verifyPhoneOrEmailFormat(userName);
        if(format == 0){
            throw new Exception("不能识别的用户名");
        }
        else if(format==1){
          person.setPhone(userName);  //判断用户用手机注册，将手机号添加到用户的手机
        }else{
            person.setEmail(userName);//判断用户用邮箱注册，将邮箱添加到用户的邮箱
        }
        int id = personMapper.findLastId()+1;
        person.setUserName("job52"+id);
        personMapper.insert(person);
        return true;
    }

    /**
     * 登录信息可能为邮箱，为手机号，为用户名
     * @param person 个人登录信息
     * @return
     * @throws Exception
     */
    public Person personLogin(Person person) throws Exception {
        person.setPassWord(MD5Util.md5(person.getPassWord()));
        return personMapper.findPersonByNameAndPwd(person);
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
