package com.dlfc.contract.service.impl;

import com.dlfc.contract.common.PageUtil;
import com.dlfc.contract.entity.ConHouseItems;
import com.dlfc.contract.entity.ConHouseItemsExample;
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

@Service("ConHouseItemsService")
@Transactional
public class ConHouseItemsService implements DataService<ConHouseItems> {

    private ConHouseItemsExample example;

    private ConHouseItemsExample.Criteria criteria;

    private ConHouseItems entity;

    @Autowired
    private DataMapper<ConHouseItems, ConHouseItemsExample> mapper;

    @Override
    public int count() {
        example = new ConHouseItemsExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(ConHouseItems entity,
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
            this.entity = new ConHouseItems();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(ConHouseItems entity,
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
    public ConHouseItems findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ConHouseItems> findAll(String orderBy,
                                       Integer pageSize,
                                       Integer pageNo) {
        example = new ConHouseItemsExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
