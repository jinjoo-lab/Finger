package com.example.toyjava.repository;

import com.example.toyjava.module.access.entity.Users;
import com.example.toyjava.module.access.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    public UserRepository userRepository;

    @Test
    void userRespositoryTest1()
    {
        Users user = Users.builder().age(27).userId("Dami1997jin")
                .userName("jinjooone").userPassword("DamiGood")
                .createdAt(Date.valueOf(LocalDate.now())).build();

        System.out.println(user);

        userRepository.save(user);

        Users reUser = userRepository.findById(0);

        System.out.println(reUser);
    }
}
