package com.dharmendra.User_Model.service;

import com.dharmendra.User_Model.exception.UserNotFoundException;
import com.dharmendra.User_Model.model.User;
import com.dharmendra.User_Model.repo.UserRpo;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRpo childUser;

    public String addUsers(List<User> user) {
        childUser.saveAll(user);
        return user.size() + "added successfully";
    }

    public String addUser(User user) {
        childUser.save(user);
        return  user.getUserId() + " added successfully";
    }
    public User getUser(Integer id) {
       Optional<User> optional = childUser.findById(id);
      if(optional.isPresent()){
          User u = optional.get();
          return u;
      }
      else{
          throw new UserNotFoundException("Invalid Userid!!");
      }
    }
    public List<User> getAllUsers() {
      return  (List<User>) childUser.findAll();
    }
    public String updateUser(Integer id , User user) {
        User u = getUser(id);

        u.setUserName(user.getUserName());
        u.setContactNumber(user.getContactNumber());
        childUser.save(u);
        return id +" updated";
    }

    public String deleteUser(Integer id) {
        childUser.deleteById(id);
        return id + " deleted";
    }
}
