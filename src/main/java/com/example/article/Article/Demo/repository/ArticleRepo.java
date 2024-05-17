package com.example.article.Article.Demo.repository;

import com.example.article.Article.Demo.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepo extends JpaRepository<Article, String> {
}
