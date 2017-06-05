package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysBroadband;
import com.dlfc.system.entity.SysBroadbandExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysBroadbandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/6/5.
 */

@Service("SysBroadbandService")
@Transactional
public class SysBroadbandServiceImpl implements SysBroadbandService {

    private SysBroadbandExample example;

    private SysBroadbandExample.Criteria criteria;

    private SysBroadband entity;

    @Autowired
    private DataMapper<SysBroadband, SysBroadbandExample> mapper;

    @Override
    public SysBroadband findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public String save(SysBroadband sysBroadband,
                       UsrUser user) {
        if (null != user && null != entity) {
            entity.preInsert(user);
            if (mapper.insertSelective(entity) > 0) {
                return entity.getId();
            }
        }
        return null;
    }
}
