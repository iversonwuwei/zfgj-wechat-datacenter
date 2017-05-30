package com.dlfc.agent.service.impl;

import com.dlfc.agent.common.PageUtil;
import com.dlfc.agent.entity.AgtEmpInfo;
import com.dlfc.agent.entity.AgtEmpInfoExample;
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

@Service("AgtEmpInfoService")
@Transactional
public class AgtEmpInfoService implements DataService<AgtEmpInfo> {

    private AgtEmpInfoExample example;

    private AgtEmpInfoExample.Criteria criteria;

    private AgtEmpInfo entity;

    @Autowired
    private DataMapper<AgtEmpInfo, AgtEmpInfoExample> mapper;

    @Override
    public int count() {
        example = new AgtEmpInfoExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(AgtEmpInfo entity,
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
            this.entity = new AgtEmpInfo();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(AgtEmpInfo entity,
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
    public AgtEmpInfo findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AgtEmpInfo> findAll(String orderBy,
                                    Integer pageSize,
                                    Integer pageNo) {
        example = new AgtEmpInfoExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
