package com.dlfc.system.controller;

import com.dlfc.system.entity.SysPerson;
import com.dlfc.system.service.interf.SysPersonService;
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
@RequestMapping("/wc/datas/sysPerson")
public class SysPersonController {

    @Autowired
    @Qualifier("SysPersonService")
    private SysPersonService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysPerson findById(@RequestParam String id) {
        return service.findById(id);
    }
}
