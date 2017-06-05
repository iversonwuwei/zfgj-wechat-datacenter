package com.dlfc.system.controller;

import com.dlfc.system.entity.SysSurFacis;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysSurFacisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysSurroundingFacilities")
public class SysSurFacisController {

    @Autowired
    @Qualifier("SysSurFacisService")
    private SysSurFacisService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysSurFacis entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam SysSurFacis entity,
                             @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysSurFacis findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByLid", method = RequestMethod.GET)
    public List<SysSurFacis> findByLid(@RequestParam String lid) {
        return service.findByLid(lid);
    }

    @RequestMapping(value = "/findByFacilityIds", method = RequestMethod.POST)
    public SysSurFacis findByFacilityIds(@RequestBody List<String> facilityIds) {
        return service.findByFacilityIds(facilityIds);
    }
}
