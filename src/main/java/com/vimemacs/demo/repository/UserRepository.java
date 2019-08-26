package com.vimemacs.demo.repository;

import com.vimemacs.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by HWD on 2019/8/24 16:03
 */
public interface UserRepository  extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String userName, String email);
}
