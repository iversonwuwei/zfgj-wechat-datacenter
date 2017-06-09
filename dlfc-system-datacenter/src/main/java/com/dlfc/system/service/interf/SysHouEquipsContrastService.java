package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysHouEquipsContrast;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.AllFindService;
import com.dlfc.system.service.interf.find.CodeFindSerivce;
import com.dlfc.system.service.interf.save.DataSaveService;

/**
 * Created by K on 2017/6/5.
 */
public interface SysHouEquipsContrastService extends
        AllFindService<SysHouEquipsContrast>,
        CodeFindSerivce<SysHouEquipsContrast>,
        DataSaveService<SysHouEquipsContrast, UsrUser> {
}
