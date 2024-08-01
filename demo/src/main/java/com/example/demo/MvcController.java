package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
 @RequestMapping("text")
 public String text(Model model){
  model.addAttribute("name", "tien");
  model.addAttribute("major", "CSR");

  return "text.html";
 }
}
