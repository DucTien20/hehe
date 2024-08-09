package com.example.practice.repo;

import com.example.practice.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository
extends JpaRepository<Article, Long> {
}
