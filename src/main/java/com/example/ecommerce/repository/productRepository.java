package com.example.ecommerce.repository;

import com.example.ecommerce.entity.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<products,Integer> {

}
