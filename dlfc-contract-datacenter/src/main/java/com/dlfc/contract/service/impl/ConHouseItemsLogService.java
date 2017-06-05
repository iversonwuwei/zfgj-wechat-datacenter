package com.dlfc.contract.service.impl;

import com.dlfc.contract.entity.ConHouseItemsLog;
import com.dlfc.contract.entity.ConHouseItemsLogExample;
import com.dlfc.contract.entity.UsrUser;
import com.dlfc.contract.mapper.DataMapper;
import com.dlfc.contract.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("ConHouseItemsLogService")
@Transactional
public class ConHouseItemsLogService implements DataService<ConHouseItemsLog> {

    private ConHouseItemsLogExample example;

    private ConHouseItemsLogExample.Criteria criteria;

    private ConHouseItemsLog entity;

    @Autowired
    private DataMapper<ConHouseItemsLog, ConHouseItemsLogExample> mapper;

    @Override
    public int count() {
        example = new ConHouseItemsLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(ConHouseItemsLog entity,
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
            this.entity = new ConHouseItemsLog();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(ConHouseItemsLog entity,
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
    public ConHouseItemsLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
