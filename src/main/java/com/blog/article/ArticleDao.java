package com.blog.article;

import java.util.List;

import org.apache.ibatis.annotations.Select;

/**
 * ArticleDao
 */

public interface ArticleDao {

    @Select("select * from t_article;")
    public List<Article> getAllArticle();
    
}