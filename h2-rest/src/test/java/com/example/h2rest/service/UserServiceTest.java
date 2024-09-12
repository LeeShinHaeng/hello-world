package com.example.h2rest.service;

import com.example.h2rest.dto.UserDto;
import com.example.h2rest.entity.User;
import com.example.h2rest.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;

    @Mock
    private UserRepository userRepository;

    @Test
    public void testCreateUser() throws Exception{
        //given
        UserDto userDto = new UserDto();
        userDto.setName("John");
        userDto.setEmail("john@example.com");

        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());

        //when
        when(userRepository.save(any(User.class))).thenReturn(user);
        User createdUser = userService.createUser(userDto);

        //then
        assertEquals(userDto.getName(), createdUser.getName());
        assertEquals(userDto.getEmail(), createdUser.getEmail());
        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    public void testCreateUserWithRollback() throws Exception{
        //given
        UserDto userDto = new UserDto();
        userDto.setName("John");
        userDto.setEmail("john@error.com");

        //when
        when(userRepository.save(any(User.class))).thenAnswer(invocation -> invocation.getArgument(0));
        assertThrows(Exception.class, () -> userService.createUserWithRollback(userDto));

        //then
        verify(userRepository, times(1)).save(any(User.class));
    }


}
