package com.sts.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
