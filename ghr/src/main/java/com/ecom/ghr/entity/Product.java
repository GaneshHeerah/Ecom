package com.ecom.ghr.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ghr
 */

@Entity
@Table(name = "product")
@Setter
@Getter
@AllArgsConstructor
public class Product {
}
