package com.example.post.post;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PostRepository {

    List<Post> posts;
    PostRepository(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1,"오늘의 뉴스1","너무 졸리다","이씨"));
        this.posts.add(new Post(2,"오늘의 뉴스2","배가 고프다","김씨"));
        this.posts.add(new Post(3,"오늘의 뉴스3","집에 가고 싶다","박씨"));
        this.posts.add(new Post(4,"오늘의 뉴스4","허리가 아프다","홍씨"));
    }
    List<Post> findAll() {
        return this.posts;
    }
    Post findById(int id) {
        return posts.stream().filter(a->a.getId()==id).findFirst().get();
    }

}
