package com.dlfc.system.entity;

import com.dlfc.system.common.DataEntity;

import java.util.Date;

public class SysParam extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.ID
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.PINDEX
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.SCOPE
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String scope;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.SKEY
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String skey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.SVALUE
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String svalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.DCRP
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String dcrp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.CREATE_USER
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.CREATE_USER_IDENTITY
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.CREATE_TIME
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.MODIFY_USER
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.MODIFY_TIME
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.DELETE_FLG
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Short deleteFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_param.VERSION
     *
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.ID
     *
     * @return the value of sys_param.ID
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.ID
     *
     * @param id the value for sys_param.ID
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.PINDEX
     *
     * @return the value of sys_param.PINDEX
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.PINDEX
     *
     * @param pindex the value for sys_param.PINDEX
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.SCOPE
     *
     * @return the value of sys_param.SCOPE
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getScope() {
        return scope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.SCOPE
     *
     * @param scope the value for sys_param.SCOPE
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.SKEY
     *
     * @return the value of sys_param.SKEY
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getSkey() {
        return skey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.SKEY
     *
     * @param skey the value for sys_param.SKEY
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setSkey(String skey) {
        this.skey = skey == null ? null : skey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.SVALUE
     *
     * @return the value of sys_param.SVALUE
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getSvalue() {
        return svalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.SVALUE
     *
     * @param svalue the value for sys_param.SVALUE
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setSvalue(String svalue) {
        this.svalue = svalue == null ? null : svalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.DCRP
     *
     * @return the value of sys_param.DCRP
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getDcrp() {
        return dcrp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.DCRP
     *
     * @param dcrp the value for sys_param.DCRP
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setDcrp(String dcrp) {
        this.dcrp = dcrp == null ? null : dcrp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.CREATE_USER
     *
     * @return the value of sys_param.CREATE_USER
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.CREATE_USER
     *
     * @param createUser the value for sys_param.CREATE_USER
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.CREATE_USER_IDENTITY
     *
     * @return the value of sys_param.CREATE_USER_IDENTITY
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for sys_param.CREATE_USER_IDENTITY
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.CREATE_TIME
     *
     * @return the value of sys_param.CREATE_TIME
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.CREATE_TIME
     *
     * @param createTime the value for sys_param.CREATE_TIME
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.MODIFY_USER
     *
     * @return the value of sys_param.MODIFY_USER
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.MODIFY_USER
     *
     * @param modifyUser the value for sys_param.MODIFY_USER
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.MODIFY_USER_IDENTITY
     *
     * @return the value of sys_param.MODIFY_USER_IDENTITY
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for sys_param.MODIFY_USER_IDENTITY
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.MODIFY_TIME
     *
     * @return the value of sys_param.MODIFY_TIME
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.MODIFY_TIME
     *
     * @param modifyTime the value for sys_param.MODIFY_TIME
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.DELETE_FLG
     *
     * @return the value of sys_param.DELETE_FLG
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.DELETE_FLG
     *
     * @param deleteFlg the value for sys_param.DELETE_FLG
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_param.VERSION
     *
     * @return the value of sys_param.VERSION
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_param.VERSION
     *
     * @param version the value for sys_param.VERSION
     * @mbggenerated Mon May 29 16:00:38 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}