package com.dlfc.agent.common;

import com.dlfc.agent.entity.UsrUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * Created by K on 2017/3/29.
 */

@Component
public class DataEntity {
    protected String id;
    protected String createUser;
    protected Short createUserIdentity;
    protected Date createTime;
    protected String modifyUser;
    protected Short modifyUserIdentity;
    protected Date modifyTime;
    protected Short deleteFlg;
    protected Integer version;
    protected Date date;

    protected String delFlag;

    public DataEntity() {
        this.deleteFlg = 0;
        this.delFlag = "0";
    }

    public void preInsert(UsrUser user) {
        if (StringUtils.isEmpty(id)) {
            this.id = UUID.randomUUID().toString().replaceAll("-", "");
        }

        if (null != user && StringUtils.isNotEmpty(user.getId())) {
            this.modifyUser = user.getId();
            this.createUser = user.getId();
            this.modifyUserIdentity = user.getUserIdentity();
            this.createUserIdentity = user.getUserIdentity();
        }
        date = new Date();
        this.modifyTime = date;
        this.createTime = this.date;
        this.version = 0;
        this.deleteFlg = 0;
    }

    public void preUpdate(UsrUser user) {
        if (null != user && StringUtils.isNotEmpty(user.getId())) {
            this.modifyUser = user.getId();
        }
        date = new Date();
        this.modifyTime = date;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDeleteFlg(Short deleteFlg) {
        this.deleteFlg = deleteFlg;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }
}
