package com.ecommerce.api.repositories;

import com.ecommerce.api.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositorie extends JpaRepository<Products, Long> {
}
