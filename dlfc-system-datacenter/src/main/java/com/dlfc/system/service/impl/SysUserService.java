package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysUser;
import com.dlfc.system.entity.SysUserExample;
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

@Service("SysUserService")
@Transactional
public class SysUserService implements DataService<SysUser> {

    private SysUserExample example;

    private SysUserExample.Criteria criteria;

    private SysUser entity;

    @Autowired
    private DataMapper<SysUser, SysUserExample> mapper;

    @Override
    public int count() {
        example = new SysUserExample();
        criteria = example.createCriteria();
        criteria.andDelFlagEqualTo("0");
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysUser entity,
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
            this.entity = new SysUser();
            this.entity.setId(id);
            this.entity.setDelFlag("1");
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysUser entity,
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
    public SysUser findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysUser> findAll(String orderBy,
                                 Integer pageSize,
                                 Integer pageNo) {
        example = new SysUserExample();
        criteria = example.createCriteria();
        criteria.andDelFlagEqualTo("0");
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
