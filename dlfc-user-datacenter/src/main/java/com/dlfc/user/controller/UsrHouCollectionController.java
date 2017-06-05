package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrHouCollection;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.UsrHouCollectionService;
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

    private UsrUser user = new UsrUser();

    @Autowired
    @Qualifier("UsrHouCollectionService")
    private UsrHouCollectionService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody UsrHouCollection entity) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam UsrHouCollection entity) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public UsrHouCollection findById(@RequestParam String id) {
        return  service.findById(id);
    }

    @RequestMapping(value = "/findAllByUid", method = RequestMethod.GET)
    public List<UsrHouCollection> findAllByUid(@RequestParam String uid) {
        return service.findByUid(uid);
    }

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public boolean saveOrUpdate(@RequestParam UsrHouCollection entity,
                                @RequestParam UsrUser user) {
        return service.saveOrUpdate(entity, user);
    }

    @RequestMapping(value = "/whetherCollected", method = RequestMethod.GET)
    public boolean whetherCollected(@RequestParam String uid,
                                    @RequestParam String hid) {
        return service.whetherCollected(uid, hid);
    }
}
