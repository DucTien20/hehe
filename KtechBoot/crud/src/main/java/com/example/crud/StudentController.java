package com.example.crud;

import org.apache.logging.log4j.util.PerformanceSensitive;
import org.apache.tomcat.util.net.jsse.JSSEUtil;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private StudentService service;
    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping("create-view")
    public String createView(){
        return "create.html";
    }
    @PostMapping("create")
    public String create(
            @RequestParam("name")
            String name,
            @RequestParam("email")
            String email
    ){
        service.createStudent(name, email);
        return "redirect:/create-view";
    }
    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("studentList", service.getAllStudent());
        return "home.html";
    }
    @GetMapping("{id}")
    public String readOne(
            @PathVariable("id")
            Long id,
            Model model
    ){

        StudentDto dto = service.readStudent(id);
       model.addAttribute("student", dto);
       return "read.html";

    }
    @GetMapping("{id}/update-view")
    public String updateView(
            @PathVariable("id")
            Long id,
            Model model
    ){
        StudentDto dto = service.readStudent(id);
        model.addAttribute("student", dto);
        return "update.html";
    }
    @PostMapping("{id}/update")
    public String update(
            @PathVariable("id")
            Long id,
            @RequestParam("name")
            String name,
            @RequestParam("email")
            String email
    ){
        service.updateStudent(id, name, email);
        // POST -redireact - GEt
        return String.format("redirect:/%s",id);
    }
    @GetMapping("{id}/delete-view")
    public String dateleView(
            @PathVariable("id")
            Long id,
            Model model
    ){
        StudentDto dto = service.readStudent(id);
        model.addAttribute("student", dto);
        return "delete.html";
    }
    @PostMapping("{id}/delete")
    public String delete(
            @PathVariable("id")
            Long id
    ){
        service.deleteStudent(id);
        return "redirect:/home";
    }
}
