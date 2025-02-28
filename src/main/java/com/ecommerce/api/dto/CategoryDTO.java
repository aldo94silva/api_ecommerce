package com.ecommerce.api.dto;

import com.ecommerce.api.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {

    private Long id;

    private String name;

    private List<ProductsDTO> products;

    public CategoryDTO(Long id, String name){

    }

    public void setProducts(Set<Product> products) {
        this.products = products.stream()
                .map(product -> new ProductsDTO(
                        product.getName(),
                        product.getDescription(),
                        product.getId(),
                        product.getPrice(),
                        product.getImgUrl(),
                        product.getCategories().stream()
                                .map(category -> new CategoryDTO(category.getId(), category.getName()))
                                .toList()
                ))
                .toList();
    }


}
