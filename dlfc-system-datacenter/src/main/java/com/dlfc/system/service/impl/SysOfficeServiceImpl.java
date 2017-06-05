package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysOffice;
import com.dlfc.system.entity.SysOfficeExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysOfficeService")
@Transactional
public class SysOfficeServiceImpl implements SysOfficeService {

    private SysOfficeExample example;

    private SysOfficeExample.Criteria criteria;

    private SysOffice entity;

    @Autowired
    private DataMapper<SysOffice, SysOfficeExample> mapper;

    @Override
    public SysOffice findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
