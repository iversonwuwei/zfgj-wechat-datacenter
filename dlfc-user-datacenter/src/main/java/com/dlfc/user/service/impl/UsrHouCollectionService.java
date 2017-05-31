package com.dlfc.user.service.impl;

import com.dlfc.user.common.PageUtil;
import com.dlfc.user.entity.UsrHouCollection;
import com.dlfc.user.entity.UsrHouCollectionExample;
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

@Service("UsrHouCollectionService")
@Transactional
public class UsrHouCollectionService implements DataService<UsrHouCollection> {

    private UsrHouCollectionExample example;

    private UsrHouCollectionExample.Criteria criteria;

    private UsrHouCollection entity;

    private List<UsrHouCollection> entityList;

    @Autowired
    private DataMapper<UsrHouCollection, UsrHouCollectionExample> mapper;

    @Override
    public int count() {
        example = new UsrHouCollectionExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(UsrHouCollection entity,
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
            this.entity = new UsrHouCollection();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(UsrHouCollection entity,
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
    public UsrHouCollection findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UsrHouCollection> findAll(String orderBy,
                                          Integer pageSize,
                                          Integer pageNo) {
        example = new UsrHouCollectionExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }

    public List<UsrHouCollection> findAllByUid(String uid) {
        if (null != entity) {
            example = new UsrHouCollectionExample();
            criteria = example.createCriteria();
            criteria.andDeleteFlgEqualTo((short) 0);
            criteria.andUidEqualTo(uid);
            return mapper.selectByExample(example);
        }
        return null;
    }

    public boolean saveOrUpdate(UsrHouCollection entity,
                                UsrUser user) {
        if (null != user && null != entity) {
            example = new UsrHouCollectionExample();
            criteria = example.createCriteria();
            criteria.andDeleteFlgEqualTo((short) 0);
            criteria.andUidEqualTo(entity.getUid());
            criteria.andHidEqualTo(entity.getHid());
            entityList = mapper.selectByExample(example);
            if (null != entityList && entityList.size() == 1) {
                if (null == removeById(entityList.get(0).getId(), user)) {
                    return false;
                }
            } else {
                if (null == save(entity, user)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
