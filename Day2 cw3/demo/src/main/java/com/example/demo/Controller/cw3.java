package com.example.demo.Controller;


import com.example.demo.Model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cw3 {
    @GetMapping("/ignore")
    public Student st()
    {
        Student s=new Student(101, "karthi", "He is a boy");
        return s;
    }
    
}
