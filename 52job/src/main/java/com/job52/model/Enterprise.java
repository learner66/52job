package com.job52.model;

/**
 * InnoDB free: 3072 kB
 * 
 * @author wcyong
 * 
 * @date 2018-02-27
 */
public class Enterprise {
    /**
     * 公司id
     */
    private String eid;

    /**
     * 公司用户名
     */
    private String eUsername;

    /**
     * 公司密码
     */
    private String ePassword;

    /**
     * 公司名称
     */
    private String ename;

    /**
     * 公司地址
     */
    private String adddress;

    /**
     * 企业类型
     */
    private String eType;

    /**
     * 员工人数
     */
    private Integer eNumber;

    private String email;

    private String imageUrl;

    /**
     * 公司描述
     */
    private String descriptionte;

    /**
     * 备注:联系人，电话等等
     */

    private String contact;

    public Enterprise(String eid, String eUsername, String ePassword, String ename, String adddress, String eType, Integer eNumber, String email, String imageUrl, String descriptionte, String contact) {
        this.eid = eid;
        this.eUsername = eUsername;
        this.ePassword = ePassword;
        this.ename = ename;
        this.adddress = adddress;
        this.eType = eType;
        this.eNumber = eNumber;
        this.email = email;
        this.imageUrl = imageUrl;
        this.descriptionte = descriptionte;
        this.contact = contact;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    public String geteUsername() {
        return eUsername;
    }

    public void seteUsername(String eUsername) {
        this.eUsername = eUsername == null ? null : eUsername.trim();
    }

    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword == null ? null : ePassword.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getAdddress() {
        return adddress;
    }

    public void setAdddress(String adddress) {
        this.adddress = adddress == null ? null : adddress.trim();
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType == null ? null : eType.trim();
    }

    public Integer geteNumber() {
        return eNumber;
    }

    public void seteNumber(Integer eNumber) {
        this.eNumber = eNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getDescriptionte() {
        return descriptionte;
    }

    public void setDescriptionte(String descriptionte) {
        this.descriptionte = descriptionte == null ? null : descriptionte.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }
}