package com.dlfc.system.service.interf.find;

/**
 * Created by K on 2017/6/6.
 */
public interface CodeFindSerivce<T> extends
        DataFindService<T> {

    T findByCode(String code);
}
