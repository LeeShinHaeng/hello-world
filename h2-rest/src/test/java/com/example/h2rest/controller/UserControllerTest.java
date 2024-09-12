package com.example.h2rest.controller;

import com.example.h2rest.dto.UserDto;
import com.example.h2rest.entity.User;
import com.example.h2rest.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;  // REST 요청을 테스트 하기 위한 템플릿

    @Autowired
    private UserRepository userRepository;  // 실제 DB와 상호작용 Mock이 아님

    @BeforeEach
    void setUp() {
        System.out.println("테스트 준비, DB User 테이블 clear");
        userRepository.deleteAll();
    }

    @Test
    public void testCreateUser() throws Exception {
        //given
        System.out.println("[테스트] 새로운 사용자 John 생성");
        UserDto userDto = new UserDto();
        userDto.setName("John");
        userDto.setEmail("john@gmail.com");

        //when
        System.out.println("[테스트] HttpEntity 생성");
        HttpEntity<UserDto> request = new HttpEntity<>(userDto);

        System.out.println("[테스트] /user 경로로 POST 요청 보내기");
        ResponseEntity<User> response = restTemplate.exchange(
                "/user",
                HttpMethod.POST,
                request,
                User.class);

        //then
        System.out.println("[검증] 응답 상태 코드 : " + response.getStatusCode());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getName()).isEqualTo(userDto.getName());
        assertThat(response.getBody().getEmail()).isEqualTo(userDto.getEmail());
    }

    // exp mission
    // 사용자 조회 API 테스트
    // : DB에 미리 저장한 사용자를 조회하는 APi를 호출하고, 검증
    @Test
    public void testGetUserById() throws Exception{
        // 사용자 저장
        System.out.println("[테스트] 새로운 사용자 John 생성");
        User user = new User();
        user.setEmail("john@gmail.com");
        user.setName("John");
        userRepository.save(user);

        // 사용자 조회
        System.out.println("[테스트] /user/{id} 경로로 GET 요청 보내기");
        ResponseEntity<User> response = restTemplate.getForEntity(
                "/user/"+user.getId(),
                User.class);

        // 검증
        System.out.println("[검증] 응답 상태 코드 : " + response.getStatusCode());
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getName()).isEqualTo(user.getName());
        assertThat(response.getBody().getEmail()).isEqualTo(user.getEmail());
    }
}
