package com.ecommerce.api.repositories;

import com.ecommerce.api.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepositories extends JpaRepository<Category, Long> {

}
