package com.dragonball.cell.service;

import com.dragonball.cell.mapper.UserMapper;
import com.dragonball.cell.model.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Allard
 * Created by dw on 2017/6/26.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAll() {
        return userMapper.selectAll();
    }

    public PageInfo<User> getPage(User user) {
        PageHelper.startPage(user.getPage(), user.getRows());
        PageInfo<User> userPageInfo = new PageInfo<>(userMapper.selectAll());
        return userPageInfo;
    }

}
