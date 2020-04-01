package com.blog.article;

import java.util.List;



/**
 * ArticleDao
 */
public interface ArticleDao {

    public List<Article> findArticleList();

    public Article findArticleById(int id);


    
}