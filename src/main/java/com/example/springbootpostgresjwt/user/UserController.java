package com.example.springbootpostgresjwt.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome to Spring Boot Postgres JWT";
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> findAllUsers() {
        return userService.findAll();
//        return userService.findByTop(1);
    }
}
