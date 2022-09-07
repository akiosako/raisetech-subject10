package com.raisetech.resttemplatedemo.service;

import com.raisetech.resttemplatedemo.entity.DeleteForm;
import com.raisetech.resttemplatedemo.entity.InsertForm;
import com.raisetech.resttemplatedemo.entity.UpdateForm;
import com.raisetech.resttemplatedemo.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {
    List<User> findAll();

    Optional<User> findById(int id);

    void insertUser(InsertForm insertForm);

    void updateUser(UpdateForm updateForm);

    void deleteUser(DeleteForm deleteForm);

}
