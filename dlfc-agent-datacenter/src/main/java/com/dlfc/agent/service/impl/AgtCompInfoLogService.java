package com.dlfc.agent.service.impl;

import com.dlfc.agent.entity.AgtCompInfoLog;
import com.dlfc.agent.entity.AgtCompInfoLogExample;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.mapper.DataMapper;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("AgtCompInfoLogService")
@Transactional
public class AgtCompInfoLogService implements DataService<AgtCompInfoLog> {

    private AgtCompInfoLogExample example;

    private AgtCompInfoLogExample.Criteria criteria;

    private AgtCompInfoLog entity;

    @Autowired
    private DataMapper<AgtCompInfoLog, AgtCompInfoLogExample> mapper;

    @Override
    public int count() {
        example = new AgtCompInfoLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(AgtCompInfoLog entity,
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
            this.entity = new AgtCompInfoLog();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(AgtCompInfoLog entity,
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
    public AgtCompInfoLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
