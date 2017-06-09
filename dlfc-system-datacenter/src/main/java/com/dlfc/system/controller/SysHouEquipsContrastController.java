package com.dlfc.system.controller;

import com.dlfc.system.entity.SysHouEquipsContrast;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysHouEquipsContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysHouEquipsContrast")
public class SysHouEquipsContrastController {

    private UsrUser user = new UsrUser();

    @Autowired
    private SysHouEquipsContrastService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysHouEquipsContrast findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<SysHouEquipsContrast> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/findByCode", method = RequestMethod.GET)
    public SysHouEquipsContrast findByCode(@RequestParam String code) {
        return service.findByCode(code);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysHouEquipsContrast entity) {
        return service.save(entity, user);
    }
}
