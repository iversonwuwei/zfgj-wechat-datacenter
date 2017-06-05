package com.dlfc.agent.controller;

import com.dlfc.agent.entity.AgtEmpInfo;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/agtEmpInfo")
public class AgtEmpInfoController {

    @Autowired
    @Qualifier("AgtEmpInfoService")
    private DataService service;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody AgtEmpInfo entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam AgtEmpInfo entity,
                             @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public AgtEmpInfo findById(@RequestParam String id) {
        return (AgtEmpInfo) service.findById(id);
    }
}
