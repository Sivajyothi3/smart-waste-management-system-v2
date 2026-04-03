package com.smartwaste.service;

import com.smartwaste.model.User;

public interface AuthService {

    User login(String email, String password);

    User signup(String username, String email, String password);
}