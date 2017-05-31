package com.dlfc.system.controller;

import com.dlfc.system.entity.SysCode;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.DataService;
import com.dlfc.system.service.impl.SysCodeService;
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
    private DataService service;

    @Autowired
    private SysCodeService serviceImpl;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam SysCode entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam SysCode entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    SysCode findById(@RequestParam String id) {
        return (SysCode) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<SysCode> findAll(@RequestParam(required = false) Integer pageSize,
                          @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }

    @RequestMapping(value = "/findByType", method = RequestMethod.GET)
    List<SysCode> findByType(@RequestParam(name = "type") String type) {
        return serviceImpl.findByType(type);
    }
}
