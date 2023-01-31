package com.example.toyjava.repository;

import com.example.toyjava.module.account.constant.Sex;
import com.example.toyjava.module.account.entity.Pet;
import com.example.toyjava.module.account.entity.Users;
import com.example.toyjava.module.account.repository.PetRepository;
import com.example.toyjava.module.account.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserPetTest {
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public PetRepository petRepository;

    @Test
    public void UserPetSetTest()
    {
        petRepository.deleteAll();
        userRepository.deleteAll();

        Users user = Users.builder()
                .userId("dami")
                .userName("kimdami")
                .userPassword("damilover123")
                .age(27).build();

        userRepository.save(user);

        Pet pet1 = Pet.builder()
                .sex(Sex.FEMAIL)
                .name("bbomi")
                .species("dog")
                .category("bulldog")
                .build();

        pet1.setUser(user);

        petRepository.save(pet1);

        Pet pet2 = Pet.builder()
                .sex(Sex.MAIL)
                .name("sarang")
                .species("dog")
                .category("bulldog")
                .build();

        pet2.setUser(user);
        petRepository.save(pet2);

        for (Pet pet : user.getList()) {
            System.out.println(pet);
        }
    }

    @Test
    public void UserPetGetTest()
    {
        userRepository.findById(4).getList().forEach(
                x-> System.out.println(x)
        );
    }
}
