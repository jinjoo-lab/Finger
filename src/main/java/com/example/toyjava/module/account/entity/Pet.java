package com.example.toyjava.module.account.entity;

import com.example.toyjava.module.account.constant.Sex;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @NotBlank
    private String name;

    private String species;

    private String category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @ToString.Exclude
    private Users user;

    @Builder
    public Pet(Sex sex,String name,String species,String category)
    {
        this.sex = sex;
        this.name = name;
        this.species = species;
        this.category = category;
    }

    public void setUser(Users user)
    {
        this.user = user;
        user.getList().add(this);
    }
}
