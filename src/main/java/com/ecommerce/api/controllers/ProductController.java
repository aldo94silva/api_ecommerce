package com.ecommerce.api.controllers;

import com.ecommerce.api.dto.ProductsDTO;
import com.ecommerce.api.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductsDTO> getProductById(@PathVariable Long id) {
        ProductsDTO productsDTO = productService.findById(id);
        return ResponseEntity.ok(productsDTO);
    }

    @GetMapping()
    public ResponseEntity <List<ProductsDTO>> getAllProducts() {
        List<ProductsDTO> list = productService.findAll();
        return ResponseEntity.ok(list);
    }

    @PostMapping()
    public ResponseEntity<ProductsDTO> createProduct(@RequestBody ProductsDTO productsDTO) {
        ProductsDTO products = productService.create(productsDTO);
        return ResponseEntity.ok(products);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductsDTO> updateProduct(@PathVariable Long id, @RequestBody ProductsDTO productsDTO) {
        return ResponseEntity.ok(productService.updateProduct(id, productsDTO));
    }

}
