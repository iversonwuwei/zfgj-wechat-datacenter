package com.dlfc.system.controller;

import com.dlfc.system.entity.SysMobileCapcha;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysMobileCapchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysMobileCapcha")
public class SysMobileCapchaController {

    @Autowired
    private SysMobileCapchaService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysMobileCapcha entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysMobileCapcha findById(@RequestParam String id) {
        return service.findById(id);
    }
}
