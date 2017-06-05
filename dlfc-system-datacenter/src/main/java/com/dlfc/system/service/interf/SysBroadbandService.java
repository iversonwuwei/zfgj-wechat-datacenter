package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysBroadband;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.DataFindService;
import com.dlfc.system.service.interf.save.DataSaveService;

/**
 * Created by K on 2017/6/5.
 */
public interface SysBroadbandService extends
        DataSaveService<SysBroadband, UsrUser>,
        DataFindService<SysBroadband> {
}
