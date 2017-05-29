package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysParam;
import com.dlfc.system.entity.SysParamExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysParamService")
@Transactional
public class SysParamService implements DataService<SysParam> {

    private SysParamExample example;

    private SysParamExample.Criteria criteria;

    private SysParam entity;

    @Autowired
    private DataMapper<SysParam, SysParamExample> mapper;

    @Override
    public int count() {
        example = new SysParamExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysParam entity,
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
            this.entity = new SysParam();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysParam entity,
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
    public SysParam findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysParam> findAll(String orderBy,
                                  Integer pageSize,
                                  Integer pageNo) {
        example = new SysParamExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
