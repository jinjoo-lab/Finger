package com.example.toyjava.module.access.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.sql.Date;


@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Min(value = 1)
    @Max(value = 100)
    private int age;

    @NotBlank
    private String userId;

    @Column(name="userName")
    private String userName;

    private String userPassword;

    @Column(updatable = false ,name = "createdAt")
    private Date created_at;

    @Column(insertable = false, name = "updatedAt")
    private Date updated_at;

    @Builder
    public Users(int age,String userName,String userId, String userPassword,Date createdAt)
    {
        this.age=age;
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.created_at = createdAt;
    }

}
