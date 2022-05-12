package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class HelloController{

  @RequestMapping("/hello")
  public String hello(Model model){
    //封装数据
    model.addAttribute("msg","helloSpringMVC");
    return "test";   //会被视图解析器处理
  }


}
