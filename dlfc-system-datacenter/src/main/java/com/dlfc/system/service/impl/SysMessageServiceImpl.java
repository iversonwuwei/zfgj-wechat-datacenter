package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysMessage;
import com.dlfc.system.entity.SysMessageExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysMessageService")
@Transactional
public class SysMessageServiceImpl implements SysMessageService {

    private SysMessageExample example;

    private SysMessageExample.Criteria criteria;

    private SysMessage entity;

    @Autowired
    private DataMapper<SysMessage, SysMessageExample> mapper;

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
    public SysMessage findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysMessage> findByUid(String receiverUid) {
        example = new SysMessageExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andReceiverUidEqualTo(receiverUid);
        return mapper.selectByExample(example);
    }
}
