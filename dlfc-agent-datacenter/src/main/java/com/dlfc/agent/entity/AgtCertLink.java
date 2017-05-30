package com.dlfc.agent.entity;

import com.dlfc.agent.common.DataEntity;

import java.util.Date;

public class AgtCertLink extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.ID
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.PINDEX
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.IS_CERT
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Integer isCert;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.REJECT_TYPE
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Integer rejectType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.REJECT_REASON
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String rejectReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.TO_SPECIAL
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Integer toSpecial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.CERT_CARD_NO
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String certCardNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.CERT_IMG_ID
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String certImgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.PID
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.USER_ID
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.LOCK_USERID
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String lockUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.LOCK_TIME
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Date lockTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.CREATE_USER
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.CREATE_USER_IDENTITY
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.CREATE_TIME
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.MODIFY_USER
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.MODIFY_TIME
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.DELETE_FLG
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Short deleteFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column agt_cert_link.VERSION
     *
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.ID
     *
     * @return the value of agt_cert_link.ID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.ID
     *
     * @param id the value for agt_cert_link.ID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.PINDEX
     *
     * @return the value of agt_cert_link.PINDEX
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.PINDEX
     *
     * @param pindex the value for agt_cert_link.PINDEX
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.IS_CERT
     *
     * @return the value of agt_cert_link.IS_CERT
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Integer getIsCert() {
        return isCert;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.IS_CERT
     *
     * @param isCert the value for agt_cert_link.IS_CERT
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setIsCert(Integer isCert) {
        this.isCert = isCert;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.REJECT_TYPE
     *
     * @return the value of agt_cert_link.REJECT_TYPE
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Integer getRejectType() {
        return rejectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.REJECT_TYPE
     *
     * @param rejectType the value for agt_cert_link.REJECT_TYPE
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setRejectType(Integer rejectType) {
        this.rejectType = rejectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.REJECT_REASON
     *
     * @return the value of agt_cert_link.REJECT_REASON
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.REJECT_REASON
     *
     * @param rejectReason the value for agt_cert_link.REJECT_REASON
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.TO_SPECIAL
     *
     * @return the value of agt_cert_link.TO_SPECIAL
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Integer getToSpecial() {
        return toSpecial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.TO_SPECIAL
     *
     * @param toSpecial the value for agt_cert_link.TO_SPECIAL
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setToSpecial(Integer toSpecial) {
        this.toSpecial = toSpecial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.CERT_CARD_NO
     *
     * @return the value of agt_cert_link.CERT_CARD_NO
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getCertCardNo() {
        return certCardNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.CERT_CARD_NO
     *
     * @param certCardNo the value for agt_cert_link.CERT_CARD_NO
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setCertCardNo(String certCardNo) {
        this.certCardNo = certCardNo == null ? null : certCardNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.CERT_IMG_ID
     *
     * @return the value of agt_cert_link.CERT_IMG_ID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getCertImgId() {
        return certImgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.CERT_IMG_ID
     *
     * @param certImgId the value for agt_cert_link.CERT_IMG_ID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setCertImgId(String certImgId) {
        this.certImgId = certImgId == null ? null : certImgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.PID
     *
     * @return the value of agt_cert_link.PID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.PID
     *
     * @param pid the value for agt_cert_link.PID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.USER_ID
     *
     * @return the value of agt_cert_link.USER_ID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.USER_ID
     *
     * @param userId the value for agt_cert_link.USER_ID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.LOCK_USERID
     *
     * @return the value of agt_cert_link.LOCK_USERID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getLockUserid() {
        return lockUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.LOCK_USERID
     *
     * @param lockUserid the value for agt_cert_link.LOCK_USERID
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setLockUserid(String lockUserid) {
        this.lockUserid = lockUserid == null ? null : lockUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.LOCK_TIME
     *
     * @return the value of agt_cert_link.LOCK_TIME
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Date getLockTime() {
        return lockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.LOCK_TIME
     *
     * @param lockTime the value for agt_cert_link.LOCK_TIME
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.CREATE_USER
     *
     * @return the value of agt_cert_link.CREATE_USER
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.CREATE_USER
     *
     * @param createUser the value for agt_cert_link.CREATE_USER
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.CREATE_USER_IDENTITY
     *
     * @return the value of agt_cert_link.CREATE_USER_IDENTITY
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for agt_cert_link.CREATE_USER_IDENTITY
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.CREATE_TIME
     *
     * @return the value of agt_cert_link.CREATE_TIME
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.CREATE_TIME
     *
     * @param createTime the value for agt_cert_link.CREATE_TIME
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.MODIFY_USER
     *
     * @return the value of agt_cert_link.MODIFY_USER
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.MODIFY_USER
     *
     * @param modifyUser the value for agt_cert_link.MODIFY_USER
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.MODIFY_USER_IDENTITY
     *
     * @return the value of agt_cert_link.MODIFY_USER_IDENTITY
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for agt_cert_link.MODIFY_USER_IDENTITY
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.MODIFY_TIME
     *
     * @return the value of agt_cert_link.MODIFY_TIME
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.MODIFY_TIME
     *
     * @param modifyTime the value for agt_cert_link.MODIFY_TIME
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.DELETE_FLG
     *
     * @return the value of agt_cert_link.DELETE_FLG
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.DELETE_FLG
     *
     * @param deleteFlg the value for agt_cert_link.DELETE_FLG
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column agt_cert_link.VERSION
     *
     * @return the value of agt_cert_link.VERSION
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column agt_cert_link.VERSION
     *
     * @param version the value for agt_cert_link.VERSION
     * @mbggenerated Tue May 30 09:22:44 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}