package com.example.practice.repo;

import com.example.practice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository
extends JpaRepository <Comment, Long>{
}
