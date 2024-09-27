package com.example.myboard.post.service;

import com.example.myboard.post.db.PostEntity;
import com.example.myboard.post.db.PostRepository;
import com.example.myboard.post.model.PostRequest;
import com.example.myboard.post.model.PostResponse;
import com.example.myboard.post.model.PostViewRequest;
import com.example.myboard.post.model.PostViewResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public PostResponse create(PostRequest postRequest) {
        var entity = PostEntity.builder()
                .boardId(1L)    // TODO 임시 고정
                .userName(postRequest.getUserName())
                .password(postRequest.getPassword())
                .email(postRequest.getEmail())
                .status("REGISTERED")
                .title(postRequest.getTitle())
                .content(postRequest.getContent())
                .postedAt(LocalDateTime.now())
                .build();

        var saved = postRepository.save(entity);

        return PostResponse.builder()
                .id(saved.getId())
                .status(saved.getStatus())
                .build();
    }

    public PostViewResponse view(@Valid PostViewRequest postViewRequest) {
        var foundPost = postRepository.findById(postViewRequest.getPostId())
                .map(it -> {
                            if (!it.getPassword().equals(postViewRequest.getPassword())) {
                                var format = "Password does not match %s vs %s";
                                throw new RuntimeException(
                                        String.format(format,
                                                it.getPassword(),
                                                postViewRequest.getPassword()
                                        )
                                );
                            }
                            return it;
                        }
                )
                .orElseThrow(() -> new RuntimeException("Post Not Found"));

        return PostViewResponse.builder()
                .id(foundPost.getId())
                .userName(foundPost.getUserName())
                .email(foundPost.getEmail())
                .title(foundPost.getTitle())
                .content(foundPost.getContent())
                .postedAt(foundPost.getPostedAt())
                .build();
    }
}
