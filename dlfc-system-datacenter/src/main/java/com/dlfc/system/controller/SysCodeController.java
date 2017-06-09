package com.dlfc.system.controller;

import com.dlfc.system.entity.SysCode;
import com.dlfc.system.service.interf.SysCodeService;
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
@RequestMapping("/wc/datas/sysCode")
public class SysCodeController {

    @Autowired
    @Qualifier("SysCodeService")
    private SysCodeService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysCode findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByType", method = RequestMethod.GET)
    public List<SysCode> findByType(@RequestParam(name = "type") String type) {
        return service.findByType(type);
    }

    @RequestMapping(value = "/findByTypeAndCode", method = RequestMethod.GET)
    public SysCode findByTypeAndCode(@RequestParam(name = "type") String type,
                                           @RequestParam(name = "code") String code) {
        return service.findByTypeAndCode(type, code);
    }
}
