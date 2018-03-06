package com.job52.service;

import com.job52.model.Collection;

import java.util.List;

public interface CollectionService {
    //我的收藏

    /**
     * 获取用户收藏列表
     * @return 收藏列表
     * @throws Exception 异常信息
     */
    public List<Collection> findAllCollection() throws Exception;

    /**
     * 删除收藏列表中的内容
     * @param ids 所有需要删除的收藏的id值
     * @return  操作是否成功
     * @throws Exception
     */
    public boolean deleteCollection(String[] ids) throws Exception;
}
