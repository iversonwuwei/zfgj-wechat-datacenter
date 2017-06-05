package com.dlfc.system.controller;

import com.dlfc.system.entity.SysRole;
import com.dlfc.system.service.interf.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysRole")
public class SysRoleController {

    @Autowired
    private SysRoleService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysRole findById(@RequestParam String id) {
        return service.findById(id);
    }
}
