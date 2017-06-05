package com.dlfc.user.service.interf.update;

/**
 * Created by K on 2017/6/3.
 */
public interface DataUpdateService<T,U> {

    String updateById(T t,U u);
}
