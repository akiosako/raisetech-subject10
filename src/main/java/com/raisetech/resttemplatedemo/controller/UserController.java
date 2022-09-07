package com.raisetech.resttemplatedemo.controller;

import com.raisetech.resttemplatedemo.entity.DeleteForm;
import com.raisetech.resttemplatedemo.entity.InsertForm;
import com.raisetech.resttemplatedemo.entity.UpdateForm;
import com.raisetech.resttemplatedemo.entity.User;
import com.raisetech.resttemplatedemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/Users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/Users/{id}")
    public Optional<User> findById(@PathVariable int id) {
        return userService.findById(id);
    }


    @PostMapping("/Users")
    public ResponseEntity<String> insertUser(@RequestBody InsertForm insertForm) {
        userService.insertUser(insertForm);
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/Users/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully inserted");

    }

    @PatchMapping("/Users/{id}")
    public ResponseEntity<Map<String, String>> updateUser(@PathVariable("id") int id, @RequestBody UpdateForm updateForm) {
        updateForm.setId(id);
        try {
            userService.updateUser(updateForm);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/Users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id, DeleteForm deleteForm) {
        try {
            userService.deleteUser(deleteForm);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok().body("name successfully deleted");
    }
}


