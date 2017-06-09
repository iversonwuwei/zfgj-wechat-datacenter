package com.dlfc.system.controller;

import com.dlfc.system.entity.SysTradeAreas;
import com.dlfc.system.service.interf.SysTradeAreasService;
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
    private SysTradeAreasService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysTradeAreas findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByParentId", method = RequestMethod.GET)
    public List<SysTradeAreas> findByParentId(@RequestParam(name = "parentId") String parentId) {
        return service.findByLid(parentId);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<SysTradeAreas> findAll() {
        return service.findAll();
    }
}
