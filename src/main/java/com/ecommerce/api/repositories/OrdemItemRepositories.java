package com.ecommerce.api.repositories;


import com.ecommerce.api.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepositories extends JpaRepository<OrderItem, Long> {
}
