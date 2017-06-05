package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysOrder;
import com.dlfc.system.entity.SysOrderExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
