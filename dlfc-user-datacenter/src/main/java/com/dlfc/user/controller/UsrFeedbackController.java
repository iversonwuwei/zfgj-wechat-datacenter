package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrFeedback;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.UsrFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/usrFeedback")
public class UsrFeedbackController {

    private UsrUser user = new UsrUser();

    @Autowired
    @Qualifier("UsrFeedbackService")
    private UsrFeedbackService service;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String save(@RequestParam UsrFeedback entity) {
        return service.save(entity, user);
    }
}
