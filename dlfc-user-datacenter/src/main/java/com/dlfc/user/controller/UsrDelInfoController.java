package com.dlfc.user.controller;

import com.dlfc.user.entity.UsrDelInfo;
import com.dlfc.user.service.interf.UsrDelInfoService;
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
@RequestMapping("/wc/datas/usrDelInfo")
public class UsrDelInfoController {

    @Autowired
    @Qualifier("UsrDelInfoService")
    private UsrDelInfoService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public UsrDelInfo findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByUid", method = RequestMethod.GET)
    public List<UsrDelInfo> findByUid(@RequestParam String uid) {
        return service.findByUid(uid);
    }
}
