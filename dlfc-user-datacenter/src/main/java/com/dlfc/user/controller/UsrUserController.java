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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody UsrUser entity) {
        return service.save(entity, null);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestBody UsrUser entity) {
        return service.updateById(entity, null);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public UsrUser findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByUser", method = RequestMethod.GET)
    public UsrUser findByUser(@RequestParam String user) {
        return service.findByUser(user);
    }
}
