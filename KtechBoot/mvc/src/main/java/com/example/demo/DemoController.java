package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    private TempComponent tempComponent;


    public DemoController(TempComponent tempComponent){
        this.tempComponent = tempComponent;
    }

   @RequestMapping("home")
    public String home(Model model){
        model.addAttribute("messages","heello Thymeleaf");
        model.addAttribute("year",2024);
        model.addAttribute("name", " Tien");
        model.addAttribute("student",
                new student("Alex", "alex@gmail.com"));
       return "home.html";
    }
    @RequestMapping("profile")
    public String profile(){
       return "profile.html";
    }
    @RequestMapping("hehe")
    public String address(){
       return "address.html";
    }

}
