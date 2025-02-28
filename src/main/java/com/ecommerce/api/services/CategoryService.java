package com.ecommerce.api.services;

import com.ecommerce.api.dto.CategoryDTO;
import com.ecommerce.api.entities.Category;
import com.ecommerce.api.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAllCategories(){
        return categoryRepository.findAll().stream().map(category -> new CategoryDTO(
                category.getId(),
                category.getName())).toList();
    }
}


