package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysTrafficLines;
import com.dlfc.system.entity.SysTrafficLinesExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysTrafficLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysTrafficLinesService")
@Transactional
public class SysTrafficLinesServiceImpl implements SysTrafficLinesService {

    private SysTrafficLinesExample example;

    private SysTrafficLinesExample.Criteria criteria;

    private SysTrafficLines entity;

    @Autowired
    private DataMapper<SysTrafficLines, SysTrafficLinesExample> mapper;

    @Override
    public String save(SysTrafficLines entity,
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
            this.entity = new SysTrafficLines();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysTrafficLines entity,
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
    public SysTrafficLines findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysTrafficLines> findByLid(String lid) {
        example = new SysTrafficLinesExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andLidEqualTo(lid);
        return mapper.selectByExample(example);
    }
}
