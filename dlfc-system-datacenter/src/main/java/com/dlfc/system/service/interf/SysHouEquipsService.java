package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysHouEquips;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.LidFindService;
import com.dlfc.system.service.interf.remove.DataRemoveService;
import com.dlfc.system.service.interf.save.DataSaveService;
import com.dlfc.system.service.interf.update.DataUpdateService;

/**
 * Created by K on 2017/6/5.
 */
public interface SysHouEquipsService extends
        DataSaveService<SysHouEquips, UsrUser>,
        DataRemoveService<UsrUser>,
        DataUpdateService<SysHouEquips, UsrUser>,
        LidFindService<SysHouEquips> {
}
