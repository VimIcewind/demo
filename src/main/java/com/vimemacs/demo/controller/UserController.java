package com.vimemacs.demo.controller;

import com.vimemacs.demo.model.User;
import com.vimemacs.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HWD on 2019/8/22 11:28
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    public User getUser() {
        User user = userRepository.findByUserName("aa");
        System.out.println("若下面没有出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
     }
}
