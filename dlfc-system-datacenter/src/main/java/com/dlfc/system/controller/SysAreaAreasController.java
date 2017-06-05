package com.dlfc.system.controller;

import com.dlfc.system.entity.SysAreaAreas;
import com.dlfc.system.service.interf.SysAreaAreasService;
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
@RequestMapping("/wc/datas/sysAreaAreas")
public class SysAreaAreasController {

    @Autowired
    @Qualifier("SysAreaAreasService")
    private SysAreaAreasService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysAreaAreas findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByCityId", method = RequestMethod.GET)
    public List<SysAreaAreas> findByCityId(@RequestParam(name = "cityId") String cityId) {
        return service.findByLid(cityId);
    }
}
