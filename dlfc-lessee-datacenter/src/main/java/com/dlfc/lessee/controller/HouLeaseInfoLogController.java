package com.dlfc.lessee.controller;

import com.dlfc.lessee.entity.HouLeaseInfoLog;
import com.dlfc.lessee.service.interf.HouLeaseInfoLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/houLeaseInfoLog")
public class HouLeaseInfoLogController {

    @Autowired
    @Qualifier("HouLeaseInfoLogService")
    private HouLeaseInfoLogService service;

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public HouLeaseInfoLog findById(@RequestParam String id) {
        return service.findById(id);
    }
}
