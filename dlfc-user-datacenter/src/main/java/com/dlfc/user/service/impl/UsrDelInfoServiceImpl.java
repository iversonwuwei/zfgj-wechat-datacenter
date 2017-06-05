package com.dlfc.user.service.impl;

import com.dlfc.user.entity.UsrDelInfo;
import com.dlfc.user.entity.UsrDelInfoExample;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.interf.UsrDelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("UsrDelInfoService")
@Transactional
public class UsrDelInfoServiceImpl implements UsrDelInfoService {

    private UsrDelInfoExample example;

    private UsrDelInfoExample.Criteria criteria;

    @Autowired
    private DataMapper<UsrDelInfo, UsrDelInfoExample> mapper;

    @Override
    public UsrDelInfo findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UsrDelInfo> findByUid(String uid) {
        example = new UsrDelInfoExample();
        criteria = example.createCriteria();
        criteria.andUepIdEqualTo(uid);
        return mapper.selectByExample(example);
    }
}
