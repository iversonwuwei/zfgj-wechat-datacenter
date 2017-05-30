package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrDelInfo;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.DataService;
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
@RequestMapping("/usrDelInfo")
public class UsrDelInfoController {

    @Autowired
    @Qualifier("UsrDelInfoService")
    private DataService service;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    String save(@RequestParam UsrDelInfo entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

//    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
//    String removeById(@RequestParam String id,
//                      @RequestParam UsrUser user) {
//        return service.removeById(id, user);
//    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam UsrDelInfo entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    UsrDelInfo findById(@RequestParam String id) {
        return (UsrDelInfo) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<UsrDelInfo> findAll(@RequestParam(required = false) Integer pageSize,
                             @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }
}
