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
@Table(name = "staff")
@Setter
@Getter
@NoArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long staffId;

    @Column(name = "email")
    private String email;

    @Column(name = "sname")
    private String sname;

    @Column(name = "password")
    private String password;

    @Column(name = "isactive")
    private boolean isActive;

    @Column(name = "isblock")
    private boolean isBlock;


}
