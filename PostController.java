package com.spring.mysql.blogproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/post")
public class PostController {
    @Autowired
    private PostRepository postRepository;
    @PostMapping(path = "/add")
    public @ResponseBody Post addNewPost(@RequestParam String author, @RequestParam String title, @RequestParam String content ){
        Post su = new Post();
        su.setAuthor(author);
        su.setTitle(title);
        su.setContent(content);
        postRepository.save(su);
        return su;
    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Post> getAllPosts(){
        return postRepository.findAll();
    }
}


