package com.example.article.Article.Demo.service;

import com.example.article.Article.Demo.entity.Article;

import java.util.List;

public interface ArticleService {

//    create article
    Article create(Article article);


//    Get All articles
    List<Article> getAll();

//    Get Article by ArticleId
    Article getById(String id);

//    Update Article
    Article update(String id,Article update);

//    Delete Article
    void delete(String id);

}
