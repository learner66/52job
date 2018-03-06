package com.job52.service;

import com.job52.model.Application;

import java.util.List;

public interface ApplicationService {
    //我的申请
    /**
     * 获取用户申请列表
     * @return 所有的申请列表
     * @throws Exception 异常信息
     */
    public List<Application> findAllApplication()throws Exception;

    /**
     * 从申请职位
     * @param pid 用户id
     * @param jid 职位id
     * @param rid 简历id
     * @return 操作是否成功
     * @throws Exception
     */
    public boolean applyJob(String pid,String jid,String rid) throws Exception;

}
