package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.OrderLine;

import java.util.List;

public interface IOderLineService {
    List<OrderLine> findAll();
    List<OrderLine> query(OrderLine orderLine);
    OrderLine selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(OrderLine orderLine) throws Exception;
}
