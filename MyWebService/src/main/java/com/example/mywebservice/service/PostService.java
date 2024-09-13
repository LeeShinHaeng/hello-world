package com.example.mywebservice.service;

import com.example.mywebservice.dto.PostDto;
import com.example.mywebservice.entity.Post;
import com.example.mywebservice.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    @Transactional
    public PostDto createPost(PostDto postDto) {
        Post post = new Post(postDto.getTitle(), postDto.getContent(), postDto.getAuthor());
        Post savePost = postRepository.save(post);

        return convertToDto(savePost);
    }

    @Transactional(readOnly = true)
    public List<PostDto> getAllPosts() {
        return postRepository.findAll()
                .stream()
                .map(PostService::convertToDto)
                .toList();
    }

    @Transactional(readOnly = true)
    public Optional<PostDto> getPostById(Long id) {
        return postRepository.findById(id)
                .map(PostService::convertToDto);
    }

    @Transactional
    public PostDto updatePost(Long id, PostDto postDto) {
        return postRepository.findById(id)
                .map(post -> {
                    post.setTitle(postDto.getTitle());
                    post.setContent(postDto.getContent());
                    post.setAuthor(postDto.getAuthor());
                    return convertToDto(postRepository.save(post));
                })
                .orElseThrow(
                        () -> new RuntimeException("Post not found")
                );
    }

    @Transactional
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    private static PostDto convertToDto(Post post) {
        PostDto savePostDto = new PostDto();
        savePostDto.setId(post.getId());
        savePostDto.setTitle(post.getTitle());
        savePostDto.setContent(post.getContent());
        savePostDto.setAuthor(post.getAuthor());
        return savePostDto;
    }
}
