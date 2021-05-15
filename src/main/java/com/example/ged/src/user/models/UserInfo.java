package com.example.ged.src.user.models;

import com.example.ged.config.BaseEntity;
import com.example.ged.src.user.models.LoginMethod;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="UserInfo")
public class UserInfo extends BaseEntity {
    @Id
    @Column(name="userIdx",nullable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userIdx;

    @Column(name="socialId",nullable = false)
    private String socialId;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="profileImageUrl",columnDefinition = "TEXT")
    private String profileImageUrl;

    @Column(name="introduce")
    private String introduce;

    @Column(name="snsUrl",columnDefinition = "TEXT")
    private String snsUrl;

    @Column(name="loginMethod",nullable = false)
    @Enumerated(EnumType.STRING)
    private LoginMethod loginMethod;

    @Column(name="status",nullable = false)
    private String status = "ACTIVE";

    private UserInfo(Integer userIdx,String socialId,String name,String email,String profileImageUrl,String introduce,String snsUrl,LoginMethod loginMethod){
        this.userIdx = userIdx;
        this.socialId = socialId;
        this.name = name;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.introduce = introduce;
        this.snsUrl = snsUrl;
        this.loginMethod = loginMethod;
    }
}
