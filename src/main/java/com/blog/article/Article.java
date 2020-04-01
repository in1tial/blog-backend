package com.blog.article;


public class Article {
    int articleId;
    String articleTitle;
    String articleContent;
    int articleCategory;
    String createDate;
    String updateDate;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public int getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(int articleCategory) {
        this.articleCategory = articleCategory;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return ("id: "+ this.articleId + " title: " + this.articleTitle);
    }
    
    
}