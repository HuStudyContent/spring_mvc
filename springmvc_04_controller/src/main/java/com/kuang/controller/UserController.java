package com.kuang.controller;


import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

  @RequestMapping("/t1")
  public String test1(@RequestParam("username") String name, Model model){
    //1.接受前端参数
    System.out.println("前端参数为:"+name);

    //2.将返回的结果参会给前端， model
    model.addAttribute("msg",name);

    //3.视图跳转
    return "test";
  }

  @GetMapping("/t2")
  public String test2(User user){
    System.out.println(user);
    return "test";
  }


  @RequestMapping("/hello")
  public String hello(@RequestParam("username") String name, ModelMap model){

    model.addAttribute("name",name);
    System.out.println(name);
    return "test";
  }

  @RequestMapping("/hello2")
  public String hello2(@RequestParam("username") String name, Model model){
    model.addAttribute("msg",name);
    System.out.println(name);
    return "test";
  }

}
