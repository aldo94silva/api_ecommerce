package com.ecommerce.api.repositories;

import com.ecommerce.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {
}
