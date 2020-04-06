package com.blog.pojo;

import java.sql.Timestamp;

public class Meta {
    private String articleCategory;
    private String articleTags;
    private Timestamp createDate;
    private Timestamp updateDate;

    public Meta() {}

    public Meta(String articleCategory, String articleTags, Timestamp createDate, Timestamp updateDate) {
        this.articleCategory = articleCategory;
        this.articleTags = articleTags;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticleTags() {
        return articleTags;
    }

    public void setArticleTags(String articleTags) {
        this.articleTags = articleTags;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    

   
    
    
}