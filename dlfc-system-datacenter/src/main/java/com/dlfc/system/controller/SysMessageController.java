package com.dlfc.system.controller;

import com.dlfc.system.entity.SysMessage;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysMessage")
public class SysMessageController {

    @Autowired
    private SysMessageService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysMessage entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysMessage findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByReceiverUid", method = RequestMethod.GET)
    public List<SysMessage> findByReceiverUid(@RequestParam(name = "receiverUid") String receiverUid) {
        return service.findByUid(receiverUid);
    }
}
