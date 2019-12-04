//package com.example.demo.service;
//
//import com.example.demo.entity.User;
//import com.example.demo.repository.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * User: twodogegg
// * DATE: 2019-12-02 18:15
// */
//@SpringBootTest
//class UserServiceTest {
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private UserRepository repository;
//
//    @Test
//    @Transactional
//    void loadUserByUsername() {
//        User user = userService.loadUserByUsername("user");
//        System.out.println(user);
//    }
//}