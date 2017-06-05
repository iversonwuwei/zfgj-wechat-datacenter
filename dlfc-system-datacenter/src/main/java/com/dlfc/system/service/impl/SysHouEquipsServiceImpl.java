package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysHouEquips;
import com.dlfc.system.entity.SysHouEquipsExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysHouEquipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysHouEquipsService")
@Transactional
public class SysHouEquipsServiceImpl implements SysHouEquipsService {

    private SysHouEquipsExample example;

    private SysHouEquipsExample.Criteria criteria;

    private SysHouEquips entity;

    @Autowired
    private DataMapper<SysHouEquips, SysHouEquipsExample> mapper;

    @Override
    public String save(SysHouEquips entity,
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
            this.entity = new SysHouEquips();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysHouEquips entity,
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
    public SysHouEquips findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysHouEquips> findByLid(String lid) {
        example = new SysHouEquipsExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.selectByExample(example);
    }
}
