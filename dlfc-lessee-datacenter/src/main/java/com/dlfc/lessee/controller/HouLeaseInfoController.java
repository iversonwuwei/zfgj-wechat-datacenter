package com.dlfc.lessee.controller;

import com.dlfc.lessee.dto.HouLeaseInfoDTO;
import com.dlfc.lessee.entity.HouLeaseInfo;
import com.dlfc.lessee.entity.UsrUser;
import com.dlfc.lessee.service.DataService;
import com.dlfc.lessee.service.impl.HouLeaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@RestController
@RequestMapping("/wc/datas/houLeaseInfo")
public class HouLeaseInfoController {

    @Autowired
    @Qualifier("HouLeaseInfoService")
    private DataService service;

    @Autowired
    private HouLeaseInfoService serviceImpl;

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    public int count() {
        return service.count();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam HouLeaseInfo entity,
                @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    String removeById(@RequestParam String id,
                      @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    String updateById(@RequestParam HouLeaseInfo entity,
                      @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    HouLeaseInfo findById(@RequestParam String id) {
        return (HouLeaseInfo) service.findById(id);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    List<HouLeaseInfo> findAll(@RequestParam(defaultValue = "10") Integer pageSize,
                               @RequestParam(defaultValue = "1") Integer pageNo) {
        return service.findAll(null, pageSize, pageNo);
    }

    @RequestMapping(value = "/findByUid", method = RequestMethod.GET)
    List<HouLeaseInfo> findByUid(@RequestParam String uid,
                                 @RequestParam String orderBy,
                                 @RequestParam(defaultValue = "10") Integer pageSize,
                                 @RequestParam(defaultValue = "1") Integer pageNo) {
        return serviceImpl.findByUid(uid, orderBy, pageSize, pageNo);
    }

    @RequestMapping(value = "/findAllByParams", method = RequestMethod.POST)
    List<HouLeaseInfo> findAllByParams(@RequestBody HouLeaseInfoDTO dto) {
        return serviceImpl.findAllByParams(dto);
    }
}
