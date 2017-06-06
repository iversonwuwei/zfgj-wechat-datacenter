package com.dlfc.user.controller;

import com.dlfc.user.entity.CmsGuestbook;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.CmsGuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/cmsGuestbook")
public class CmsGuestbookController {

    private UsrUser user = new UsrUser();

    @Autowired
    @Qualifier("CmsGuestbookService")
    private CmsGuestbookService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody CmsGuestbook entity) {
        return service.save(entity, user);
    }
}
