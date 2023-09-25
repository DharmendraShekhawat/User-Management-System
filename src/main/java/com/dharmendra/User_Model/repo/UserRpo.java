package com.dharmendra.User_Model.repo;

import com.dharmendra.User_Model.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRpo extends CrudRepository<User, Integer> {


}
