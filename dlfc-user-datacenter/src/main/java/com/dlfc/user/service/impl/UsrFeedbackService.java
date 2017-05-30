package com.dlfc.user.service.impl;

import com.dlfc.user.common.PageUtil;
import com.dlfc.user.entity.UsrFeedback;
import com.dlfc.user.entity.UsrFeedbackExample;
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

@Service("UsrFeedbackService")
@Transactional
public class UsrFeedbackService implements DataService<UsrFeedback> {

    private UsrFeedbackExample example;

    private UsrFeedbackExample.Criteria criteria;

    private UsrFeedback entity;

    @Autowired
    private DataMapper<UsrFeedback, UsrFeedbackExample> mapper;

    @Override
    public int count() {
        example = new UsrFeedbackExample();
        criteria = example.createCriteria();
//        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(UsrFeedback entity,
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
//            this.entity = new UsrFeedback();
//            this.entity.setId(id);
//            this.entity.setDeleteFlg((short) 1);
//            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
//                return this.entity.getId();
//            }
//        }
        return null;
    }

    @Override
    public String updateById(UsrFeedback entity,
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
    public UsrFeedback findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UsrFeedback> findAll(String orderBy,
                                     Integer pageSize,
                                     Integer pageNo) {
        example = new UsrFeedbackExample();
        criteria = example.createCriteria();
//        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }
}
