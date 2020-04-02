package com.blog.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ArticleService
 */

@Service
public class ArticleService {

    @Autowired
    ArticleDao artcileDao;
    
    

    // 处理文章列表
    public List<Article> findArticleList() {
        List<Article> rlt = artcileDao.findArticleList();


        return rlt;

    }

    // 处理单个文章
    public Article findArticleById(int id){
        Article article = artcileDao.findArticleById(id);
        return article;
    }

    
    
}