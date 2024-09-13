package com.example.mywebservice.controller;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostRestController {
    private final PostService postService;

    @GetMapping
    public List<PostDto> list() {
        return postService.getAllPosts();
    }

    @PostMapping("/create")
    public PostDto createPost(@RequestBody PostDto postDto) {
        return postService.createPost(postDto);
    }

    @GetMapping("/{id}")
    public PostDto detail(@PathVariable Long id) {
        return postService.getPostById(id).orElseThrow(
                () -> new RuntimeException("Post not found")
        );
    }

    @GetMapping("/{id}/edit")
    public PostDto edit(@PathVariable Long id) {
        return postService.getPostById(id).orElseThrow(
                () -> new RuntimeException("Post not found")
        );
    }

    @PostMapping("/{id}/edit")
    public PostDto editPost(@PathVariable Long id, @RequestBody PostDto updatePostDto) {
        return postService.updatePost(id, updatePostDto);
    }

    @PostMapping("/{id}/delete")
    public void delete(@PathVariable Long id) {
        postService.deletePost(id);
    }
}
