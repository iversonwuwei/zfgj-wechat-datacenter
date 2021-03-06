package com.dlfc.system.entity;

import com.dlfc.system.common.DataEntity;

import java.util.Date;

public class SysMessage extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.ID
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.PINDEX
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.RECEIVER_UID
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String receiverUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.RECEIVER_NAME
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String receiverName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.TITLE
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.CONTENT
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.URL
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.STATUS
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Short status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.LINKID
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String linkid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.SYSID
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String sysid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.TYPE
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.MASS_FLG
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Short massFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.SENDER_UID
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String senderUid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.SENDER_NAME
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String senderName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.SEND_TIME
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Date sendTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.CREATE_USER
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.CREATE_USER_IDENTITY
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.CREATE_TIME
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.MODIFY_USER
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.MODIFY_TIME
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.DELETE_FLG
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Short deleteFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_message.VERSION
     *
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.ID
     *
     * @return the value of sys_message.ID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.ID
     *
     * @param id the value for sys_message.ID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.PINDEX
     *
     * @return the value of sys_message.PINDEX
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.PINDEX
     *
     * @param pindex the value for sys_message.PINDEX
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.RECEIVER_UID
     *
     * @return the value of sys_message.RECEIVER_UID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getReceiverUid() {
        return receiverUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.RECEIVER_UID
     *
     * @param receiverUid the value for sys_message.RECEIVER_UID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setReceiverUid(String receiverUid) {
        this.receiverUid = receiverUid == null ? null : receiverUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.RECEIVER_NAME
     *
     * @return the value of sys_message.RECEIVER_NAME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.RECEIVER_NAME
     *
     * @param receiverName the value for sys_message.RECEIVER_NAME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.TITLE
     *
     * @return the value of sys_message.TITLE
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.TITLE
     *
     * @param title the value for sys_message.TITLE
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.CONTENT
     *
     * @return the value of sys_message.CONTENT
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.CONTENT
     *
     * @param content the value for sys_message.CONTENT
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.URL
     *
     * @return the value of sys_message.URL
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.URL
     *
     * @param url the value for sys_message.URL
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.STATUS
     *
     * @return the value of sys_message.STATUS
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Short getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.STATUS
     *
     * @param status the value for sys_message.STATUS
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.LINKID
     *
     * @return the value of sys_message.LINKID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getLinkid() {
        return linkid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.LINKID
     *
     * @param linkid the value for sys_message.LINKID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setLinkid(String linkid) {
        this.linkid = linkid == null ? null : linkid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.SYSID
     *
     * @return the value of sys_message.SYSID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getSysid() {
        return sysid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.SYSID
     *
     * @param sysid the value for sys_message.SYSID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.TYPE
     *
     * @return the value of sys_message.TYPE
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.TYPE
     *
     * @param type the value for sys_message.TYPE
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.MASS_FLG
     *
     * @return the value of sys_message.MASS_FLG
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Short getMassFlg() {
        return massFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.MASS_FLG
     *
     * @param massFlg the value for sys_message.MASS_FLG
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setMassFlg(Short massFlg) {
        this.massFlg = massFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.SENDER_UID
     *
     * @return the value of sys_message.SENDER_UID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getSenderUid() {
        return senderUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.SENDER_UID
     *
     * @param senderUid the value for sys_message.SENDER_UID
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setSenderUid(String senderUid) {
        this.senderUid = senderUid == null ? null : senderUid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.SENDER_NAME
     *
     * @return the value of sys_message.SENDER_NAME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.SENDER_NAME
     *
     * @param senderName the value for sys_message.SENDER_NAME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName == null ? null : senderName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.SEND_TIME
     *
     * @return the value of sys_message.SEND_TIME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.SEND_TIME
     *
     * @param sendTime the value for sys_message.SEND_TIME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.CREATE_USER
     *
     * @return the value of sys_message.CREATE_USER
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.CREATE_USER
     *
     * @param createUser the value for sys_message.CREATE_USER
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.CREATE_USER_IDENTITY
     *
     * @return the value of sys_message.CREATE_USER_IDENTITY
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for sys_message.CREATE_USER_IDENTITY
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.CREATE_TIME
     *
     * @return the value of sys_message.CREATE_TIME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.CREATE_TIME
     *
     * @param createTime the value for sys_message.CREATE_TIME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.MODIFY_USER
     *
     * @return the value of sys_message.MODIFY_USER
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.MODIFY_USER
     *
     * @param modifyUser the value for sys_message.MODIFY_USER
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.MODIFY_USER_IDENTITY
     *
     * @return the value of sys_message.MODIFY_USER_IDENTITY
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for sys_message.MODIFY_USER_IDENTITY
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.MODIFY_TIME
     *
     * @return the value of sys_message.MODIFY_TIME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.MODIFY_TIME
     *
     * @param modifyTime the value for sys_message.MODIFY_TIME
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.DELETE_FLG
     *
     * @return the value of sys_message.DELETE_FLG
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.DELETE_FLG
     *
     * @param deleteFlg the value for sys_message.DELETE_FLG
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_message.VERSION
     *
     * @return the value of sys_message.VERSION
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_message.VERSION
     *
     * @param version the value for sys_message.VERSION
     * @mbggenerated Wed May 31 11:21:28 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}