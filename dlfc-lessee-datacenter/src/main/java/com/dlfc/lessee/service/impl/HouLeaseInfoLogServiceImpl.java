package com.dlfc.lessee.service.impl;

import com.dlfc.lessee.entity.HouLeaseInfoLog;
import com.dlfc.lessee.entity.HouLeaseInfoLogExample;
import com.dlfc.lessee.mapper.DataMapper;
import com.dlfc.lessee.service.interf.HouLeaseInfoLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("HouLeaseInfoLogService")
@Transactional
public class HouLeaseInfoLogServiceImpl implements HouLeaseInfoLogService {

    private HouLeaseInfoLogExample example;

    private HouLeaseInfoLogExample.Criteria criteria;

    private HouLeaseInfoLog entity;

    @Autowired
    private DataMapper<HouLeaseInfoLog, HouLeaseInfoLogExample> mapper;

    @Override
    public HouLeaseInfoLog findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }
}
