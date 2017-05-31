package com.dlfc.system.service.impl;

import com.dlfc.system.common.PageUtil;
import com.dlfc.system.entity.SysMessage;
import com.dlfc.system.entity.SysMessageExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysMessageService")
@Transactional
public class SysMessageService implements DataService<SysMessage> {

    private SysMessageExample example;

    private SysMessageExample.Criteria criteria;

    private SysMessage entity;

    @Autowired
    private DataMapper<SysMessage, SysMessageExample> mapper;

    @Override
    public int count() {
        example = new SysMessageExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.countByExample(example);
    }

    @Override
    public String save(SysMessage entity,
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
            this.entity = new SysMessage();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 0);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(SysMessage entity,
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
    public SysMessage findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysMessage> findAll(String orderBy,
                                    Integer pageSize,
                                    Integer pageNo) {
        example = new SysMessageExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }

    public List<SysMessage> findByReceiverUid(String receiverUid) {
        example = new SysMessageExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andReceiverUidEqualTo(receiverUid);
        return mapper.selectByExample(example);
    }
}
