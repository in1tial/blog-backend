package com.blog.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ArticleApi
 */
@RestController
@RequestMapping("/Article")
public class ArticleApi {

    @Autowired
    ArticleService articleService;

    @GetMapping("/List")
    public List<Article> getArticleList(){
        
        List<Article> list =  articleService.findArticleList();
        
        /* for(Article article: list){
            System.out.println(article);
        } */
        return list;       
    }

    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable int id){
        
        Article article =  articleService.findArticleById(id);
        return article;       
    }

     

}