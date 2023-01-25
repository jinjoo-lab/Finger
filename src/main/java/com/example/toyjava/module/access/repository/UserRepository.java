package com.example.toyjava.module.access.repository;

import com.example.toyjava.module.access.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findById(int id);
}
