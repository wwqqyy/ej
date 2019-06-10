package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Order;

import java.util.List;

public interface IOrderService {
    List<Order> findAll();
    List<Order> query(Order order);
    Order selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Order order) throws Exception;
}
