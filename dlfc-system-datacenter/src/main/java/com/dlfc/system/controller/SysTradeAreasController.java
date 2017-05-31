package com.dlfc.system.controller;

import com.dlfc.system.entity.SysTradeAreas;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.DataService;
import com.dlfc.system.service.impl.SysTradeAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysTradeAreas")
public class SysTradeAreasController {

    @Autowired
    @Qualifier("SysTradeAreasService")
    private DataService service;

    @Autowired
    private SysTradeAreasService serviceImpl;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam SysTradeAreas entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam SysTradeAreas entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    SysTradeAreas findById(@RequestParam String id) {
        return (SysTradeAreas) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<SysTradeAreas> findAll(@RequestParam(required = false) Integer pageSize,
                                @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }

    @RequestMapping(value = "/findByParentId", method = RequestMethod.GET)
    List<SysTradeAreas> findByParentId(@RequestParam(name = "areaId") String parentId) {
        return serviceImpl.findByParentId(parentId);
    }
}
