package com.dlfc.lessee.service.impl;

import com.dlfc.lessee.common.PageUtil;
import com.dlfc.lessee.entity.HouLeaseInfoLog;
import com.dlfc.lessee.entity.HouLeaseInfoLogExample;
import com.dlfc.lessee.entity.UsrUser;
import com.dlfc.lessee.mapper.DataMapper;
import com.dlfc.lessee.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("HouLeaseInfoLogService")
@Transactional
public class HouLeaseInfoLogService implements DataService<HouLeaseInfoLog> {

    private HouLeaseInfoLogExample example;

    private HouLeaseInfoLogExample.Criteria criteria;

    private HouLeaseInfoLog entity;

    @Autowired
    private DataMapper<HouLeaseInfoLog, HouLeaseInfoLogExample> mapper;

    @Override
    public int count() {
        example = new HouLeaseInfoLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(HouLeaseInfoLog entity,
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
            this.entity = new HouLeaseInfoLog();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(HouLeaseInfoLog entity,
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
    public HouLeaseInfoLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HouLeaseInfoLog> findAll(String orderBy,
                                         Integer pageSize,
                                         Integer pageNo) {
        example = new HouLeaseInfoLogExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
