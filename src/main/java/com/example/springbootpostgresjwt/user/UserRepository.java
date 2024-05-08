package com.example.springbootpostgresjwt.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    @Query(value = "SELECT * FROM users ORDER BY id LIMIT :limit", nativeQuery = true)
    List<User> findByTop(@Param("limit") Integer limit);
}
