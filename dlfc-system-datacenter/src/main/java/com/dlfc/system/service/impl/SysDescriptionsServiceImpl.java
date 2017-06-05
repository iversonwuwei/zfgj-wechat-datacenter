package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysDescriptions;
import com.dlfc.system.entity.SysDescriptionsExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysDescriptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysDescriptionsService")
@Transactional
public class SysDescriptionsServiceImpl implements SysDescriptionsService {

    private SysDescriptionsExample example;

    private SysDescriptionsExample.Criteria criteria;

    private SysDescriptions entity;

    @Autowired
    private DataMapper<SysDescriptions, SysDescriptionsExample> mapper;

    @Override
    public String save(SysDescriptions entity,
                       UsrUser user) {
        if (null != user && null != entity) {
            entity.preInsert(user);
            if (mapper.insertSelective(entity) > 0) {
                return entity.getId();
            }
        }
        return null;
    }

    @Override
    public String removeById(String id,
                             UsrUser user) {
        if (null != user) {
            this.entity = new SysDescriptions();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysDescriptions entity,
                             UsrUser user) {
        if (null != user && null != entity) {
            entity.preUpdate(user);
            if (mapper.updateByPrimaryKeySelective(entity) > 0) {
                return entity.getId();
            }
        }
        return null;
    }

    @Override
    public SysDescriptions findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysDescriptions> findByLid(String lid) {
        example = new SysDescriptionsExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andLidEqualTo(lid);
        return mapper.selectByExample(example);
    }
}
