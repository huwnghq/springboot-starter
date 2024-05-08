package com.example.springbootpostgresjwt.user;

import java.util.List;

public interface UserService {
    List<User> findAll();

    List<User> findByTop(Integer limit);
}
