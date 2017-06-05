package com.dlfc.agent.service.impl;

import com.dlfc.agent.entity.AgtCertLinkLog;
import com.dlfc.agent.entity.AgtCertLinkLogExample;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.mapper.DataMapper;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("AgtCertLinkLogService")
@Transactional
public class AgtCertLinkLogService implements DataService<AgtCertLinkLog> {

    private AgtCertLinkLogExample example;

    private AgtCertLinkLogExample.Criteria criteria;

    private AgtCertLinkLog entity;

    @Autowired
    private DataMapper<AgtCertLinkLog, AgtCertLinkLogExample> mapper;

    @Override
    public int count() {
        example = new AgtCertLinkLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(AgtCertLinkLog entity,
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
            this.entity = new AgtCertLinkLog();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(AgtCertLinkLog entity,
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
    public AgtCertLinkLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
