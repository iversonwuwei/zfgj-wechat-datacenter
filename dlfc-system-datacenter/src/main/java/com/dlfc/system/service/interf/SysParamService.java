package com.dlfc.system.service.interf;

import com.dlfc.system.entity.SysParam;
import com.dlfc.system.service.interf.find.DataFindService;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface SysParamService extends
        DataFindService<SysParam> {
    List<SysParam> findByScope(String scope);
}
