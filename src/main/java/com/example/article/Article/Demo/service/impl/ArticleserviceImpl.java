package com.example.article.Article.Demo.service.impl;

import com.example.article.Article.Demo.entity.Article;
import com.example.article.Article.Demo.repository.ArticleRepo;
import com.example.article.Article.Demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class ArticleserviceImpl implements ArticleService {

    @Autowired
    private ArticleRepo articleRepository;

    @Override
    public Article create(Article article) {
        String articleId=UUID.randomUUID().toString();
        article.setArticleId(articleId);

        return articleRepository.save(article);
    }

    @Override
    public List<Article> getAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article getById(String id) {
        return articleRepository.findById(id).orElseThrow(null);
    }

    @Override
    public Article update(String id, Article update) {
        Article existingArticle=articleRepository.findById(id).orElse(null);
        if(existingArticle!=null){
            existingArticle.setTitle(update.getTitle());
            existingArticle.setContent(update.getContent());
            existingArticle.setPublishDate(update.getPublishDate());
            existingArticle.setTags(update.getTags());

            return articleRepository.save(existingArticle);
        }
            return null;

    }

    @Override
    public void delete(String id) {
        articleRepository.deleteById(id);

    }
}
