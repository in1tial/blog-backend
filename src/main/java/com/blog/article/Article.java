package com.blog.article;

import java.sql.Timestamp;

public class Article {
    private int articleId;
    private String articleTitle;
    private String articleContent;
    private int articleCategory;
    private int articleTag;
    private Timestamp createDate;
    private Timestamp updateDate;

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

    public int getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(int articleTag) {
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

    @Override
    public String toString() {
        return "Article [articleCategory=" + articleCategory + ", articleContent=" + articleContent + ", articleId="
                + articleId + ", articleTag=" + articleTag + ", articleTitle=" + articleTitle + ", createDate="
                + createDate + ", updateDate=" + updateDate + "]";
    }
     
}