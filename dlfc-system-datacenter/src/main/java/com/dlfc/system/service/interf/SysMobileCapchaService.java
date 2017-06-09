package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysMobileCapcha;
import com.dlfc.system.entity.UsrUser;
import com.dlfc.system.service.interf.find.DataFindService;
import com.dlfc.system.service.interf.save.DataSaveService;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface SysMobileCapchaService extends
        DataSaveService<SysMobileCapcha, UsrUser>,
        DataFindService<SysMobileCapcha> {
    List<SysMobileCapcha> findByMobileAndDomain(String mobile, String domain);

    List<SysMobileCapcha> findByParams(SysMobileCapcha entity);
}
