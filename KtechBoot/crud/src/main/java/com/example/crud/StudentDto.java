package com.example.crud;
/*
* 학생 정보를 담은 용도 크레스
*
* DTO : Data Tranfer Object*/

public class StudentDto {
    private Long id;
    private String name;
    private String email;

    public StudentDto(){}

    public StudentDto(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emial='" + email + '\'' +
                '}';
    }
}
