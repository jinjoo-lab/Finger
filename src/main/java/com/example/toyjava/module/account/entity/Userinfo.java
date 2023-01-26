package com.example.toyjava.module.account.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Getter
@NoArgsConstructor
@ToString
public class Userinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ToString.Exclude
    @OneToOne(mappedBy = "userInfo")
    private Users user;
    @NotBlank
    private String address;
    @NotBlank
    private String main_career;
    private String sub_career;

    @Builder
    public Userinfo(String address,String main_career, String sub_career)
    {
        this.address = address;
        this.main_career = main_career;
        this.sub_career = sub_career;
    }

    public void setUser(Users user)
    {
        this.user = user;
    }

}
