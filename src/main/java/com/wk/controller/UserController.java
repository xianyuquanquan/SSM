package com.wk.controller;

import com.alibaba.fastjson.JSON;
import com.wk.entity.User;
import com.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/12.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/queryById")
    @ResponseBody
    public String queryById(){
        User user = userService.queryById(2);
        return user.getPassword();
    }

    @ResponseBody
    @RequestMapping(value = "/test", produces="text/html;charset=UTF-8")
    public String test(){
        Map<String,Object>map = new HashMap<String,Object>();
        User user = userService.queryById(2);
        map.put("user",user);
        return JSON.toJSONString(map);
    }
}
