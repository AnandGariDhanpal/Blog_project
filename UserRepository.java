package com.spring.mysql.blogproject;

import org.springframework.data.repository.CrudRepository;
import com.spring.mysql.blogproject.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    // public void save(Post post) {
        
    // }    
}  