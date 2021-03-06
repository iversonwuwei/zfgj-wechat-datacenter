package com.dlfc.system.controller;

import com.dlfc.system.entity.SysHouEquips;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysHouEquipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysHouEquipments")
public class SysHouEquipsController {

    private UsrUser user = new UsrUser();

    @Autowired
    @Qualifier("SysHouEquipsService")
    private SysHouEquipsService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysHouEquips entity) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam SysHouEquips entity) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysHouEquips findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByLid", method = RequestMethod.GET)
    public List<SysHouEquips> findByLid(@RequestParam String lid) {
        return service.findByLid(lid);
    }
}
