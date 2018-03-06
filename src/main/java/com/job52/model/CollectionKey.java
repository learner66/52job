package com.job52.model;

public class CollectionKey {
    /**
     * 职位收藏表
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