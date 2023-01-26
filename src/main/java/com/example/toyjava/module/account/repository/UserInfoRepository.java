package com.example.toyjava.module.account.repository;

import com.example.toyjava.module.account.entity.Userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserInfoRepository extends JpaRepository<Userinfo,Integer> {

    Userinfo findById(Long id);

    @Override
    void deleteAll();
}
