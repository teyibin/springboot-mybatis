package com.tokukun.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tokukun.blog.entity.User;
import com.tokukun.blog.mapper.UserMapper;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
	public List<User> queryAllUsers() {
;
        return userMapper.queryAllUsers();
    }
}
