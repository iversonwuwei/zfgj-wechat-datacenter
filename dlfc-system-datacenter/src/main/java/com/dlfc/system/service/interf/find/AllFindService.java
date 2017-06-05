package com.dlfc.system.service.interf.find;

import java.util.List;

/**
 * Created by K on 2017/6/5.
 */
public interface AllFindService<T> extends DataFindService<T> {

    List<T> findAll();
}
