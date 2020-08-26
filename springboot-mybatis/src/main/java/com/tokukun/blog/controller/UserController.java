package com.tokukun.blog.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
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
	@Retryable(value= {Exception.class}, maxAttempts = 5, backoff=@Backoff(delay=1000))
	   public List<User> queryAllUsers() throws Exception{
		System.out.print("sdfsdfsdf");

        logger.info("infoZHENGMINSDFSDFASFASDFASDFSADFSDF");
        String test = null;
        if (test ==null) {
           throw new Exception(); // ここで必ず例外発生するので、リトライする
        }
        return userService.queryAllUsers();
    }
}
