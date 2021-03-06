package com.dlfc.contract.entity;

import com.dlfc.contract.common.DataEntity;

import java.math.BigDecimal;
import java.util.Date;

public class ConOtherCosts extends DataEntity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.ID
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.PINDEX
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Integer pindex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.CID
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String cid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.ITEM
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String item;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.UNIT
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.PRICE
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.STIME
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Date stime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.SCOUNT
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String scount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.CREATE_USER
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String createUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.CREATE_USER_IDENTITY
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Short createUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.CREATE_TIME
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.MODIFY_USER
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private String modifyUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.MODIFY_USER_IDENTITY
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Short modifyUserIdentity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.MODIFY_TIME
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.DELETE_FLG
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Short deleteFlg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column con_other_costs.VERSION
     *
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.ID
     *
     * @return the value of con_other_costs.ID
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.ID
     *
     * @param id the value for con_other_costs.ID
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.PINDEX
     *
     * @return the value of con_other_costs.PINDEX
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Integer getPindex() {
        return pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.PINDEX
     *
     * @param pindex the value for con_other_costs.PINDEX
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setPindex(Integer pindex) {
        this.pindex = pindex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.CID
     *
     * @return the value of con_other_costs.CID
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.CID
     *
     * @param cid the value for con_other_costs.CID
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.ITEM
     *
     * @return the value of con_other_costs.ITEM
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getItem() {
        return item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.ITEM
     *
     * @param item the value for con_other_costs.ITEM
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.UNIT
     *
     * @return the value of con_other_costs.UNIT
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.UNIT
     *
     * @param unit the value for con_other_costs.UNIT
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.PRICE
     *
     * @return the value of con_other_costs.PRICE
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.PRICE
     *
     * @param price the value for con_other_costs.PRICE
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.STIME
     *
     * @return the value of con_other_costs.STIME
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Date getStime() {
        return stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.STIME
     *
     * @param stime the value for con_other_costs.STIME
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setStime(Date stime) {
        this.stime = stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.SCOUNT
     *
     * @return the value of con_other_costs.SCOUNT
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getScount() {
        return scount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.SCOUNT
     *
     * @param scount the value for con_other_costs.SCOUNT
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setScount(String scount) {
        this.scount = scount == null ? null : scount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.CREATE_USER
     *
     * @return the value of con_other_costs.CREATE_USER
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.CREATE_USER
     *
     * @param createUser the value for con_other_costs.CREATE_USER
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.CREATE_USER_IDENTITY
     *
     * @return the value of con_other_costs.CREATE_USER_IDENTITY
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Short getCreateUserIdentity() {
        return createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.CREATE_USER_IDENTITY
     *
     * @param createUserIdentity the value for con_other_costs.CREATE_USER_IDENTITY
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setCreateUserIdentity(Short createUserIdentity) {
        this.createUserIdentity = createUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.CREATE_TIME
     *
     * @return the value of con_other_costs.CREATE_TIME
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.CREATE_TIME
     *
     * @param createTime the value for con_other_costs.CREATE_TIME
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.MODIFY_USER
     *
     * @return the value of con_other_costs.MODIFY_USER
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.MODIFY_USER
     *
     * @param modifyUser the value for con_other_costs.MODIFY_USER
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.MODIFY_USER_IDENTITY
     *
     * @return the value of con_other_costs.MODIFY_USER_IDENTITY
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Short getModifyUserIdentity() {
        return modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.MODIFY_USER_IDENTITY
     *
     * @param modifyUserIdentity the value for con_other_costs.MODIFY_USER_IDENTITY
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setModifyUserIdentity(Short modifyUserIdentity) {
        this.modifyUserIdentity = modifyUserIdentity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.MODIFY_TIME
     *
     * @return the value of con_other_costs.MODIFY_TIME
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.MODIFY_TIME
     *
     * @param modifyTime the value for con_other_costs.MODIFY_TIME
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.DELETE_FLG
     *
     * @return the value of con_other_costs.DELETE_FLG
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Short getDeleteFlg() {
        return deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.DELETE_FLG
     *
     * @param deleteFlg the value for con_other_costs.DELETE_FLG
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column con_other_costs.VERSION
     *
     * @return the value of con_other_costs.VERSION
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column con_other_costs.VERSION
     *
     * @param version the value for con_other_costs.VERSION
     * @mbggenerated Tue May 30 10:10:36 CST 2017
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}