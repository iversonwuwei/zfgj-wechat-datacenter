package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysTrafficLines;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.LidFindService;
import com.dlfc.system.service.interf.remove.DataRemoveService;
import com.dlfc.system.service.interf.save.DataSaveService;
import com.dlfc.system.service.interf.update.DataUpdateService;

/**
 * Created by K on 2017/6/5.
 */
public interface SysTrafficLinesService extends
        DataSaveService<SysTrafficLines, UsrUser>,
        DataRemoveService<UsrUser>,
        DataUpdateService<SysTrafficLines, UsrUser>,
        LidFindService<SysTrafficLines> {
}
