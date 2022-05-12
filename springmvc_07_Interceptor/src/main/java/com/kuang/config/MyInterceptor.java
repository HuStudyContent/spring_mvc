package com.kuang.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {


  //return false; 不执行下一个拦截器，
  //return false;  执行下一个拦截器，放行
  //在请求方法之前执行
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    System.out.println("************处理前********************");
    return true;
  }

  //在请求方法之后执行:  主要作用就是拦截日志
//  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//    System.out.println("************处理后********************");
//  }


  //在dispatcherServlet处理后执行,做清理工作.   主要作用就是拦截日志
//  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//    System.out.println("************清理********************");
//  }
}