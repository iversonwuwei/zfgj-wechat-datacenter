package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysCode;
import com.dlfc.system.entity.SysCodeExample;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysCodeService")
@Transactional
public class SysCodeServiceImpl implements SysCodeService {

    private SysCodeExample example;

    private SysCodeExample.Criteria criteria;

    private List<SysCode> entityList;

    @Autowired
    private DataMapper<SysCode, SysCodeExample> mapper;

    @Override
    public SysCode findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysCode> findByType(String type) {
        example = new SysCodeExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andTypeEqualTo(type);
        return mapper.selectByExample(example);
    }

    @Override
    public SysCode findByTypeAndCode(String type,
                                     String code) {
        example = new SysCodeExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andTypeEqualTo(type);
        criteria.andCodeEqualTo(code);
        entityList = mapper.selectByExample(example);
        if (null != entityList && entityList.size() == 1) {
            return entityList.get(0);
        }
        return null;
    }
}
