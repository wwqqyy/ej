package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    List<Customer> query(Customer customer);
    Customer selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Customer customer) throws Exception;
}
