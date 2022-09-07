package com.raisetech.resttemplatedemo.mapper;

import com.raisetech.resttemplatedemo.entity.DeleteForm;
import com.raisetech.resttemplatedemo.entity.InsertForm;
import com.raisetech.resttemplatedemo.entity.UpdateForm;
import com.raisetech.resttemplatedemo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM Users")
    List<User> findAll();


    @Select("SELECT * FROM users WHERE id = #{id}")
    Optional<User> findById(int id);


    @Insert("INSERT INTO users(name) VALUE(#{name});")
    void insertUser(InsertForm insertForm);

    @Update("UPDATE users SET name = #{name} WHERE id = #{id}")
    void updateUser(UpdateForm updateForm);


    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteUser(DeleteForm deleteForm);

}
