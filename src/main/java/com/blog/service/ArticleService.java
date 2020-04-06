package com.blog.service;

import java.util.List;

import com.blog.commonBean.RestResponse;
import com.blog.mapper.ArticleMapper;
import com.blog.pojo.Article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * ArticleService
 */

@Service
public class ArticleService {

    @Autowired
    ArticleMapper artcileMapper;
    
    // 处理文章列表
    public RestResponse findArticleList() {
        
        List<Article> artList = artcileMapper.findArticleList();
        return new RestResponse(artList);
        // Iterator<Article> itor = artList.iterator();

        // List<Object> articleListFormated = new ArrayList<>();

        // while (itor.hasNext()) {
        //     Article article = itor.next();
        
        //     Map<String,Object> metas = new HashMap<>();
            
        //     metas.put("articleCategory", article.getArticleCategory());
        //     metas.put("articleTag", article.getArticleTag());
        //     metas.put("createDate", article.getCreateDate());
        //     metas.put("updateDate", article.getCreateDate());
            
        //     Map<String,Object> post = new HashMap<>();
        //     post.put("articleTitle", article.getArticleTitle());
        //     post.put("articleContent", article.getArticleContent());
        //     post.put("metas", metas);

        //     articleListFormated.add(post);
        // }
        
        // return new RestResponse("hello");
    }

    // 处理单个文章
    public RestResponse findArticleById(int id) {
        Article article = artcileMapper.findArticleById(id);
        return new RestResponse(article);
    }

    
    
}