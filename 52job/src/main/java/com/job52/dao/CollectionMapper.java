package com.job52.dao;

import com.job52.model.Collection;
import com.job52.model.CollectionKey;

public interface CollectionMapper {
    int deleteByPrimaryKey(CollectionKey key);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(CollectionKey key);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
}