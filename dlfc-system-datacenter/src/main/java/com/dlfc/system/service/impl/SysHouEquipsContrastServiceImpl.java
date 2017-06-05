package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysHouEquipsContrast;
import com.dlfc.system.entity.SysHouEquipsContrastExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysHouEquipsContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysHouEquipsContrastService")
@Transactional
public class SysHouEquipsContrastServiceImpl implements SysHouEquipsContrastService {

    private SysHouEquipsContrastExample example;

    private SysHouEquipsContrastExample.Criteria criteria;

    private SysHouEquipsContrast entity;

    @Autowired
    private DataMapper<SysHouEquipsContrast, SysHouEquipsContrastExample> mapper;

    @Override
    public SysHouEquipsContrast findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<SysHouEquipsContrast> findAll() {
        example = new SysHouEquipsContrastExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.selectByExample(example);
    }
}
