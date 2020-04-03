package com.blog.article;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.blog.commonBean.RestResponse;

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
    public RestResponse findArticleList() {
        
        List<Article> artList = artcileDao.findArticleList();
        
        Iterator<Article> itor = artList.iterator();

        List<Object> articleListFormated = new ArrayList<>();

        while (itor.hasNext()) {
            Article article = itor.next();
        
            Map<String,Object> metas = new HashMap<>();
            
            metas.put("articleCategory", article.getArticleCategory());
            metas.put("articleTag", article.getArticleTag());
            metas.put("createDate", article.getCreateDate());
            metas.put("updateDate", article.getCreateDate());
            
            Map<String,Object> post = new HashMap<>();
            post.put("articleTitle", article.getArticleTitle());
            post.put("articleContent", article.getArticleContent());
            post.put("metas", metas);

            articleListFormated.add(post);
        }
        
        return new RestResponse("hello");
    }

    // 处理单个文章
    public RestResponse findArticleById(int id) {
        Article article = artcileDao.findArticleById(id);
        return new RestResponse(article);
    }

    
    
}