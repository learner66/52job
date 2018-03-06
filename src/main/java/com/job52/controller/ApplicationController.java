package com.job52.controller;

import com.job52.model.Application;
import com.job52.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/application")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    /**
     * 查找用户的申请列表
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAllApplication")
    public String findAllApplication(Model model) throws Exception {
        List<Application> applicationList = applicationService.findAllApplication();
        model.addAttribute("applicationList",applicationList);
        return null;
    }

    /**
     * 提交用户申请
     * @param pid 用户id
     * @param jid 职位id
     * @param rid 职位id
     * @return
     * @throws Exception
     */
    public String applyJob(String pid, String jid, String rid) throws Exception {
        applicationService.applyJob(pid, jid, rid);
        return null;
    }
}
