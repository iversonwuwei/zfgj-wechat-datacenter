package com.dlfc.agent.service.impl;

import com.dlfc.agent.common.PageUtil;
import com.dlfc.agent.entity.AgtEmpInfoLog;
import com.dlfc.agent.entity.AgtEmpInfoLogExample;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.mapper.DataMapper;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("AgtEmpInfoLogService")
@Transactional
public class AgtEmpInfoLogService implements DataService<AgtEmpInfoLog> {

    private AgtEmpInfoLogExample example;

    private AgtEmpInfoLogExample.Criteria criteria;

    private AgtEmpInfoLog entity;

    @Autowired
    private DataMapper<AgtEmpInfoLog, AgtEmpInfoLogExample> mapper;

    @Override
    public int count() {
        example = new AgtEmpInfoLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(AgtEmpInfoLog entity,
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
            this.entity = new AgtEmpInfoLog();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(AgtEmpInfoLog entity,
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
    public AgtEmpInfoLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AgtEmpInfoLog> findAll(String orderBy,
                                       Integer pageSize,
                                       Integer pageNo) {
        example = new AgtEmpInfoLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
