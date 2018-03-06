package com.job52.model;

/**
 * InnoDB free: 3072 kB
 * 
 * @author wcyong
 * 
 * @date 2018-02-27
 */
public class Job {
    /**
     * 职位id
     */
    private String jid;

    /**
     * 公司id
     */
    private String eid;

    /**
     * 个人id
     */
    private String pid;

    /**
     * 招聘人数
     */
    private Integer requiredNumber;

    /**
     * 工作名称
     */
    private String jname;

    /**
     * 工作年限要求
     */
    private Integer requiredWorkyear;

    /**
     * 学历要求
     */
    private String requiredEducation;

    private String benefit;

    /**
     * 职位描述
     */
    private String jobDesc;

    /**
     * 工作类型
     */
    private String jobType;

    /**
     * 工作地点
     */
    private String workPlace;

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid == null ? null : jid.trim();
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public Integer getRequiredNumber() {
        return requiredNumber;
    }

    public void setRequiredNumber(Integer requiredNumber) {
        this.requiredNumber = requiredNumber;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname == null ? null : jname.trim();
    }

    public Integer getRequiredWorkyear() {
        return requiredWorkyear;
    }

    public void setRequiredWorkyear(Integer requiredWorkyear) {
        this.requiredWorkyear = requiredWorkyear;
    }

    public String getRequiredEducation() {
        return requiredEducation;
    }

    public void setRequiredEducation(String requiredEducation) {
        this.requiredEducation = requiredEducation == null ? null : requiredEducation.trim();
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit == null ? null : benefit.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType == null ? null : jobType.trim();
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace == null ? null : workPlace.trim();
    }
}