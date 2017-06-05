package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysMobileCapcha;
import com.dlfc.system.entity.SysMobileCapchaExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysMobileCapchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysMobileCapchaService")
@Transactional
public class SysMobileCapchaServiceImpl implements SysMobileCapchaService {

    private SysMobileCapchaExample example;

    private SysMobileCapchaExample.Criteria criteria;

    private SysMobileCapcha entity;

    @Autowired
    private DataMapper<SysMobileCapcha, SysMobileCapchaExample> mapper;

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
    public SysMobileCapcha findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
