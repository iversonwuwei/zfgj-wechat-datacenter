package com.dlfc.agent.service.impl;

import com.dlfc.agent.entity.AgtCertLink;
import com.dlfc.agent.entity.AgtCertLinkExample;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.mapper.DataMapper;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("AgtCertLinkService")
@Transactional
public class AgtCertLinkService implements DataService<AgtCertLink> {

    private AgtCertLinkExample example;

    private AgtCertLinkExample.Criteria criteria;

    private AgtCertLink entity;

    @Autowired
    private DataMapper<AgtCertLink, AgtCertLinkExample> mapper;

    @Override
    public int count() {
        example = new AgtCertLinkExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(AgtCertLink entity,
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
            this.entity = new AgtCertLink();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(AgtCertLink entity,
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
    public AgtCertLink findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
