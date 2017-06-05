package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysSurFacisContrast;
import com.dlfc.system.entity.SysSurFacisContrastExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysSurFacisContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysSurFacisContrastService")
@Transactional
public class SysSurFacisContrastServiceImpl implements SysSurFacisContrastService {

    private SysSurFacisContrastExample example;

    private SysSurFacisContrastExample.Criteria criteria;

    private SysSurFacisContrast entity;

    @Autowired
    private DataMapper<SysSurFacisContrast, SysSurFacisContrastExample> mapper;

    @Override
    public SysSurFacisContrast findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysSurFacisContrast> findAll() {
        example = new SysSurFacisContrastExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.selectByExample(example);
    }
}
