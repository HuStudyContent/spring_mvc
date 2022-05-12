package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

  //http://localhost:8080/add?a=1&b=3   原来的风格
  //restFul:  http://localhost:8080/add/a=1/b=3

  @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.POST)
  public String test1(@PathVariable int a,@PathVariable String b, Model model){
    String res = a + b;
    model.addAttribute("msg","结果为"+res);
    return "test";
  }

}
