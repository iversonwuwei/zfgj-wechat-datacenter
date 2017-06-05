package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysInfoAtt;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.LidFindService;
import com.dlfc.system.service.interf.remove.DataRemoveService;
import com.dlfc.system.service.interf.save.DataSaveService;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface SysInfoAttService extends
        DataSaveService<SysInfoAtt, UsrUser>,
        DataRemoveService<UsrUser>,
        LidFindService<SysInfoAtt> {
    List<SysInfoAtt> findByLidAndType(String lid,
                                      Integer fileType);
}
