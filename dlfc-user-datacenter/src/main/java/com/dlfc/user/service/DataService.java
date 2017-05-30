package com.dlfc.user.service;

import com.dlfc.user.entity.UsrUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by K on 2017/5/29.
 */

@Component
public interface DataService<T> {

    int count();

    String save(T t, UsrUser user);

    String removeById(String id, UsrUser user);

    String updateById(T t, UsrUser user);

    T findById(String id);

    List<T> findAll(String orderBy, Integer pageSize, Integer pageNo);
}
