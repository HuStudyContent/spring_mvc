package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //代表这个类会被spring接管
//被这个注解的类，中的所有方法，如果返回值是String, 并且具有具体的页面可以跳转，那么就会被视图解析器解析
public class ControllerTest2 {

  @RequestMapping("/h2")
  public String test(Model model){

    model.addAttribute("msg","hello controller");

    return "test";
  }

}
