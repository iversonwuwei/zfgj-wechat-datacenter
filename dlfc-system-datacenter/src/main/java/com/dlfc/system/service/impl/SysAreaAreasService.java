package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysAreaAreas;
import com.dlfc.system.entity.SysAreaAreasExample;
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

@Service("SysAreaAreasService")
@Transactional
public class SysAreaAreasService implements DataService<SysAreaAreas> {

    private SysAreaAreasExample example;

    private SysAreaAreasExample.Criteria criteria;

    private SysAreaAreas entity;

    @Autowired
    private DataMapper<SysAreaAreas, SysAreaAreasExample> mapper;

    @Override
    public int count() {
        example = new SysAreaAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysAreaAreas entity,
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
            this.entity = new SysAreaAreas();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysAreaAreas entity,
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
    public SysAreaAreas findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysAreaAreas> findAll(String orderBy,
                                      Integer pageSize,
                                      Integer pageNo) {
        example = new SysAreaAreasExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
