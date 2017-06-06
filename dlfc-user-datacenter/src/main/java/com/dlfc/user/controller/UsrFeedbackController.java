package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrFeedback;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.UsrFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody UsrFeedback entity) {
        return service.save(entity, user);
    }
}
