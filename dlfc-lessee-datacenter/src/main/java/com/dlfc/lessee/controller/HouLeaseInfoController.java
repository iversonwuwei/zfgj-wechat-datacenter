package com.dlfc.lessee.controller;

import com.dlfc.lessee.dto.HouLeaseInfoDTO;
import com.dlfc.lessee.entity.HouLeaseInfo;
import com.dlfc.lessee.entity.UsrUser;
import com.dlfc.lessee.service.interf.HouLeaseInfoService;
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
    private HouLeaseInfoService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestBody HouLeaseInfo entity,
                       @RequestParam UsrUser user) {
        return service.save(entity, user);
    }

    @RequestMapping(value = "/removeById", method = RequestMethod.DELETE)
    public String removeById(@RequestParam String id,
                             @RequestParam UsrUser user) {
        return service.removeById(id, user);
    }

    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    public String updateById(@RequestParam HouLeaseInfo entity,
                             @RequestParam UsrUser user) {
        return service.updateById(entity, user);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public HouLeaseInfo findById(@RequestParam String id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/findByUid", method = RequestMethod.GET)
    public List<HouLeaseInfo> findByUid(@RequestParam String uid) {
        return service.findByUid(uid);
    }

    @RequestMapping(value = "/findByParams", method = RequestMethod.POST)
    List<HouLeaseInfo> findByParams(@RequestBody HouLeaseInfoDTO dto) {
        return service.findByParams(dto);
    }
}
