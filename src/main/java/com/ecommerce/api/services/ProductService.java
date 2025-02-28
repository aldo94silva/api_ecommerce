package com.ecommerce.api.services;

import com.ecommerce.api.dto.CategoryDTO;
import com.ecommerce.api.dto.ProductsDTO;
import com.ecommerce.api.entities.Product;
import com.ecommerce.api.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public ProductsDTO findById(Long id){
        Product products = productRepository.findById(id).orElseThrow();
        ProductsDTO productsDTO = productToProductDto(products);
        return productsDTO;
    }

    @Transactional(readOnly = true)
    public List<ProductsDTO> findAll(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> productToProductDto(product)).toList();
    }

    @Transactional
    public ProductsDTO create(ProductsDTO productDTO) {
        Product products = productDTOToProduct(productDTO);
        Product savedProduct = productRepository.save(products);
        return productToProductDto(savedProduct);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

    @Transactional
    public ProductsDTO updateProduct(Long id, ProductsDTO productsDTO){
        Product products = productDTOToProduct(productsDTO);
        products.setId(id);
        products = productRepository.save(products);
        return productToProductDto(products);
    }

    public ProductsDTO productToProductDto(Product products){
        ProductsDTO productsDTO = new ProductsDTO();
        productsDTO.setId(products.getId());
        productsDTO.setName(products.getName());
        productsDTO.setDescription(products.getDescription());
        productsDTO.setPrice(products.getPrice());
        productsDTO.setImgURL(products.getImgUrl());
        productsDTO.setCategories(products.getCategories().stream().map(category -> new CategoryDTO(category.getId(), category.getName())).toList());
        return productsDTO;
    }

    public Product productDTOToProduct(ProductsDTO productsDTO){
        Product products = new Product();
        products.setName(productsDTO.getName());
        products.setDescription(productsDTO.getDescription());
        products.setPrice(productsDTO.getPrice());
        products.setImgUrl(productsDTO.getImgURL());
        products.setCategories(productsDTO.getCategories());
        return products;
    }

}
