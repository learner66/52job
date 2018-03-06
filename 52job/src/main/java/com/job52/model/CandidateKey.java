package com.job52.model;

public class CandidateKey {
    /**
     * 公司查看职位申请人列表
     */
    private String jid;

    private String pid;

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid == null ? null : jid.trim();
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }
}