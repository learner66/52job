package com.job52.model;

import java.util.Date;

/**
 * InnoDB free: 3072 kB
 * 
 * @author wcyong
 * 
 * @date 2018-02-27
 */
public class Application extends ApplicationKey {
    private String rid;

    private Integer ispass;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public Integer getIspass() {
        return ispass;
    }

    public void setIspass(Integer ispass) {
        this.ispass = ispass;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}