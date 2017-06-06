package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysOrder;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.UidFindService;
import com.dlfc.system.service.interf.save.DataSaveService;

/**
 * Created by K on 2017/6/5.
 */
public interface SysOrderService extends
        DataSaveService<SysOrder, UsrUser>,
        UidFindService<SysOrder> {
}
