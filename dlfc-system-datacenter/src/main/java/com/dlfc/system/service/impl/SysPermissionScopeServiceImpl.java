package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysPermissionScope;
import com.dlfc.system.entity.SysPermissionScopeExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysPermissionScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysPermissionScopeService")
@Transactional
public class SysPermissionScopeServiceImpl implements SysPermissionScopeService {

    private SysPermissionScopeExample example;

    private SysPermissionScopeExample.Criteria criteria;

    private SysPermissionScope entity;

    @Autowired
    private DataMapper<SysPermissionScope, SysPermissionScopeExample> mapper;

    @Override
    public SysPermissionScope findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
