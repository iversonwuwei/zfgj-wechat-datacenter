package com.dlfc.lessee.service.interf.remove;

/**
 * Created by K on 2017/6/3.
 */
public interface DataRemoveService<U> {

    String removeById(String id, U u);
}
