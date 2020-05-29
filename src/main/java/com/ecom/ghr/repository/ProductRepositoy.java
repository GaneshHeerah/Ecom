package com.ecom.ghr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ghr.entity.Product;

/**
 *
 * @author ghr
 */
public interface ProductRepositoy extends JpaRepository<Product, Long> {

}
