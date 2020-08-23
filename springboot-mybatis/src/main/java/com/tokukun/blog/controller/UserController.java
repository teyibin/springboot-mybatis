package com.tokukun.blog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tokukun.blog.entity.User;
import com.tokukun.blog.service.UserService;

@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;
	@RequestMapping("/test")
	   public List<User> queryAllUsers(){
		System.out.print("sdfsdfsdf");

        logger.info("infoZHENGMINSDFSDFASFASDFASDFSADFSDF");


        return userService.queryAllUsers();
    }
}
