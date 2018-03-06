package com.job52.model;

import java.util.Date;

/**
 * InnoDB free: 3072 kB
 * 
 * @author wcyong
 * 
 * @date 2018-02-27
 */
public class Candidate extends CandidateKey {
    private String rid;

    /**
     * 描述
     */
    private String descriptionte;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否被查看
     */
    private Integer isread;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public String getDescriptionte() {
        return descriptionte;
    }

    public void setDescriptionte(String descriptionte) {
        this.descriptionte = descriptionte == null ? null : descriptionte.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsread() {
        return isread;
    }

    public void setIsread(Integer isread) {
        this.isread = isread;
    }
}