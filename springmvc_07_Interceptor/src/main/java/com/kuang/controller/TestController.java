package com.kuang.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


  @RequestMapping("/t1")
  public String test1(){
    System.out.println("控制器中的方法执行了");
    return "hello";
  }
}
