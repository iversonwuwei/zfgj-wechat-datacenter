package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysTradeAreas;
import com.dlfc.system.entity.SysTradeAreasExample;
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

@Service("SysTradeAreasService")
@Transactional
public class SysTradeAreasService implements DataService<SysTradeAreas> {

    private SysTradeAreasExample example;

    private SysTradeAreasExample.Criteria criteria;

    private SysTradeAreas entity;

    @Autowired
    private DataMapper<SysTradeAreas, SysTradeAreasExample> mapper;

    @Override
    public int count() {
        example = new SysTradeAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysTradeAreas entity,
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
            this.entity = new SysTradeAreas();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysTradeAreas entity,
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
    public SysTradeAreas findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysTradeAreas> findAll(String orderBy,
                                       Integer pageSize,
                                       Integer pageNo) {
        example = new SysTradeAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }

    public List<SysTradeAreas> findByParentId(String parentId) {
        example = new SysTradeAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andParentIdEqualTo(parentId);
        return mapper.selectByExample(example);
    }
}
