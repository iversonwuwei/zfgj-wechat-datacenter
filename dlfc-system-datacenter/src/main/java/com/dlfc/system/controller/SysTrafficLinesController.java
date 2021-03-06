package com.dlfc.system.controller;

import com.dlfc.system.entity.SysTrafficLines;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysTrafficLinesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysTrafficLines")
public class SysTrafficLinesController {

    @Autowired
    @Qualifier("SysTrafficLinesService")
    private SysTrafficLinesService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysTrafficLines entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam SysTrafficLines entity,
                             @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysTrafficLines findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByLid", method = RequestMethod.GET)
    public List<SysTrafficLines> findByLid(@RequestParam String lid) {
        return service.findByLid(lid);
    }
}
