package com.job52.dao;

import com.job52.model.Person;

public interface PersonMapper {
    /**
     * 根据主键删除用户信息
     * @param pid 用户id
     * @return 用户信息
     */
    int deleteByPrimaryKey(String pid);

    /**
     * 插入用户信息
     * @param record 用户信息
     * @return 操作信息
     */
    int insert(Person record);

    /**
     * 插入用户部分信息，有部分信息是空的
     * @param record 用户信息
     * @return 操作信息
     */
    int insertSelective(Person record);

    /**
     * 根据主键查找用户信息
     * @param pid 用户id(主键)
     * @return 用户信息
     */
    Person selectByPrimaryKey(String pid);

    /**
     * 根据主键更新用户信息，有部分信息可能为空
     * @param record 用户更新信息
     * @return 操作信息
     */
    int updateByPrimaryKeySelective(Person record);

    /**
     * 根据主键更新用户信息
     * @param record 用户更新信息
     * @return 操作信息
     */
    int updateByPrimaryKey(Person record);


}