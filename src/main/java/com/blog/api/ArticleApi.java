package com.blog.api;

import com.blog.service.ArticleService;
import com.blog.commonBean.RestResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ArticleApi
 */
@RestController
@RequestMapping("/Article")
@CrossOrigin
public class ArticleApi {

    @Autowired
    ArticleService articleService;

    @GetMapping("/List")
    public RestResponse getArticleList(){
        
        RestResponse list =  articleService.findArticleList();
        
        /* for(Article article: list){
            System.out.println(article);
        } */
        return list;       
    }

    @GetMapping("/{id}")
    public RestResponse getArticleById(@PathVariable int id){
        
        RestResponse article =  articleService.findArticleById(id);
        return article;       
    }

     

}