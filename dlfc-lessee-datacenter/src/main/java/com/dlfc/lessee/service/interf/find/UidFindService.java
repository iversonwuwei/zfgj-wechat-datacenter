package com.dlfc.lessee.service.interf.find;

import java.util.List;

/**
 * Created by K on 2017/6/3.
 */
public interface UidFindService<T> extends DataFindService<T> {

    List<T> findByUid(String uid);
}
