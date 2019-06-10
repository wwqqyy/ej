package com.briup.apps.ej.service;

import com.briup.apps.ej.bean.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();
    List<Comment> query(Comment comment);
    Comment selectById(long id);
    void deleteById(long id) throws Exception;
    void saveOrUpdate(Comment comment) throws Exception;
}
