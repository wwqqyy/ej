package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    List<Category> query(Category category);
    Category selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Category category) throws Exception;
}
