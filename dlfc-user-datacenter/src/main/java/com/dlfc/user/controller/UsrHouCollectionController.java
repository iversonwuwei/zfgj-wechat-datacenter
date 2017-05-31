package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrHouCollection;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.DataService;
import com.dlfc.user.service.impl.UsrHouCollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/usrHouCollection")
public class UsrHouCollectionController {

    @Autowired
    @Qualifier("UsrHouCollectionService")
    private DataService service;

    @Autowired
    private UsrHouCollectionService serviceImpl;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam UsrHouCollection entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam UsrHouCollection entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    UsrHouCollection findById(@RequestParam String id) {
        return (UsrHouCollection) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<UsrHouCollection> findAll(@RequestParam(required = false) Integer pageSize,
                                   @RequestParam(required = false) Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }

    @RequestMapping(value = "/findAllByUid", method = RequestMethod.GET)
    List<UsrHouCollection> findAllByUid(@RequestParam String uid) {
        return serviceImpl.findAllByUid(uid);
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    boolean saveOrUpdate(@RequestParam UsrHouCollection entity,
                         @RequestParam UsrUser user) {
        return serviceImpl.saveOrUpdate(entity, user);
    }
}
