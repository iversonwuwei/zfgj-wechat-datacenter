package com.dlfc.system.controller;

import com.dlfc.system.entity.SysPersonLog;
import com.dlfc.system.service.interf.SysPersonLogService;
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
@RequestMapping("/wc/datas/sysPersonLog")
public class SysPersonLogController {

    @Autowired
    @Qualifier("SysPersonLogService")
    private SysPersonLogService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysPersonLog findById(@RequestParam String id) {
        return service.findById(id);
    }
}
