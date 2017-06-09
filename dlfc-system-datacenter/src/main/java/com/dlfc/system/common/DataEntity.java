package com.dlfc.system.common;

import com.dlfc.system.entity.UsrUser;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * Created by K on 2017/3/29.
 */

@Component
@Getter
@Setter
public abstract class DataEntity {
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

    public void preInsert(UsrUser user) {
        if (StringUtils.isEmpty(id)) {
            this.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        }

        if (null != user && StringUtils.isNotEmpty(user.getId())) {
            this.setModifyUser(user.getId());
            this.setCreateUser(user.getId());
            this.setModifyUserIdentity(user.getUserIdentity());
            this.setCreateUserIdentity(user.getUserIdentity());
        }
        date = new Date();
        this.setModifyTime(date);
        this.setCreateTime(date);
        this.setVersion(0);
        this.setDeleteFlg((short) 0);
    }

    public void preUpdate(UsrUser user) {
        if (null != user && StringUtils.isNotEmpty(user.getId())) {
            this.setModifyUser(user.getId());
        }
        date = new Date();
        this.setModifyTime(date);
    }
}
