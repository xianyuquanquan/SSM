package com.wk.service.impl;

import com.wk.dao.UserMapper;
import com.wk.entity.User;
import com.wk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/12.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    public User queryById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
