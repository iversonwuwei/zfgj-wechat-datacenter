package com.dlfc.system.controller;

import com.dlfc.system.entity.SysInfoAtt;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.SysInfoAttService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/sysInfoAtt")
public class SysInfoAttController {

    @Autowired
    @Qualifier("SysInfoAttService")
    private SysInfoAttService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody SysInfoAtt entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public SysInfoAtt findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findAllByLidAndFileType", method = RequestMethod.GET)
    public List<SysInfoAtt> findAllByLidAndFileType(@RequestParam String lid,
                                                    @RequestParam Integer fileType) {
        return service.findByLidAndType(lid, fileType);
    }
}
