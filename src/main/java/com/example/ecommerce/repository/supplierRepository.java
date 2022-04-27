package com.example.ecommerce.repository;

import com.example.ecommerce.entity.suppliers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface supplierRepository extends JpaRepository<suppliers,Integer> {
}
