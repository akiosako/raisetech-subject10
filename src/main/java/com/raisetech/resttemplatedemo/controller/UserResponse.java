package com.raisetech.resttemplatedemo.controller;

import com.raisetech.resttemplatedemo.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
    private int id;
    private String name;

    public UserResponse(User user) {
        this.name = user.getName();
    }
}
