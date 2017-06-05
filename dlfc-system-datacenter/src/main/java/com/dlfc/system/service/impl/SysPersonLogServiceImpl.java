package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysPersonLog;
import com.dlfc.system.entity.SysPersonLogExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysPersonLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysPersonLogService")
@Transactional
public class SysPersonLogServiceImpl implements SysPersonLogService {

    private SysPersonLogExample example;

    private SysPersonLogExample.Criteria criteria;

    private SysPersonLog entity;

    @Autowired
    private DataMapper<SysPersonLog, SysPersonLogExample> mapper;

    @Override
    public SysPersonLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
