package com.dlfc.system.controller;

import com.dlfc.system.entity.SysSurFacisContrast;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysSurFacisContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysSurFacisContrast")
public class SysSurFacisContrastController {

    private UsrUser user = new UsrUser();

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

    @RequestMapping(value = "/findByCode", method = RequestMethod.GET)
    public SysSurFacisContrast findByCode(@RequestParam String code) {
        return service.findByCode(code);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysSurFacisContrast entity) {
        return service.save(entity, user);
    }
}
