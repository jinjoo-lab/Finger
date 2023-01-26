package com.example.toyjava.module.account.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.sql.Date;
import java.time.LocalDate;


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

    @PrePersist
    void initCreated()
    {
        this.created_at = Date.valueOf(LocalDate.now());
    }

    @PreUpdate
    void initUpdated()
    {
        this.updated_at = Date.valueOf(LocalDate.now());
    }

    @Column(updatable = false ,name = "createdAt")
    private Date created_at;

    @Column(insertable = false, name = "updatedAt")
    private Date updated_at;

    @OneToOne
    @JoinColumn(name = "info_id")
    Userinfo userInfo;
    @Builder
    public Users(int age,String userName,String userId, String userPassword,Userinfo userInfo)
    {
        this.age=age;
        this.userName = userName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.userInfo = userInfo;
    }
   public void setUserInfo(Userinfo userInfo)
   {
       this.userInfo = userInfo;
       //userInfo.setUser(this);
   }

}
