package com.job52.dao;

import com.job52.model.Resume;

public interface ResumeMapper {
    int deleteByPrimaryKey(String rid);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(String rid);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}