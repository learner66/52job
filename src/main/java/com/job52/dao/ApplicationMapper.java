package com.job52.dao;

import com.job52.model.Application;
import com.job52.model.ApplicationKey;

public interface ApplicationMapper {
    int deleteByPrimaryKey(ApplicationKey key);

    int insert(Application record);

    int insertSelective(Application record);

    Application selectByPrimaryKey(ApplicationKey key);

    int updateByPrimaryKeySelective(Application record);

    int updateByPrimaryKey(Application record);
}