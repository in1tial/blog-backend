package com.blog.dao;

import java.util.List;

import com.blog.pojo.Article;



/**
 * ArticleDao
 */
public interface ArticleDao {

    public List<Article> findArticleList();

    public Article findArticleById(int id);


    
}