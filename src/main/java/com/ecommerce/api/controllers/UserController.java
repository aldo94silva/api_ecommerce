//package com.ecommerce.api.controllers;
//
//import com.ecommerce.api.dto.UserDTO;
//import com.ecommerce.api.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("{/id}")
//    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
//        UserDTO dto = userService.findById(id);
//        return ResponseEntity.ok(dto);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<UserDTO>> getAllUsers(){
//        List<UserDTO> list = userService.getAllUser();
//        return ResponseEntity.ok(list);
//    }
//
//    @PostMapping()
//    public ResponseEntity<UserDTO> createUsers(@RequestBody UserDTO userDTO){
//        UserDTO users = userService.createUsers(userDTO);
//        return ResponseEntity.ok(users);
//    }
//
//    @DeleteMapping("{/id}")
//    public ResponseEntity<UserDTO> deleteUsers(@RequestBody UserDTO userDTO, @PathVariable Long id){
//        UserDTO users = userService.deleteUsers(id);
//        return  ResponseEntity.ok(users);
//    }
//}
