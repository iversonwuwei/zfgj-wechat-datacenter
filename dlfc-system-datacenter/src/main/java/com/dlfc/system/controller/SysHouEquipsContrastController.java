package com.dlfc.system.controller;

import com.dlfc.system.entity.SysHouEquipsContrast;
import com.dlfc.system.service.interf.SysHouEquipsContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysHouEquipmentsContrast")
public class SysHouEquipsContrastController {

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
}
