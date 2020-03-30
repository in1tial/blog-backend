package com.blog.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ArticleApi
 */
@RestController
public class ArticleApi {

    @Autowired
    ArticleService articleService;


    @GetMapping("/Article")
    public List<Article> getAllPosts(){

        List<Article> list =  articleService.getDaoResult();
        
        return list;

        
    }
     

}