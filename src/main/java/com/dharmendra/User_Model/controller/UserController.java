package com.dharmendra.User_Model.controller;

import com.dharmendra.User_Model.model.User;
import com.dharmendra.User_Model.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

// add users
    @PostMapping("users")
    public String addUserList(@RequestBody @Valid List<User> user){

        return userService.addUsers(user);
    }
            // add single user
    @PostMapping("user")
    public String addUser(@RequestBody @Valid User user) {

        return userService.addUser(user);
    }

             // get user by Id
    @GetMapping("user/userId/{id}")
    public User getUser(@Valid @PathVariable Integer id){

        return userService.getUser(id);
    }
    // get all users
    @GetMapping("users/list")
    public List<User> getAllUser(){

        return userService.getAllUsers();
    }
    //
    @PutMapping("user/userid/{id}")
    public String updateUserByUserId(@PathVariable Integer id, @Valid @RequestBody User user){
        return userService.updateUser(id, user);
    }
    // delete by id
    @DeleteMapping("user/userid/{id}")
    public String deleteUserByUserId(@PathVariable Integer id){
        return userService.deleteUser(id);
    }

}
