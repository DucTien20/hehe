package com.example.practice;

import com.example.practice.model.Article;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("article")
public class ArticleController {
private final ArticleService service;
public ArticleController(ArticleService service){
    this.service = service;
}

//CREATE
@GetMapping("create-view")
    public String createView(){
    return "articles/create.html";
}

@PostMapping("create")
    public String create(
            @RequestParam("title")
            String title,
            @RequestParam("content")
            String content,
            @RequestParam("writer")
            String writer
){
     Long id = service.create( title, content, writer).getId();
     // POST - rederect - GET
     return String.format("redirect:/articles/%d", id);
}

//READ ALL

    @GetMapping
    public String readAll( Model model){
    model.addAttribute("article", service.readAll());
    return "articles/home.html";
    }
//READ ONE
    @GetMapping("{id}")
    public String readOne(
            @PathVariable("id")
            long id,
            Model model
    ){
    model.addAttribute("article", service.readOne(id));
    return "articles/read.html";
    }



}
