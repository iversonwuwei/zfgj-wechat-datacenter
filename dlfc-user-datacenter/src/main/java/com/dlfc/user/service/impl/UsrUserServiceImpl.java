package com.dlfc.user.service.impl;

import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.entity.UsrUserExample;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.interf.UsrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("UsrUserService")
@Transactional
public class UsrUserServiceImpl implements UsrUserService {

    private UsrUserExample example;

    private UsrUserExample.Criteria criteria;

    private UsrUser entity;

    @Autowired
    private DataMapper<UsrUser, UsrUserExample> mapper;

    @Override
    public UsrUser findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
