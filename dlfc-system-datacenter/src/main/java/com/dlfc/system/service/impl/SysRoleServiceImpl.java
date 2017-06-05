package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysRole;
import com.dlfc.system.entity.SysRoleExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysRoleService")
@Transactional
public class SysRoleServiceImpl implements SysRoleService {

    private SysRoleExample example;

    private SysRoleExample.Criteria criteria;

    private SysRole entity;

    @Autowired
    private DataMapper<SysRole, SysRoleExample> mapper;

    @Override
    public SysRole findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
