package com.example.post.post;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Service
public class PostService {

    private PostRepository repository;

    PostService(PostRepository repository) {
        this.repository = repository;
    }
    List<Post> findAll() {
        return repository.findAll();
    }

    Post findById(String id) {
        return repository.findById(Integer.parseInt(id));
    }
}
