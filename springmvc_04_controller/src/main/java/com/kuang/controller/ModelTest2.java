package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest2 {

  @RequestMapping("/rsm2/t1")
  public String test1(){
    return "test";
  }


  @RequestMapping("/rsm2/t2")
  public String test2(){
    //重定向
    return "redirect:/form.jsp";
  }



}
