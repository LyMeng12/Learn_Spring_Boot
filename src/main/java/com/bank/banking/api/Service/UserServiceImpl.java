package com.bank.banking.api.Service;

import com.bank.banking.api.Model.User;

public class UserServiceImpl implements UserService {
    @Override
    public User findById() {
        User user = new User();
        user.setId(1);
        user.setName("John");
        return user;
    }
}
