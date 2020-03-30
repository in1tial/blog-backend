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

    
    public List<Article> getDaoResult() {
        
        List<Article> rlt = artcileDao.getAllArticle();
        
        return rlt;

    }

    
    
}