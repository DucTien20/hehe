package com.example.project2.repo;


import com.example.project2.model.Article;
import com.example.project2.model.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class BoardService {
        private final BoardRepository boardRepository;
        private final ArticleRepository articleRepository;
        private final CommentRepository commentRepository;
        public BoardService(BoardRepository boardRepository, ArticleRepository articleRepository, CommentRepository commentRepository) {
            this.boardRepository = boardRepository;
            this.articleRepository = articleRepository;
            this.commentRepository = commentRepository;
        }
        public List<Board> readAllBoards() {
            return boardRepository.findAll();
        }
        public Board readBoard(Long id) {
            return boardRepository.findById(id).orElse(null);
        }


        public List<Article> getArticlesByBoardId(Long boardId) {
            return articleRepository.findByBoardId(boardId);
        }
    }

