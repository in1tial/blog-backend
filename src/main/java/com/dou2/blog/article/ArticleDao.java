package com.dou2.blog.article;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * ArticleDao
 */
@Mapper
public interface ArticleDao {

    @Select("select * from t_article;")
    public List<Article> getAllArticle();
    
}