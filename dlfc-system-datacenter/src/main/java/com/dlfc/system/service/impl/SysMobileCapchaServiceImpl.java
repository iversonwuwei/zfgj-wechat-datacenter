package com.dlfc.system.service.impl;

import com.dlfc.admin.common.utils.DateUtils;
import com.dlfc.system.entity.SysMobileCapcha;
import com.dlfc.system.entity.SysMobileCapchaExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysMobileCapchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysMobileCapchaService")
@Transactional
public class SysMobileCapchaServiceImpl implements SysMobileCapchaService {

    private SysMobileCapchaExample example;

    private SysMobileCapchaExample.Criteria criteria;

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

    @Override
    public List<SysMobileCapcha> findByMobileAndDomain(String mobile,
                                                       String domain) {
        example = new SysMobileCapchaExample();
        criteria = example.createCriteria();
        criteria.andMobileEqualTo(mobile);
        criteria.andDomainEqualTo(domain);
        criteria.andCreateTimeGreaterThan(DateUtils.getStartDate(DateUtils.getSynchTime()));
        return mapper.selectByExample(example);
    }

    @Override
    public List<SysMobileCapcha> findByParams(SysMobileCapcha entity) {
        example = new SysMobileCapchaExample();
        criteria = example.createCriteria();
        criteria.andDomainEqualTo(entity.getDomain());
        criteria.andMobileEqualTo(entity.getMobile());
        criteria.andVerCodeEqualTo(entity.getVerCode());
        criteria.andDomainEqualTo(entity.getDomain());
        return mapper.selectByExample(example);
    }
}
