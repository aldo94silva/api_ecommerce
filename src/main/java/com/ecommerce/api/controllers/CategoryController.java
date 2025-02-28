package com.ecommerce.api.controllers;

import com.ecommerce.api.dto.CategoryDTO;
import com.ecommerce.api.entities.Category;
import com.ecommerce.api.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        List<CategoryDTO> list = categoryService.findAllCategories();
        return ResponseEntity.ok(list);
    }


}
