package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysPermissionScope;
import com.dlfc.system.entity.SysPermissionScopeExample;
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

@Service("SysPermissionScopeService")
@Transactional
public class SysPermissionScopeService implements DataService<SysPermissionScope> {

    private SysPermissionScopeExample example;

    private SysPermissionScopeExample.Criteria criteria;

    private SysPermissionScope entity;

    @Autowired
    private DataMapper<SysPermissionScope, SysPermissionScopeExample> mapper;

    @Override
    public int count() {
        example = new SysPermissionScopeExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysPermissionScope entity,
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
            this.entity = new SysPermissionScope();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysPermissionScope entity,
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
    public SysPermissionScope findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysPermissionScope> findAll(String orderBy,
                                            Integer pageSize,
                                            Integer pageNo) {
        example = new SysPermissionScopeExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
