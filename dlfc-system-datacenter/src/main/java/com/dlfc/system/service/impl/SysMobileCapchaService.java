package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysMobileCapcha;
import com.dlfc.system.entity.SysMobileCapchaExample;
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

@Service("SysMobileCapchaService")
@Transactional
public class SysMobileCapchaService implements DataService<SysMobileCapcha> {

    private SysMobileCapchaExample example;

    private SysMobileCapchaExample.Criteria criteria;

    private SysMobileCapcha entity;

    @Autowired
    private DataMapper<SysMobileCapcha, SysMobileCapchaExample> mapper;

    @Override
    public int count() {
        example = new SysMobileCapchaExample();
        criteria = example.createCriteria();
//        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysMobileCapcha entity,
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
//        if (null != user) {
//            this.entity = new SysMobileCapcha();
//            this.entity.setId(id);
//            this.entity.setDeleteFlg((short) 1);
//            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
//                return this.entity.getId();
//            }
//        }
        return null;
    }

    @Override
    public String updateById(SysMobileCapcha entity,
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
    public SysMobileCapcha findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysMobileCapcha> findAll(String orderBy,
                                         Integer pageSize,
                                         Integer pageNo) {
        example = new SysMobileCapchaExample();
        criteria = example.createCriteria();
//        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
