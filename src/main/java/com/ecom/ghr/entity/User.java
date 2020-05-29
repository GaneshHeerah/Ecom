package com.ecom.ghr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author ghr
 */
@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "uname")
    private String uName;

    @Column(name = "password")
    private String password;

    @Column(name = "isactive")
    private Boolean isActive;

    @Column(name = "isblock")
    private Boolean isBlock;


}
