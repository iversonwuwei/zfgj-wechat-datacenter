package com.dlfc.user.service.interf;

import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.find.DataFindService;
import com.dlfc.user.service.interf.save.DataSaveService;
import com.dlfc.user.service.interf.update.DataUpdateService;

/**
 * Created by K on 2017/6/3.
 */
public interface UsrUserService extends
        DataSaveService<UsrUser, UsrUser>,
        DataFindService<UsrUser>,
        DataUpdateService<UsrUser, UsrUser> {
    UsrUser findByUser(String user);
}
