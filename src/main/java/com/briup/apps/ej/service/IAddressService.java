package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Address;

import java.util.List;

public interface IAddressService {
    List<Address> findAll();
    List<Address> query(Address address);
    Address selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Address address) throws Exception;
}
