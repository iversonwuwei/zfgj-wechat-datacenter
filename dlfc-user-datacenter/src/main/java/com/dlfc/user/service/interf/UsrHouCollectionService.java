package com.dlfc.user.service.interf;

import com.dlfc.user.entity.UsrHouCollection;
import com.dlfc.user.entity.UsrUser;
import com.dlfc.user.service.interf.find.UidFindService;
import com.dlfc.user.service.interf.remove.DataRemoveService;
import com.dlfc.user.service.interf.save.DataSaveService;
import com.dlfc.user.service.interf.update.DataUpdateService;

import java.util.List;

/**
 * Created by K on 2017/6/3.
 */
public interface UsrHouCollectionService extends
        DataSaveService<UsrHouCollection, UsrUser>,
        DataRemoveService<UsrUser>,
        DataUpdateService<UsrHouCollection, UsrUser>,
        UidFindService<UsrHouCollection> {
    List<UsrHouCollection> findByUidAndHid(String uid,
                                           String hid);

    boolean saveOrUpdate(UsrHouCollection usrHouCollection,
                         UsrUser user);

    boolean whetherCollected(String uid,
                             String hid);
}
