package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Waiter;

import java.util.List;

public interface IWaiterService {
    List<Waiter> findAll();
    List<Waiter> query(Waiter waiter);
    Waiter selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Waiter waiter) throws Exception;
}
