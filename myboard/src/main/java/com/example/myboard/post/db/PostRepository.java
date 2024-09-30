package com.example.myboard.post.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {

    // select * from post where id=? and status=? order by id desc limit 1
    Optional<PostEntity> findFirstByIdAndStatusOrderByIdDesc(Long id, String status);

    // select * from post where status=? order by id
    List<PostEntity> findAllByStatusOrderByIdDesc(String status);
}
