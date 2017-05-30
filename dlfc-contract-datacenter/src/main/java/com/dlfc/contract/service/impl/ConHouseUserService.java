package com.dlfc.contract.service.impl;

import com.dlfc.contract.common.PageUtil;
import com.dlfc.contract.entity.ConHouseUser;
import com.dlfc.contract.entity.ConHouseUserExample;
import com.dlfc.contract.entity.UsrUser;
import com.dlfc.contract.mapper.DataMapper;
import com.dlfc.contract.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("ConHouseUserService")
@Transactional
public class ConHouseUserService implements DataService<ConHouseUser> {

    private ConHouseUserExample example;

    private ConHouseUserExample.Criteria criteria;

    private ConHouseUser entity;

    @Autowired
    private DataMapper<ConHouseUser, ConHouseUserExample> mapper;

    @Override
    public int count() {
        example = new ConHouseUserExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(ConHouseUser entity,
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
            this.entity = new ConHouseUser();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(ConHouseUser entity,
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
    public ConHouseUser findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ConHouseUser> findAll(String orderBy,
                                      Integer pageSize,
                                      Integer pageNo) {
        example = new ConHouseUserExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
