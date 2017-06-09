package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysSurFacis;
import com.dlfc.system.entity.SysSurFacisExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysSurFacisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysSurFacisService")
@Transactional
public class SysSurFacisServiceImpl implements SysSurFacisService {

    private SysSurFacisExample example;

    private SysSurFacisExample.Criteria criteria;

    private SysSurFacis entity;

    private List<SysSurFacis> entityList;

    @Autowired
    private DataMapper<SysSurFacis, SysSurFacisExample> mapper;

    @Override
    public String save(SysSurFacis entity,
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
            this.entity = new SysSurFacis();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysSurFacis entity,
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
    public SysSurFacis findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysSurFacis> findByLid(String lid) {
        example = new SysSurFacisExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andLidEqualTo(lid);
        return mapper.selectByExample(example);
    }
}
