package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysUser;
import com.dlfc.system.entity.SysUserExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysUserService")
@Transactional
public class SysUserServiceImpl implements SysUserService {

    private SysUserExample example;

    private SysUserExample.Criteria criteria;

    private SysUser entity;

    @Autowired
    private DataMapper<SysUser, SysUserExample> mapper;

    @Override
    public SysUser findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
