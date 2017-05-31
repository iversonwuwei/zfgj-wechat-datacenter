package com.dlfc.contract.controller;

import com.dlfc.contract.entity.ConHouseItemsLog;
import com.dlfc.contract.entity.UsrUser;
import com.dlfc.contract.service.DataService;
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
@RequestMapping("/wc/datas/conHouseItemsLog")
public class ConHouseItemsLogController {

    @Autowired
    @Qualifier("ConHouseItemsLogService")
    private DataService service;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam ConHouseItemsLog entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam ConHouseItemsLog entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    ConHouseItemsLog findById(@RequestParam String id) {
        return (ConHouseItemsLog) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<ConHouseItemsLog> findAll(@RequestParam(required = false) Integer pageSize,
                                   @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }
}
