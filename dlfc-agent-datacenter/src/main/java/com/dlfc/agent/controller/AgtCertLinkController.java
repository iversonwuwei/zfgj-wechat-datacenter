package com.dlfc.agent.controller;

import com.dlfc.agent.entity.AgtCertLink;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.service.DataService;
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
@RequestMapping("/wc/datas/agtCertLink")
public class AgtCertLinkController {

    @Autowired
    @Qualifier("AgtCertLinkService")
    private DataService service;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam AgtCertLink entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam AgtCertLink entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    AgtCertLink findById(@RequestParam String id) {
        return (AgtCertLink) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<AgtCertLink> findAll(@RequestParam(required = false) Integer pageSize,
                              @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }
}
