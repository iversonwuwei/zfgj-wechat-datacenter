package com.dlfc.lessee.service.interf;

import com.dlfc.lessee.dto.HouLeaseInfoDTO;
import com.dlfc.lessee.entity.HouLeaseInfo;
import com.dlfc.lessee.entity.UsrUser;
import com.dlfc.lessee.service.interf.find.UidFindService;
import com.dlfc.lessee.service.interf.remove.DataRemoveService;
import com.dlfc.lessee.service.interf.save.DataSaveService;
import com.dlfc.lessee.service.interf.update.DataUpdateService;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface HouLeaseInfoService extends
        DataSaveService<HouLeaseInfo, UsrUser>,
        DataRemoveService<UsrUser>,
        DataUpdateService<HouLeaseInfo, UsrUser>,
        UidFindService<HouLeaseInfo> {
    List<HouLeaseInfo> findByParams(HouLeaseInfoDTO dto);

    List<HouLeaseInfo> findAll(String orderBy, Integer pageSize, Integer pageNo);
}
