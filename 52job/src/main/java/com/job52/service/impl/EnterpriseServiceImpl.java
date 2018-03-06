package com.job52.service.impl;

import com.job52.dao.EnterpriseMapper;
import com.job52.model.Enterprise;
import com.job52.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService{

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    public boolean addEnterprise(Enterprise enterprise)  {
        try {
            enterpriseMapper.insert(enterprise);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean removeEnterprise(String eid)  {
        try {
            enterpriseMapper.deleteByPrimaryKey(eid);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean updateEnterprise(Enterprise enterprise)  {
        try {
            enterpriseMapper.updateByPrimaryKeySelective(enterprise);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public Enterprise getEnterprise(String eid)  {
        Enterprise e = null;
        try {
            e = enterpriseMapper.selectByPrimaryKey(eid);
        } catch (Exception e1) {
            e1.printStackTrace();
            return null;
        }
        return e;
    }

    @Override
    public List<Enterprise> queryContainsEnterprise(Enterprise enterprise) {
        return null;
    }

    @Override
    public List<Enterprise> queryAllEnterprise() {
        return null;
    }

}
