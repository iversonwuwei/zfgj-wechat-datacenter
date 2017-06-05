package com.dlfc.system.controller;

import com.dlfc.system.entity.SysBroadband;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysBroadbandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysBroadband")
public class SysBroadbandController {

    @Autowired
    @Qualifier("SysBroadbandService")
    private SysBroadbandService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysBroadband entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysBroadband findById(@RequestParam String id) {
        return service.findById(id);
    }
}
