package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysCode;
import com.dlfc.system.service.interf.find.DataFindService;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface SysCodeService extends
        DataFindService<SysCode> {
    List<SysCode> findByType(String type);

    SysCode findByTypeAndCode(String type, String code);
}
