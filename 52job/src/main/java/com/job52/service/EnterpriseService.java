package com.job52.service;

import com.job52.model.Enterprise;

import java.util.List;

public interface EnterpriseService {

    /**
     * 新增公司信息
     * @param enterprise
     * @return
     * @throws Exception
     */
     boolean addEnterprise(Enterprise enterprise) throws Exception ;

    /**
     * 删除公司信息
     * @param eid
     * @return
     * @throws Exception
     */
     boolean removeEnterprise(String eid) ;

    /**
     * 更新公司信息
     * @param enterprise
     * @return
     * @throws Exception
     */
     boolean updateEnterprise(Enterprise enterprise) ;

    /**
     * 获取具体公司信息
     * @param eid
     * @return
     * @throws Exception
     */
     Enterprise getEnterprise(String eid) ;

    /**
     * 模糊查询公司信息
     * @param enterprise
     * @return
     * @throws Exception
     */
     List<Enterprise> queryContainsEnterprise(Enterprise enterprise) ;

    /**
     * 查询所有公司信息
     * @return
     * @throws Exception
     */
     List<Enterprise> queryAllEnterprise() ;

}
