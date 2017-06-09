package com.dlfc.user.service.impl;

import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.entity.UsrUserExample;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.interf.UsrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("UsrUserService")
@Transactional
public class UsrUserServiceImpl implements UsrUserService {

    private UsrUserExample example;

    private UsrUserExample.Criteria criteria;

    private List<UsrUser> entityList;

    @Autowired
    private DataMapper<UsrUser, UsrUserExample> mapper;

    @Override
    public UsrUser findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public UsrUser findByUser(String user) {
        example = new UsrUserExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andUsernameEqualTo(user);
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andMobileEqualTo(user);
        example.or(criteria);
        entityList = mapper.selectByExample(example);
        if (null != entityList && entityList.size() > 0) {
            return entityList.get(0);
        }
        return null;
    }

    @Override
    public String save(UsrUser usrUser,
                       UsrUser user) {// 第二个user在注册时不传值
        if (null != usrUser) {
            usrUser.preInsert(usrUser);
            if (mapper.insertSelective(usrUser) > 0) {
                return usrUser.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(UsrUser usrUser,
                             UsrUser user) {// 第二个user在更新时不传值
        if (null != usrUser) {
            usrUser.preUpdate(usrUser);
            if (mapper.updateByPrimaryKey(usrUser) > 0) {
                return usrUser.getId();
            }
        }
        return null;
    }
}
