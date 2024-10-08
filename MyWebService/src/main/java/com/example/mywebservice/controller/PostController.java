package com.example.mywebservice.controller;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.entity.User;
import com.example.mywebservice.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    // http://localhost:8080/posts
    @GetMapping
    public String list(Model model) {
        List<PostDto> postDtos = postService.getAllPosts();
        model.addAttribute("posts", postDtos);
        User user = getLoginUser();
        model.addAttribute("nickname", user.getNickname());

        return "list";
    }

    // http://localhost:8080/posts/create
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("post", new PostDto());
        User user = getLoginUser();
        model.addAttribute("nickname", user.getNickname());

        return "create";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute("postDto") PostDto postDto) {
        postService.createPost(postDto);
        return "redirect:/posts";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        PostDto postDto = postService.getPostById(id).orElseThrow(
                () -> new RuntimeException("Post not found")
        );
        model.addAttribute("post", postDto);

        User user = getLoginUser();
        if(user.getNickname().equals(postDto.getAuthor())) {
            model.addAttribute("isAuthor", true);
        } else {
            model.addAttribute("isAuthor", false);
        }

        return "detail";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        PostDto postDto = postService.getPostById(id).orElseThrow(
                () -> new RuntimeException("Post not found")
        );
        model.addAttribute("post", postDto);
        User user = getLoginUser();
        model.addAttribute("nickname", user.getNickname());

        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String editPost(@PathVariable Long id, @ModelAttribute("post") PostDto updatePostDto) {
        postService.updatePost(id, updatePostDto);
        return "redirect:/posts/" + id;
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/posts";
    }

    private static User getLoginUser() {
        Authentication authentication = SecurityContextHolder
                .getContext().getAuthentication();
        return (User) authentication.getPrincipal();
    }

}
