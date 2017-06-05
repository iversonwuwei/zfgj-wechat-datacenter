package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysAreaAreas;
import com.dlfc.system.entity.SysAreaAreasExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysAreaAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysAreaAreasService")
@Transactional
public class SysAreaAreasServiceImpl implements SysAreaAreasService {

    private SysAreaAreasExample example;

    private SysAreaAreasExample.Criteria criteria;

    private SysAreaAreas entity;

    @Autowired
    private DataMapper<SysAreaAreas, SysAreaAreasExample> mapper;

    @Override
    public SysAreaAreas findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysAreaAreas> findByLid(String cityId) {
        example = new SysAreaAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andCityIdEqualTo(cityId);
        return mapper.selectByExample(example);
    }
}
