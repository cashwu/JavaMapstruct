package com.cashwu.javamapstruct.controller;

import com.cashwu.javamapstruct.User;
import com.cashwu.javamapstruct.UserDto;
import com.cashwu.javamapstruct.UserMapper;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cash.wu
 * @since 2024/05/29
 */
@RestController
public class HomeController {

    private final UserMapper userMapper;

    public HomeController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping("/")
    public UserDto home() {

        val user = new User();
        user.setFirstName("cash");
        user.setLastName("wu");
        user.setEmail("cashwu@gmail.com");
        user.setAge(18);

        var userDto = userMapper.userToUserDto(user);

        return userDto;
    }
}
