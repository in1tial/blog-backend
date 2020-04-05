package com.blog.article;

import java.sql.Timestamp;

public class Meta {
    private String articleCategory;
    private String articleTag;
    private Timestamp createDate;
    private Timestamp updateDate;

    public Meta() {}

    public Meta(String articleCategory, String articleTag, Timestamp createDate, Timestamp updateDate) {
        this.articleCategory = articleCategory;
        this.articleTag = articleTag;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
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