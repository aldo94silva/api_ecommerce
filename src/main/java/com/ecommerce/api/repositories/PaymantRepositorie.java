package com.ecommerce.api.repositories;

import com.ecommerce.api.entities.Paymant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymantRepositorie extends JpaRepository<Paymant, Long> {
}
