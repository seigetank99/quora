package com.billy.UniQuery.entity;

import java.util.Date;

public class Admin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.mid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Integer mid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.adminName
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String adminname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.adminPass
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String adminpass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.realName
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String realname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.birthday
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.sex
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.tel
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.email
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.status
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.createDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Date createdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_admin.modifyDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    private Date modifydate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.mid
     *
     * @return the value of t_admin.mid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.mid
     *
     * @param mid the value for t_admin.mid
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.adminName
     *
     * @return the value of t_admin.adminName
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.adminName
     *
     * @param adminname the value for t_admin.adminName
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.adminPass
     *
     * @return the value of t_admin.adminPass
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getAdminpass() {
        return adminpass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.adminPass
     *
     * @param adminpass the value for t_admin.adminPass
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass == null ? null : adminpass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.realName
     *
     * @return the value of t_admin.realName
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getRealname() {
        return realname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.realName
     *
     * @param realname the value for t_admin.realName
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.birthday
     *
     * @return the value of t_admin.birthday
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.birthday
     *
     * @param birthday the value for t_admin.birthday
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.sex
     *
     * @return the value of t_admin.sex
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.sex
     *
     * @param sex the value for t_admin.sex
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.tel
     *
     * @return the value of t_admin.tel
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.tel
     *
     * @param tel the value for t_admin.tel
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.email
     *
     * @return the value of t_admin.email
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.email
     *
     * @param email the value for t_admin.email
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.status
     *
     * @return the value of t_admin.status
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.status
     *
     * @param status the value for t_admin.status
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.createDate
     *
     * @return the value of t_admin.createDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.createDate
     *
     * @param createdate the value for t_admin.createDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_admin.modifyDate
     *
     * @return the value of t_admin.modifyDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_admin.modifyDate
     *
     * @param modifydate the value for t_admin.modifyDate
     *
     * @mbg.generated Fri Apr 10 10:37:15 CST 2020
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}