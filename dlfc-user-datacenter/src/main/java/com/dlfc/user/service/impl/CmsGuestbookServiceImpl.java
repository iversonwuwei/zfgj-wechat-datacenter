package com.dlfc.user.service.impl;

import com.dlfc.user.entity.CmsGuestbook;
import com.dlfc.user.entity.CmsGuestbookExample;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.mapper.DataMapper;
import com.dlfc.user.service.interf.CmsGuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by K on 2017/6/6.
 */

@Service("CmsGuestbookService")
public class CmsGuestbookServiceImpl implements CmsGuestbookService {

    private CmsGuestbookExample example;

    private CmsGuestbookExample.Criteria criteria;

    @Autowired
    private DataMapper<CmsGuestbook, CmsGuestbookExample> mapper;

    @Override
    public String save(CmsGuestbook cmsGuestbook,
                       UsrUser user) {
        if (null != cmsGuestbook) {
            cmsGuestbook.preInsert(user);
            if (mapper.insertSelective(cmsGuestbook) > 0) {
                return cmsGuestbook.getId();
            }
        }
        return null;
    }
}
