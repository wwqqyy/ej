package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product> query(Product product);
    Product selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Product product) throws Exception;
}
