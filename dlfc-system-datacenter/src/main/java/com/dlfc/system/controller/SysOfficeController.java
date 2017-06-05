package com.dlfc.system.controller;

import com.dlfc.system.entity.SysOffice;
import com.dlfc.system.service.interf.SysOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysOffice")
public class SysOfficeController {

    @Autowired
    @Qualifier("SysOfficeService")
    private SysOfficeService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysOffice findById(@RequestParam String id) {
        return (SysOffice) service.findById(id);
    }
}
