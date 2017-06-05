package com.dlfc.system.service.impl;

import com.dlfc.system.entity.SysInfoAtt;
import com.dlfc.system.entity.SysInfoAttExample;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.mapper.DataMapper;
import com.dlfc.system.service.interf.SysInfoAttService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("SysInfoAttService")
@Transactional
public class SysInfoAttServiceImpl implements SysInfoAttService {

    private SysInfoAttExample example;

    private SysInfoAttExample.Criteria criteria;

    private SysInfoAtt entity;

    @Autowired
    private DataMapper<SysInfoAtt, SysInfoAttExample> mapper;

    @Override
    public String save(SysInfoAtt entity,
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
            this.entity = new SysInfoAtt();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public SysInfoAtt findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysInfoAtt> findByLidAndType(String lid,
                                             Integer fileType) {
        example = new SysInfoAttExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        if (StringUtils.isNotEmpty(lid)) {
            criteria.andLidEqualTo(lid);
        }
        if (null != fileType) {
            criteria.andFileTypeEqualTo(fileType);
        }
        return mapper.selectByExample(example);
    }

    @Override
    public List<SysInfoAtt> findByLid(String lid) {
        example = new SysInfoAttExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        return mapper.selectByExample(example);
    }
}
