package com.blog.mapper;

import java.util.List;

import com.blog.pojo.Article;



/**
 * ArticleMapper
 */
public interface ArticleMapper {

    public List<Article> findArticleList();

    public Article findArticleById(int id);


    
}