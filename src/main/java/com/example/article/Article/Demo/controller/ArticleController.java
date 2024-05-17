package com.example.article.Article.Demo.controller;

import com.example.article.Article.Demo.entity.Article;
import com.example.article.Article.Demo.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")

public class ArticleController {

    @Autowired
    private ArticleService articleService;

//    create
    @PostMapping
    public ResponseEntity<Article> create(@RequestBody Article article){
        return ResponseEntity.status(HttpStatus.CREATED).body(articleService.create(article));

    }
//    getAll
    @GetMapping
    public ResponseEntity<List<Article>> getAll(){
        return ResponseEntity.ok(articleService.getAll());
    }
//    getBy ID
    @GetMapping("/{articleId}")
    public ResponseEntity<Article> get(@PathVariable String articleId){
        return ResponseEntity.status(HttpStatus.OK).body(articleService.getById(articleId));
    }

//    Update

    @PutMapping("/{articleId}")
    public ResponseEntity<Article> update(@PathVariable String articleId,@RequestBody Article article){

        Article updArticle=articleService.update(articleId,article);
        return updArticle!=null?ResponseEntity.ok(updArticle):ResponseEntity.notFound().build();
    }

//    Delete

    @DeleteMapping("/{articleId}")
    public ResponseEntity<?> delete(@PathVariable String articleId){
        articleService.delete(articleId);
        return ResponseEntity.noContent().build();
    }

}
