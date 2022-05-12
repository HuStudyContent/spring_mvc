package com.kuang.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class UserController {


  @RequestMapping(value = "/json1")
//  @ResponseBody
  public String test() throws JsonProcessingException {
    //创建一个jackjson的对象映射器， 用来解析数据
    ObjectMapper mapper = new ObjectMapper();

    //创建一个对象
    User user = new User("胡歌", 32, "男");

    //讲对象解析成json格式
    String str = mapper.writeValueAsString(user);
    // @ResponseBody 会将str转换成json返回
    return str;
  }

  @RequestMapping("/json2")
  public String json2() throws JsonProcessingException {

    //创建一个jackson的对象映射器，用来解析数据
//    ObjectMapper mapper = new ObjectMapper();

    //创建一个对象
    User user1 = new User("秦疆1号", 3, "男");
    User user2 = new User("秦疆2号", 3, "男");
    User user3 = new User("秦疆3号", 3, "男");
    User user4 = new User("秦疆4号", 3, "男");
    List<User> list = new ArrayList<User>();
    list.add(user1);
    list.add(user2);
    list.add(user3);
    list.add(user4);

    //将我们的对象解析成为json格式
//    String str = mapper.writeValueAsString(list);

    return JsonUtils.getJson(list);
  }

  @RequestMapping("/json3")
  public String test2() throws JsonProcessingException{
    ObjectMapper mapper = new ObjectMapper();

    Date date = new Date();

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    String str = mapper.writeValueAsString(sdf.format(date));

    return str;
  }


  @RequestMapping("/json4")
  public String test3() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();

    //不使用时间戳的方式
    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    //自定义日期格式对象
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //指定日期格式
    mapper.setDateFormat(sdf);

    Date date = new Date();
    String str = mapper.writeValueAsString(date);

    return str;
  }


  @RequestMapping("/json5")
  public String test4() throws JsonProcessingException{
    Date date = new Date();
    return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
  }

}
