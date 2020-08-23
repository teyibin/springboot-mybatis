package com.tokukun.blog.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tokukun.blog.entity.User;
@Mapper
public interface  UserMapper {
	List<User> queryAllUsers();
}
