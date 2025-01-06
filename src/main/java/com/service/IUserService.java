package com.service;

import com.model.User;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserService extends IService<User> {
    UserDetails loadUserByUsername(String username);
}
