package com.example.article.Article.Demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blog")
public class Article {
    @Id
    private String articleId;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "CONTENT")
    private String content;
    //@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX", shape = JsonFormat.Shape.STRING)
    @Column(name = "DATE")
    private LocalDateTime publishDate;
    @Column(name = "TAGS")
    private List<String> tags;

}
