package com.dlfc.user.service.impl;

import com.dlfc.user.entity.UsrFeedback;
import com.dlfc.user.entity.UsrFeedbackExample;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.interf.UsrFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by K on 2017/5/29.
 */

@Service("UsrFeedbackService")
@Transactional
public class UsrFeedbackServiceImpl implements UsrFeedbackService {

    private UsrFeedbackExample example;

    private UsrFeedbackExample.Criteria criteria;

    @Autowired
    private DataMapper<UsrFeedback, UsrFeedbackExample> mapper;

    @Override
    public String save(UsrFeedback entity,
                       UsrUser user) {
        if (null != entity) {
            entity.preInsert(user);
            if (mapper.insertSelective(entity) > 0) {
                return entity.getId();
            }
        }
        return null;
    }
}
