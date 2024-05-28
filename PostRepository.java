package com.spring.mysql.blogproject;

import org.springframework.data.repository.CrudRepository;
import com.spring.mysql.blogproject.Post;

public interface PostRepository extends CrudRepository<Post, Integer> {
    // public void save(Post post) {
        
    // }    
}  