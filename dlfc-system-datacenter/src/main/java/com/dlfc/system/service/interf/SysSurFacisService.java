package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysSurFacis;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.LidFindService;
import com.dlfc.system.service.interf.remove.DataRemoveService;
import com.dlfc.system.service.interf.save.DataSaveService;
import com.dlfc.system.service.interf.update.DataUpdateService;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface SysSurFacisService extends
        DataSaveService<SysSurFacis, UsrUser>,
        DataRemoveService<UsrUser>,
        DataUpdateService<SysSurFacis, UsrUser>,
        LidFindService<SysSurFacis> {
    SysSurFacis findByFacilityIds(List<String> facilityIds);
}
