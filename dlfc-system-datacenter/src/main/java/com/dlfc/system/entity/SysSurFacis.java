package com.dlfc.system.entity;

import com.dlfc.system.common.DataEntity;

import java.util.Date;

public class SysSurFacis extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.ID
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.PINDEX
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.LID
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String lid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.FACILITY_CODE
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String facilityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.FACILITY_NAME
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String facilityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.OTHERS
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String others;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.CREATE_USER
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.CREATE_USER_IDENTITY
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.CREATE_TIME
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.MODIFY_TIME
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.CREATE_USER_copy1
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private String createUserCopy1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sur_facis.DELETE_FLG
     *
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    private Short deleteFlg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.ID
     *
     * @return the value of sys_sur_facis.ID
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.ID
     *
     * @param id the value for sys_sur_facis.ID
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.PINDEX
     *
     * @return the value of sys_sur_facis.PINDEX
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.PINDEX
     *
     * @param pindex the value for sys_sur_facis.PINDEX
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.LID
     *
     * @return the value of sys_sur_facis.LID
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.LID
     *
     * @param lid the value for sys_sur_facis.LID
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setLid(String lid) {
        this.lid = lid == null ? null : lid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.FACILITY_CODE
     *
     * @return the value of sys_sur_facis.FACILITY_CODE
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.FACILITY_CODE
     *
     * @param facilityCode the value for sys_sur_facis.FACILITY_CODE
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode == null ? null : facilityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.FACILITY_NAME
     *
     * @return the value of sys_sur_facis.FACILITY_NAME
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.FACILITY_NAME
     *
     * @param facilityName the value for sys_sur_facis.FACILITY_NAME
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName == null ? null : facilityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.OTHERS
     *
     * @return the value of sys_sur_facis.OTHERS
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getOthers() {
        return others;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.OTHERS
     *
     * @param others the value for sys_sur_facis.OTHERS
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.CREATE_USER
     *
     * @return the value of sys_sur_facis.CREATE_USER
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.CREATE_USER
     *
     * @param createUser the value for sys_sur_facis.CREATE_USER
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.CREATE_USER_IDENTITY
     *
     * @return the value of sys_sur_facis.CREATE_USER_IDENTITY
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for sys_sur_facis.CREATE_USER_IDENTITY
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.CREATE_TIME
     *
     * @return the value of sys_sur_facis.CREATE_TIME
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.CREATE_TIME
     *
     * @param createTime the value for sys_sur_facis.CREATE_TIME
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.MODIFY_USER_IDENTITY
     *
     * @return the value of sys_sur_facis.MODIFY_USER_IDENTITY
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for sys_sur_facis.MODIFY_USER_IDENTITY
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.MODIFY_TIME
     *
     * @return the value of sys_sur_facis.MODIFY_TIME
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.MODIFY_TIME
     *
     * @param modifyTime the value for sys_sur_facis.MODIFY_TIME
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.CREATE_USER_copy1
     *
     * @return the value of sys_sur_facis.CREATE_USER_copy1
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public String getCreateUserCopy1() {
        return createUserCopy1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.CREATE_USER_copy1
     *
     * @param createUserCopy1 the value for sys_sur_facis.CREATE_USER_copy1
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setCreateUserCopy1(String createUserCopy1) {
        this.createUserCopy1 = createUserCopy1 == null ? null : createUserCopy1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sur_facis.DELETE_FLG
     *
     * @return the value of sys_sur_facis.DELETE_FLG
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sur_facis.DELETE_FLG
     *
     * @param deleteFlg the value for sys_sur_facis.DELETE_FLG
     * @mbggenerated Tue Jun 06 19:56:37 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}