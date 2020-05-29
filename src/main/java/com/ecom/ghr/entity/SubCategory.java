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
@Table(name = "sub_category")
@Setter
@Getter
@NoArgsConstructor
public class SubCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long subCategoryId;

    @Column(name = "quanity")
    private int quantiy;
}
