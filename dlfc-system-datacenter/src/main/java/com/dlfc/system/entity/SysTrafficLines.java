package com.dlfc.system.entity;

import com.dlfc.system.common.DataEntity;

import java.util.Date;

public class SysTrafficLines extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.ID
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.PINDEX
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.LID
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private String lid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.TRAFFIC_LINE
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private String trafficLine;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.OTHERS
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private String others;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.CREATE_USER
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.CREATE_USER_IDENTITY
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.CREATE_TIME
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.MODIFY_TIME
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.CREATE_USER_copy1
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private String createUserCopy1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_traffic_lines.DELETE_FLG
     *
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    private Short deleteFlg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.ID
     *
     * @return the value of sys_traffic_lines.ID
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.ID
     *
     * @param id the value for sys_traffic_lines.ID
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.PINDEX
     *
     * @return the value of sys_traffic_lines.PINDEX
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.PINDEX
     *
     * @param pindex the value for sys_traffic_lines.PINDEX
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.LID
     *
     * @return the value of sys_traffic_lines.LID
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public String getLid() {
        return lid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.LID
     *
     * @param lid the value for sys_traffic_lines.LID
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setLid(String lid) {
        this.lid = lid == null ? null : lid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.TRAFFIC_LINE
     *
     * @return the value of sys_traffic_lines.TRAFFIC_LINE
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public String getTrafficLine() {
        return trafficLine;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.TRAFFIC_LINE
     *
     * @param trafficLine the value for sys_traffic_lines.TRAFFIC_LINE
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setTrafficLine(String trafficLine) {
        this.trafficLine = trafficLine == null ? null : trafficLine.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.OTHERS
     *
     * @return the value of sys_traffic_lines.OTHERS
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public String getOthers() {
        return others;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.OTHERS
     *
     * @param others the value for sys_traffic_lines.OTHERS
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.CREATE_USER
     *
     * @return the value of sys_traffic_lines.CREATE_USER
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.CREATE_USER
     *
     * @param createUser the value for sys_traffic_lines.CREATE_USER
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.CREATE_USER_IDENTITY
     *
     * @return the value of sys_traffic_lines.CREATE_USER_IDENTITY
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for sys_traffic_lines.CREATE_USER_IDENTITY
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.CREATE_TIME
     *
     * @return the value of sys_traffic_lines.CREATE_TIME
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.CREATE_TIME
     *
     * @param createTime the value for sys_traffic_lines.CREATE_TIME
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.MODIFY_USER_IDENTITY
     *
     * @return the value of sys_traffic_lines.MODIFY_USER_IDENTITY
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for sys_traffic_lines.MODIFY_USER_IDENTITY
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.MODIFY_TIME
     *
     * @return the value of sys_traffic_lines.MODIFY_TIME
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.MODIFY_TIME
     *
     * @param modifyTime the value for sys_traffic_lines.MODIFY_TIME
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.CREATE_USER_copy1
     *
     * @return the value of sys_traffic_lines.CREATE_USER_copy1
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public String getCreateUserCopy1() {
        return createUserCopy1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.CREATE_USER_copy1
     *
     * @param createUserCopy1 the value for sys_traffic_lines.CREATE_USER_copy1
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setCreateUserCopy1(String createUserCopy1) {
        this.createUserCopy1 = createUserCopy1 == null ? null : createUserCopy1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_traffic_lines.DELETE_FLG
     *
     * @return the value of sys_traffic_lines.DELETE_FLG
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_traffic_lines.DELETE_FLG
     *
     * @param deleteFlg the value for sys_traffic_lines.DELETE_FLG
     * @mbggenerated Wed Jun 07 14:40:58 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}