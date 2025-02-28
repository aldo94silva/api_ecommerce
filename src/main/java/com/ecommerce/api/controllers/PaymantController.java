//package com.ecommerce.api.controllers;
//
//
//import com.ecommerce.api.dto.CategoryDTO;
//import com.ecommerce.api.dto.PaymantDTO;
//import com.ecommerce.api.services.PaymantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/paymant")
//public class PaymantController {
//
//    @Autowired
//    private PaymantService paymantService;
//
//    @GetMapping("{/id}")
//    public ResponseEntity<PaymantDTO> findById(@PathVariable Long id){
//        PaymantDTO paymants = paymantService.findById(id);
//        return ResponseEntity.ok(paymants);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<PaymantDTO>> findAllPaymants() {
//        List<PaymantDTO> list = paymantService.findAllPaymants();
//        return ResponseEntity.ok(list);
//    }
//
//    @PostMapping
//    public ResponseEntity<PaymantDTO> createPaymants(@RequestBody PaymantDTO paymantDTO){
//        PaymantDTO paymants = paymantService.createPaymants(paymantDTO);
//        return ResponseEntity.ok(paymants);
//    }
//
//    @DeleteMapping("{/id}")
//    public ResponseEntity<PaymantDTO> deleteCategory(@PathVariable Long id, @RequestBody PaymantDTO paymantDTO){
//        PaymantDTO paymants = categoryService.deleteCategory(id);
//        return ResponseEntity.ok(categories);
//    }
//
//}
