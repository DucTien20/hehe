package org.example.article;

public class Article {
    private long id;
    private String title;
    private String content;

    public Article(){}
    public Article(
            String title,
            String content
    ){
        this.title = title;
        this.content = content;
    }
    // ㅈㅗ회할때 생성자
    public Article(
            Long id,
            String title,
            String content
    ){
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public Long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
}
