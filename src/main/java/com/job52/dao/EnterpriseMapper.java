package com.job52.dao;

import com.job52.model.Enterprise;

public interface EnterpriseMapper {
    int deleteByPrimaryKey(String eid) ;

    int insert(Enterprise record) throws Exception;

    int insertSelective(Enterprise record);

    Enterprise selectByPrimaryKey(String eid);

    int updateByPrimaryKeySelective(Enterprise record);

    int updateByPrimaryKey(Enterprise record);
}