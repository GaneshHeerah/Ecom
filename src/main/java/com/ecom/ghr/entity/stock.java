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
@Table(name = "stock")
@Setter
@Getter
@NoArgsConstructor
public class stock {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long stockId;

    @Column(name = "quanity")
    private int quantiy;

    @Column(name = "unit_price")
    private String unitPrice;

    @Column(name = "unique_id")
    private String uniqueId;


}


