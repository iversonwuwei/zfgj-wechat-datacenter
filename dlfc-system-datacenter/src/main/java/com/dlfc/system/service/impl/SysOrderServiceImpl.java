package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysOrder;
import com.dlfc.system.entity.SysOrderExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysOrderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysOrderService")
@Transactional
public class SysOrderServiceImpl implements SysOrderService {

    private SysOrderExample example;

    private SysOrderExample.Criteria criteria;

    private SysOrder entity;

    @Autowired
    private DataMapper<SysOrder, SysOrderExample> mapper;

    @Override
    public String save(SysOrder entity,
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
    public SysOrder findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysOrder> findByUid(String uid) {
        if (StringUtils.isNotEmpty(uid)) {
            example = new SysOrderExample();
            criteria = example.createCriteria();
            criteria.andDeleteFlgEqualTo((short) 0);
            criteria.andUIdEqualTo(uid);
            return mapper.selectByExample(example);
        }
        return null;
    }
}
