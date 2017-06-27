package com.dragonball.controller;

import com.alibaba.fastjson.JSONObject;
import com.dragonball.model.User;
import com.dragonball.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Allard
 * Created by dw on 2017/6/26.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> selectAll(User user) {
        return userService.getAll();
    }

    @RequestMapping("/page")
    public PageInfo<User> page(User user) {
        return userService.getPage(user);
    }

}
