package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysTradeAreas;
import com.dlfc.system.service.interf.find.AllFindService;
import com.dlfc.system.service.interf.find.LidFindService;

/**
 * Created by K on 2017/6/5.
 */
public interface SysTradeAreasService extends
        LidFindService<SysTradeAreas>,
        AllFindService<SysTradeAreas> {
}
