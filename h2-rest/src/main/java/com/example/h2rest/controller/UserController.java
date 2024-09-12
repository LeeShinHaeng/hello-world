package com.example.h2rest.controller;

import com.example.h2rest.dto.UserDto;
import com.example.h2rest.entity.User;
import com.example.h2rest.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public User create(@RequestBody UserDto userDto) throws Exception {
        return userService.createUser(userDto);
//        return userService.createUserWithRollback(userDto);
    }


    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id,
                       @RequestBody UserDto userDto) {
        return userService.updateUser(id, userDto);
    }
}
