package com.dlfc.agent.controller;

import com.dlfc.agent.entity.AgtCertLink;
import com.dlfc.agent.entity.UsrUser;
import com.dlfc.agent.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

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
    public String save(@RequestBody AgtCertLink entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam AgtCertLink entity,
                             @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public AgtCertLink findById(@RequestParam String id) {
        return (AgtCertLink) service.findById(id);
    }
}
