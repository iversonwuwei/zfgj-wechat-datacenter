package com.dlfc.agent.entity;

import com.dlfc.agent.common.DataEntity;

import java.util.Date;

public class AgtUsrCompLogInfo extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.ID
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.PINDEX
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.EID
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String eid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.USER_ID
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.PID
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.OFFICE_ID
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String officeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.COMPANY_ID
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.REJECT_REASON
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String rejectReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.STATUS
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.CREATE_USER
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.CREATE_USER_IDENTITY
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.CREATE_TIME
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.MODIFY_USER
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.MODIFY_TIME
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.DELETE_FLG
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Short deleteFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_usr_comp_log_info.VERSION
     *
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.ID
     *
     * @return the value of agt_usr_comp_log_info.ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.ID
     *
     * @param id the value for agt_usr_comp_log_info.ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.PINDEX
     *
     * @return the value of agt_usr_comp_log_info.PINDEX
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.PINDEX
     *
     * @param pindex the value for agt_usr_comp_log_info.PINDEX
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.EID
     *
     * @return the value of agt_usr_comp_log_info.EID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getEid() {
        return eid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.EID
     *
     * @param eid the value for agt_usr_comp_log_info.EID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setEid(String eid) {
        this.eid = eid == null ? null : eid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.USER_ID
     *
     * @return the value of agt_usr_comp_log_info.USER_ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.USER_ID
     *
     * @param userId the value for agt_usr_comp_log_info.USER_ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.PID
     *
     * @return the value of agt_usr_comp_log_info.PID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.PID
     *
     * @param pid the value for agt_usr_comp_log_info.PID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.OFFICE_ID
     *
     * @return the value of agt_usr_comp_log_info.OFFICE_ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.OFFICE_ID
     *
     * @param officeId the value for agt_usr_comp_log_info.OFFICE_ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId == null ? null : officeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.COMPANY_ID
     *
     * @return the value of agt_usr_comp_log_info.COMPANY_ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.COMPANY_ID
     *
     * @param companyId the value for agt_usr_comp_log_info.COMPANY_ID
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.REJECT_REASON
     *
     * @return the value of agt_usr_comp_log_info.REJECT_REASON
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.REJECT_REASON
     *
     * @param rejectReason the value for agt_usr_comp_log_info.REJECT_REASON
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.STATUS
     *
     * @return the value of agt_usr_comp_log_info.STATUS
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.STATUS
     *
     * @param status the value for agt_usr_comp_log_info.STATUS
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.CREATE_USER
     *
     * @return the value of agt_usr_comp_log_info.CREATE_USER
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.CREATE_USER
     *
     * @param createUser the value for agt_usr_comp_log_info.CREATE_USER
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.CREATE_USER_IDENTITY
     *
     * @return the value of agt_usr_comp_log_info.CREATE_USER_IDENTITY
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for agt_usr_comp_log_info.CREATE_USER_IDENTITY
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.CREATE_TIME
     *
     * @return the value of agt_usr_comp_log_info.CREATE_TIME
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.CREATE_TIME
     *
     * @param createTime the value for agt_usr_comp_log_info.CREATE_TIME
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.MODIFY_USER
     *
     * @return the value of agt_usr_comp_log_info.MODIFY_USER
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.MODIFY_USER
     *
     * @param modifyUser the value for agt_usr_comp_log_info.MODIFY_USER
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.MODIFY_USER_IDENTITY
     *
     * @return the value of agt_usr_comp_log_info.MODIFY_USER_IDENTITY
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for agt_usr_comp_log_info.MODIFY_USER_IDENTITY
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.MODIFY_TIME
     *
     * @return the value of agt_usr_comp_log_info.MODIFY_TIME
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.MODIFY_TIME
     *
     * @param modifyTime the value for agt_usr_comp_log_info.MODIFY_TIME
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.DELETE_FLG
     *
     * @return the value of agt_usr_comp_log_info.DELETE_FLG
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.DELETE_FLG
     *
     * @param deleteFlg the value for agt_usr_comp_log_info.DELETE_FLG
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_usr_comp_log_info.VERSION
     *
     * @return the value of agt_usr_comp_log_info.VERSION
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_usr_comp_log_info.VERSION
     *
     * @param version the value for agt_usr_comp_log_info.VERSION
     * @mbggenerated Tue May 30 09:25:55 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}