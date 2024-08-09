package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;

@Controller
public class MvcController {
 @RequestMapping("text")
 public String text(Model model){
  model.addAttribute("name", "tien");
  model.addAttribute("major", "CSR");

  return "text.html";
 }

 @RequestMapping("text-object")
 public String textObj(Model model){
  student alex = new student("Alex", "alex@gnail.com");
  model.addAttribute("student", alex);
  return "text-object.html";
 }

 @RequestMapping("is-logged-in")
 public String isloggedin(Model model){
  model.addAttribute("is logged in", isloggedin());
          return "if-unless.html";
 }
 public boolean isloggedin(){
  return (new Random()).nextInt() %2 ==0;
 }
 @RequestMapping("each")
 public String eachNames(Model model){
  List<String> names = List.of("Alex", "Brad","rex", "Dave","Fred");
//  for(String name : names){
//   System.out.println(name);
//  }
  model.addAttribute("names", names);model.addAttribute("names", names);

  List<student> students = List.of(
          new student("alex", "hehe.@gmail.com"),
          new student("brad","brwad@gmail.com"),
          new student("rex","rex@gmail.com")
  );
  for(student student : students){
   System.out.println(student);
  }
  model.addAttribute("students",students);

  return "each.html";
 }

}
