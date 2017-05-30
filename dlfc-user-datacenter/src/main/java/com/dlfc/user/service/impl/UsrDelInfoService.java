package com.dlfc.user.service.impl;

import com.dlfc.user.common.PageUtil;
import com.dlfc.user.entity.UsrDelInfo;
import com.dlfc.user.entity.UsrDelInfoExample;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("UsrDelInfoService")
@Transactional
public class UsrDelInfoService implements DataService<UsrDelInfo> {

    private UsrDelInfoExample example;

    private UsrDelInfoExample.Criteria criteria;

    private UsrDelInfo entity;

    @Autowired
    private DataMapper<UsrDelInfo, UsrDelInfoExample> mapper;

    @Override
    public int count() {
        example = new UsrDelInfoExample();
        criteria = example.createCriteria();
//        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(UsrDelInfo entity,
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
//        if (null != user) {
//            this.entity = new UsrDelInfo();
//            this.entity.setId(id);
//            this.entity.setDeleteFlg((short) 1);
//            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
//                return this.entity.getId();
//            }
//        }
        return null;
    }

    @Override
    public String updateById(UsrDelInfo entity,
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
    public UsrDelInfo findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UsrDelInfo> findAll(String orderBy,
                                    Integer pageSize,
                                    Integer pageNo) {
        example = new UsrDelInfoExample();
        criteria = example.createCriteria();
//        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
