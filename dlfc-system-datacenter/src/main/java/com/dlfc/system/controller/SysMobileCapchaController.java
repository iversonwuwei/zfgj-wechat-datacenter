package com.dlfc.system.controller;

import com.dlfc.system.entity.SysMobileCapcha;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysMobileCapchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysMobileCapcha")
public class SysMobileCapchaController {

    UsrUser user = new UsrUser();

    @Autowired
    private SysMobileCapchaService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysMobileCapcha entity) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysMobileCapcha findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByMobileAndDomain", method = RequestMethod.GET)
    public List<SysMobileCapcha> findByMobileAndDomain(@RequestParam String mobile,
                                                       @RequestParam String domain) {
        return service.findByMobileAndDomain(mobile, domain);
    }

    @RequestMapping(value = "/findByParams", method = RequestMethod.POST)
    public List<SysMobileCapcha> findByParams(@RequestBody SysMobileCapcha entity) {
        return service.findByParams(entity);
    }
}
