package com.example.toyjava.module.account.repository;

import com.example.toyjava.module.account.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findById(int id);

    Users findByUserName(String name);
    @Override
    void deleteAll();
}
