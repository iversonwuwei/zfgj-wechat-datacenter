package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysHouEquipsContrast;
import com.dlfc.system.entity.SysHouEquipsContrastExample;
import com.dlfc.system.entity.UsrUser;
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
    private List<SysHouEquipsContrast> entityList;

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

    @Override
    public SysHouEquipsContrast findByCode(String code) {
        example = new SysHouEquipsContrastExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andCodeEqualTo(code);
        entityList = mapper.selectByExample(example);
        if (null != entityList && entityList.size() == 1) {
            return entityList.get(0);
        }
        return null;
    }

    @Override
    public String save(SysHouEquipsContrast entity,
                       UsrUser user) {
        if (null != entity && null != user) {
            entity.preInsert(user);
            if (mapper.insertSelective(entity) > 0) {
                return entity.getId();
            }
        }
        return null;
    }
}
