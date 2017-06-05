package com.dlfc.agent.service.impl;

import com.dlfc.agent.entity.AgtCompInfo;
import com.dlfc.agent.entity.AgtCompInfoExample;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.mapper.DataMapper;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("AgtCompInfoService")
@Transactional
public class AgtCompInfoService implements DataService<AgtCompInfo> {

    private AgtCompInfoExample example;

    private AgtCompInfoExample.Criteria criteria;

    private AgtCompInfo entity;

    @Autowired
    private DataMapper<AgtCompInfo, AgtCompInfoExample> mapper;

    @Override
    public int count() {
        example = new AgtCompInfoExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(AgtCompInfo entity,
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
            this.entity = new AgtCompInfo();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(AgtCompInfo entity,
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
    public AgtCompInfo findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
