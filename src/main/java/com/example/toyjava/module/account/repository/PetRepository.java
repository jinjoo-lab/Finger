package com.example.toyjava.module.account.repository;

import com.example.toyjava.module.account.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long> {
    Pet findById(long id);

    @Override
    void deleteAll();
}
