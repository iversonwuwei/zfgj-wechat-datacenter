package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.UsrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/usrUser")
public class UsrUserController {

    @Autowired
    @Qualifier("UsrUserService")
    private UsrUserService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public UsrUser findById(@RequestParam String id) {
        return service.findById(id);
    }
}
