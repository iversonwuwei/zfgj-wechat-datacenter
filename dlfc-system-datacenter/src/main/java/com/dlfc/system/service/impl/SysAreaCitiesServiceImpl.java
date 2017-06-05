package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysAreaCities;
import com.dlfc.system.entity.SysAreaCitiesExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysAreaCitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysAreaCitiesService")
@Transactional
public class SysAreaCitiesServiceImpl implements SysAreaCitiesService {

    private SysAreaCitiesExample example;

    private SysAreaCitiesExample.Criteria criteria;

    private SysAreaCities entity;

    @Autowired
    private DataMapper<SysAreaCities, SysAreaCitiesExample> mapper;

    @Override
    public SysAreaCities findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
