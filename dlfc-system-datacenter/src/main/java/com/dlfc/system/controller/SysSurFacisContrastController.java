package com.dlfc.system.controller;

import com.dlfc.system.entity.SysSurFacisContrast;
import com.dlfc.system.service.SysSurFacisContrastService;
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
@RequestMapping("/wc/datas/sysSurroundingFacilitiesContrast")
public class SysSurFacisContrastController {

    @Autowired
    @Qualifier("SysSurFacisContrastService")
    private SysSurFacisContrastService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysSurFacisContrast findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<SysSurFacisContrast> findAll() {
        return service.findAll();
    }
}
