package com.dlfc.user.service.interf.save;

/**
 * Created by K on 2017/6/3.
 */
public interface DataSaveService<T, U> {

    String save(T t, U u);
}
