package com.example.demo.controller;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Department;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class DepartmentController {
    @PostMapping("/department")
    public String postMethodName(@RequestBody Department entity) {
        return "Department Name: "+entity.getDepartmentName()+", Branch: "+entity.getBranch();
    }
    
}