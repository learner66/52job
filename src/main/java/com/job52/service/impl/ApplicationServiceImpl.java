package com.job52.service.impl;

import com.job52.model.Application;
import com.job52.service.ApplicationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    public List<Application> findAllApplication() throws Exception {
        return null;
    }

    public boolean applyJob(String pid, String jid, String rid) throws Exception {
        return false;
    }
}
