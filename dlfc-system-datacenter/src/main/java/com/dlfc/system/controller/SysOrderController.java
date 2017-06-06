package com.dlfc.system.controller;

import com.dlfc.system.entity.SysOrder;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysOrder")
public class SysOrderController {

    @Autowired
    @Qualifier("SysOrderService")
    private SysOrderService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysOrder entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysOrder findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByUid", method = RequestMethod.GET)
    public List<SysOrder> findByUid(@RequestParam String uid) {
        return service.findByUid(uid);
    }
}
