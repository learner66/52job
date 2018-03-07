package com.job52.service;


import com.job52.model.Person;





public interface PersonService {
    /**
     * 个人用户注册
     * @param person  个人注册信息
     * @throws Exception 异常信息
     */
     boolean registerPerson(Person person) throws Exception;
    /**
     * 个人用户登录
     * @param person 个人登录信息
     * @throws Exception 异常信息
     */
    Person personLogin(Person person) throws Exception;
    /**
     * 更新个人用户基本信息，包括头像，昵称
     * @param pid 个人用户的id
     * @param person 个人用户信息
     * @throws Exception 异常信息
     */
     boolean updatePersonInfo(String pid,Person person) throws Exception;

    /**
     * 更新绑定手机
     * @param pid 个人用户的id
     * @param phone 用户更新的手机
     * @throws Exception 异常信息
     */
     boolean UpdatePersonPhone(String pid,String phone) throws Exception;

    /**
     * 更新绑定邮箱
     * @param pid 个人用户的id
     * @param Email 个人用户更新的邮箱
     * @throws Exception 异常信息
     */
     boolean updatePersonEmail(String pid,String Email) throws Exception;

    /**
     * 查询用户信息
     * @param pid 用户查询条件
     * @return 满足条件的用户信息
     * @throws Exception 异常信息
     */
     Person queryPerson(String pid) throws Exception;




}
