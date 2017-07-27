package com.springbootvue.api.auth;

import com.springbootvue.api.user.model.User;

public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}
