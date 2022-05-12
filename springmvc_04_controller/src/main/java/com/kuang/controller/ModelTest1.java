package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ModelTest1 {

  //无视图解析器情况下

  @RequestMapping("/rsm/t1")
  public String test1(Model model){
    //转发一
    model.addAttribute("msg","hello");
    return "/WEB-INF/jsp/test.jsp";
  }

  @RequestMapping("/rsm/t2")
  public String test2(){
    return "forward:/WEB-INF/jsp/test.jsp";
  }

  @RequestMapping("/rsm/t3")
  public String test3(){
    //重定向
    return "redirect:/form.jsp";
  }


}
