package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysTradeAreas;
import com.dlfc.system.entity.SysTradeAreasExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysTradeAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysTradeAreasService")
@Transactional
public class SysTradeAreasServiceImpl implements SysTradeAreasService {

    private SysTradeAreasExample example;

    private SysTradeAreasExample.Criteria criteria;

    private SysTradeAreas entity;

    @Autowired
    private DataMapper<SysTradeAreas, SysTradeAreasExample> mapper;

    @Override
    public SysTradeAreas findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysTradeAreas> findByLid(String parentId) {
        example = new SysTradeAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andParentIdEqualTo(parentId);
        return mapper.selectByExample(example);
    }

    @Override
    public List<SysTradeAreas> findAll() {
        example = new SysTradeAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.selectByExample(example);
    }
}
