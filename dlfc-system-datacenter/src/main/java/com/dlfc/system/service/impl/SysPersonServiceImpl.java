package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysPerson;
import com.dlfc.system.entity.SysPersonExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysPersonService")
@Transactional
public class SysPersonServiceImpl implements SysPersonService {

    private SysPersonExample example;

    private SysPersonExample.Criteria criteria;

    private SysPerson entity;

    @Autowired
    private DataMapper<SysPerson, SysPersonExample> mapper;

    @Override
    public SysPerson findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
