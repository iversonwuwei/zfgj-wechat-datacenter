package com.dlfc.system.controller;

import com.dlfc.system.entity.SysParam;
import com.dlfc.system.service.interf.SysParamService;
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
@RequestMapping("/wc/datas/sysParam")
public class SysParamController {

    @Autowired
    private SysParamService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysParam findById(@RequestParam String id) {
        return (SysParam) service.findById(id);
    }

    @RequestMapping(value = "/findByScope", method = RequestMethod.GET)
    public List<SysParam> findByScope(@RequestParam String scope) {
        return service.findByScope(scope);
    }
}
