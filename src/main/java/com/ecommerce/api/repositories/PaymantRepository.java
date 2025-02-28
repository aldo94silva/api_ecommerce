package com.ecommerce.api.repositories;

import com.ecommerce.api.entities.Paymant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymantRepository extends JpaRepository<Paymant, Long> {
}
