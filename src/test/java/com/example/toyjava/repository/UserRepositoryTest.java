package com.example.toyjava.repository;

import com.example.toyjava.module.account.entity.Userinfo;
import com.example.toyjava.module.account.entity.Users;
import com.example.toyjava.module.account.repository.UserInfoRepository;
import com.example.toyjava.module.account.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;

@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    public UserRepository userRepository;

    @Autowired
    public UserInfoRepository userInfoRepository;

    @Test
    void userTest()
    {
        userRepository.deleteAll();
        userInfoRepository.deleteAll();

        Users users = Users.builder()
                .userId("damilove123")
                .userName("kimdami")
                .userPassword("damidami")
                .age(27)
                .build();

        Userinfo userinfo = Userinfo.builder()
                .address("Seoul")
                .main_career("actor")
                .sub_career("witch").build();

        users.setUserInfo(userinfo);
        userInfoRepository.save(userinfo);
        userRepository.save(users);


    }
    @Test
    void userRelationTest()
    {
        System.out.println(userInfoRepository.findById(7l).getUser());
    }
}
