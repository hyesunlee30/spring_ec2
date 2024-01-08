package com.example.post.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class PostController {
    private PostService service;

    PostController(PostService service){
        this.service = service;
    }

    @GetMapping("/csr/json")
    @ResponseBody
    List<Post> findAll() {
        return service.findAll();
    }

    @GetMapping("/csr/json/{id}")
    @ResponseBody
    public Post findById(@PathVariable(value="id") String id) {
        return service.findById(id);
    }

    @GetMapping("/ssr")
    public String findAllSsr(Model model) {
        List<Post> posts = service.findAll();
        model.addAttribute("posts",posts);
        return "post_list";
    }

}


