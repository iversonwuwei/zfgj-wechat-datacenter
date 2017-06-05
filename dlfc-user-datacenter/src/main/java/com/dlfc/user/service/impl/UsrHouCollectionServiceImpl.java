package com.dlfc.user.service.impl;

import com.dlfc.user.entity.UsrHouCollection;
import com.dlfc.user.entity.UsrHouCollectionExample;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.interf.UsrHouCollectionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("UsrHouCollectionService")
@Transactional
public class UsrHouCollectionServiceImpl implements UsrHouCollectionService {

    private UsrHouCollectionExample example;

    private UsrHouCollectionExample.Criteria criteria;

    private UsrHouCollection entity;

    private List<UsrHouCollection> entityList;

    @Autowired
    private DataMapper<UsrHouCollection, UsrHouCollectionExample> mapper;

    @Override
    public String save(UsrHouCollection usrHouCollection,
                       UsrUser user) {
        if (null != user && null != usrHouCollection) {
            usrHouCollection.preInsert(user);
            if (mapper.insertSelective(usrHouCollection) > 0) {
                return usrHouCollection.getId();
            }
        }
        return null;
    }

    @Override
    public String removeById(String id,
                             UsrUser user) {
        if (null != user) {
            entity = new UsrHouCollection();
            entity.setId(id);
            entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(UsrHouCollection usrHouCollection,
                             UsrUser user) {
        if (null != user && null != usrHouCollection) {
            usrHouCollection.preUpdate(user);
            if (mapper.updateByPrimaryKeySelective(usrHouCollection) > 0) {
                return usrHouCollection.getId();
            }
        }
        return null;
    }

    @Override
    public UsrHouCollection findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UsrHouCollection> findByUid(String uid) {
        if (StringUtils.isNotEmpty(uid)) {
            example = new UsrHouCollectionExample();
            criteria = example.createCriteria();
            criteria.andDeleteFlgEqualTo((short) 0);
            criteria.andUidEqualTo(uid);
            return mapper.selectByExample(example);
        }
        return null;
    }

    @Override
    public List<UsrHouCollection> findByUidAndHid(String uid,
                                                  String hid) {
        example = new UsrHouCollectionExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andUidEqualTo(uid);
        criteria.andHidEqualTo(hid);
        return mapper.selectByExample(example);
    }

    @Override
    public boolean saveOrUpdate(UsrHouCollection usrHouCollection,
                                UsrUser user) {
        if (null != user && null != usrHouCollection) {
            entityList = findByUidAndHid(usrHouCollection.getUid(), usrHouCollection.getHid());
            if (null != entityList && entityList.size() == 1) {
                usrHouCollection.setId(entityList.get(0).getId());
                if (null == updateById(usrHouCollection, user)) {
                    return false;
                }
            } else {
                if (null == save(usrHouCollection, user)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean whetherCollected(String uid,
                                    String hid) {
        entityList = findByUidAndHid(uid, hid);
        return null != entityList && entityList.size() > 0;
    }
}
