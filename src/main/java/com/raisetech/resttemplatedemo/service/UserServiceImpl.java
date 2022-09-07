package com.raisetech.resttemplatedemo.service;

import com.raisetech.resttemplatedemo.entity.DeleteForm;
import com.raisetech.resttemplatedemo.entity.InsertForm;
import com.raisetech.resttemplatedemo.entity.UpdateForm;
import com.raisetech.resttemplatedemo.entity.User;
import com.raisetech.resttemplatedemo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override

    public List<User> findAll() {

        return userMapper.findAll();
    }

    @Override
    public Optional<User> findById(int id) {

        return userMapper.findById(id);
    }

    @Override
    public void insertUser(InsertForm insertForm) {

        userMapper.insertUser(insertForm);
    }

    @Override
    public void updateUser(UpdateForm updateForm) {

        userMapper.updateUser(updateForm);
    }

    @Override
    public void deleteUser(DeleteForm deleteForm) {

        userMapper.deleteUser(deleteForm);
    }
}

