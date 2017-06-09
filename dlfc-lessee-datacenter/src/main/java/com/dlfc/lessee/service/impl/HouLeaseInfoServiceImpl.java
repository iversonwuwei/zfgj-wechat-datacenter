package com.dlfc.lessee.service.impl;

import com.dlfc.lessee.common.PageUtil;
import com.dlfc.lessee.dto.HouLeaseInfoDTO;
import com.dlfc.lessee.entity.HouLeaseInfo;
import com.dlfc.lessee.entity.HouLeaseInfoExample;
import com.dlfc.lessee.entity.UsrUser;
import com.dlfc.lessee.mapper.DataMapper;
import com.dlfc.lessee.service.interf.HouLeaseInfoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Service("HouLeaseInfoService")
@Transactional
public class HouLeaseInfoServiceImpl implements HouLeaseInfoService {

    private static final String LIKE_FIX = "%";

    private HouLeaseInfoExample example;

    private HouLeaseInfoExample.Criteria criteria;

    private HouLeaseInfo entity;

    @Autowired
    private DataMapper<HouLeaseInfo, HouLeaseInfoExample> mapper;

    @Override
    public String save(HouLeaseInfo entity,
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
            this.entity = new HouLeaseInfo();
            this.entity.setId(id);
            this.entity.setDeleteFlg((short) 1);
            if (mapper.updateByPrimaryKeySelective(this.entity) > 0) {
                return this.entity.getId();
            }
        }
        return null;
    }

    @Override
    public String updateById(HouLeaseInfo entity,
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
    public HouLeaseInfo findById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HouLeaseInfo> findAll(String orderBy,
                                      Integer pageSize,
                                      Integer pageNo) {
        example = new HouLeaseInfoExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        example.setOrderByClause(PageUtil.generatePage(orderBy, pageSize, pageNo));
        return mapper.selectByExample(example);
    }

    @Override
    public List<HouLeaseInfo> findByParams(HouLeaseInfoDTO dto) {
        example = new HouLeaseInfoExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        if (null != dto.getMinRent()) {
            criteria.andRentGreaterThanOrEqualTo(BigDecimal.valueOf(dto.getMinRent()));
        }
        if (null != dto.getMaxRent()) {
            criteria.andRentLessThan(BigDecimal.valueOf(dto.getMaxRent()));
        }
        if (StringUtils.isNotEmpty(dto.getSource())) {
            if ("1".equals(dto.getSource())) {
                criteria.andEidIsNotNull();
            } else if ("1".equals(dto.getSource())) {
                criteria.andUidIsNotNull();
            }
        }
        if (null != dto.getRentMode()) {
            criteria.andLeaseModeEqualTo(dto.getRentMode());
        }
        if (StringUtils.isNotEmpty(dto.getOrientation())) {
            criteria.andOrientationEqualTo(dto.getOrientation());
        }
        if (StringUtils.isNotEmpty(dto.getDistrictId())) {
            criteria.andDistrictLike(LIKE_FIX + dto.getDistrictId() + LIKE_FIX);
        }
        if (StringUtils.isNotEmpty(dto.getPaymentStyle())) {
            criteria.andRentTypeLike(LIKE_FIX + "," + dto.getPaymentStyle() + LIKE_FIX);
        }
        example.setOrderByClause(PageUtil.generatePage(dto.getOrderByRent(), dto.getPageSize(), dto.getPageNo()));
        return mapper.selectByExample(example);
    }

    @Override
    public List<HouLeaseInfo> findByUid(String uid) {
        example = new HouLeaseInfoExample();
        criteria = example.createCriteria();
        criteria.andDeleteFlgEqualTo((short) 0);
        criteria.andUidEqualTo(uid);
        return mapper.selectByExample(example);
    }
}
