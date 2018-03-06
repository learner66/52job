package com.job52.model;

import java.util.Date;

/**
 * InnoDB free: 3072 kB
 * 
 * @author wcyong
 * 
 * @date 2018-02-27
 */
public class Resume {
    /**
     * 简历id
     */
    private String rid;

    private String pid;

    private String birthday;

    /**
     * 最高学历
     */
    private String highestEducation;

    /**
     * 毕业院校
     */
    private String gradutionUniversity;

    /**
     * 毕业时间
     */
    private Date gradutionTime;

    /**
     * 专业
     */
    private String major;

    /**
     * 工作经历
     */
    private String workExp;

    /**
     * 简历是否公开
     */
    private Integer ispublic;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation == null ? null : highestEducation.trim();
    }

    public String getGradutionUniversity() {
        return gradutionUniversity;
    }

    public void setGradutionUniversity(String gradutionUniversity) {
        this.gradutionUniversity = gradutionUniversity == null ? null : gradutionUniversity.trim();
    }

    public Date getGradutionTime() {
        return gradutionTime;
    }

    public void setGradutionTime(Date gradutionTime) {
        this.gradutionTime = gradutionTime;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getWorkExp() {
        return workExp;
    }

    public void setWorkExp(String workExp) {
        this.workExp = workExp == null ? null : workExp.trim();
    }

    public Integer getIspublic() {
        return ispublic;
    }

    public void setIspublic(Integer ispublic) {
        this.ispublic = ispublic;
    }
}