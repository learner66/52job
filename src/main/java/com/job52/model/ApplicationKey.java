package com.job52.model;

public class ApplicationKey {
    /**
     * 申请职位表
     */
    private String pid;

    private String gid;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid == null ? null : gid.trim();
    }
}