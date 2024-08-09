package com.example.practice;

import com.example.practice.model.Article;
import com.example.practice.repo.ArticleRepository;
import com.example.practice.repo.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private final ArticleRepository repository;
    private final CommentRepository commentRepository;

    public ArticleService(
            ArticleRepository repository,
            CommentRepository commentRepository

    ){
        this.repository = repository;
        this.commentRepository = commentRepository;
    }

    //CREATE
    public Article create(
            String title,
            String comment,
            String writer
    ){
        Article article = new Article();
        article.setId(id);
        article.setTitle(title);
        article.setComment(comment);
        article.setWriter(writer);


        return repository.save(article);
    }

}
