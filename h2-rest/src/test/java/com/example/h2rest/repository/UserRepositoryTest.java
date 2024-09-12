package com.example.h2rest.repository;

import com.example.h2rest.entity.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTest {
    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveAndFindById() throws Exception {
        //given
        User user = new User();
        user.setName("Jane");
        user.setEmail("jane@gmail.com");

        //when
        User saved = userRepository.save(user);
        User found = userRepository.findById(saved.getId()).orElse(null);

        //then
        if(found != null) {
            logger.info("{} {}", found.getName(), found.getEmail());
        } else {
            logger.error("{}", user.getId());
        }

        assertThat(found.getName()).isEqualTo("Jane");
        assertThat(found.getEmail()).isEqualTo("jane@gmail.com");
        assertThat(found).isEqualTo(saved);

        logger.info("테스트 종료");
    }

}
