package com.dlfc.contract.controller;

import com.dlfc.contract.entity.ConOtherCosts;
import com.dlfc.contract.entity.UsrUser;
import com.dlfc.contract.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/conOtherCosts")
public class ConOtherCostsController {

    @Autowired
    @Qualifier("ConOtherCostsService")
    private DataService service;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody ConOtherCosts entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam ConOtherCosts entity,
                             @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public ConOtherCosts findById(@RequestParam String id) {
        return (ConOtherCosts) service.findById(id);
    }
}
