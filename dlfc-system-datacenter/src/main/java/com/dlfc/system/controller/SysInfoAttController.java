package com.dlfc.system.controller;

import com.dlfc.system.entity.SysInfoAtt;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.DataService;
import com.dlfc.system.service.impl.SysInfoAttService;
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
@RequestMapping("/wc/datas/sysInfoAtt")
public class SysInfoAttController {

    @Autowired
    @Qualifier("SysInfoAttService")
    private DataService service;

    @Autowired
    private SysInfoAttService serviceImpl;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam SysInfoAtt entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam SysInfoAtt entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    SysInfoAtt findById(@RequestParam String id) {
        return (SysInfoAtt) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<SysInfoAtt> findAll(@RequestParam(required = false) Integer pageSize,
                             @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }

    @RequestMapping(value = "/findAllByLidAndFileType", method = RequestMethod.GET)
    List<SysInfoAtt> findAllByLidAndFileType(@RequestParam String lid,
                                             @RequestParam Integer fileType) {
        return serviceImpl.findAllByLidAndType(lid, fileType);
    }
}
