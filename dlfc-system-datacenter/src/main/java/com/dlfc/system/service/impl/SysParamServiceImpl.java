package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysParam;
import com.dlfc.system.entity.SysParamExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysParamService")
@Transactional
public class SysParamServiceImpl implements SysParamService {

    private SysParamExample example;

    private SysParamExample.Criteria criteria;

    private SysParam entity;

    @Autowired
    private DataMapper<SysParam, SysParamExample> mapper;

    @Override
    public SysParam findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysParam> findByScope(String scope) {
        example = new SysParamExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andScopeEqualTo(scope);
        return mapper.selectByExample(example);
    }
}
