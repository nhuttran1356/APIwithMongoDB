package com.mongodbapo.controller;

import com.mongodbapo.service.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImp studentServiceImp;

    @GetMapping("")
    public ResponseEntity<?> addStudent(){
        boolean isSuccess = studentServiceImp.addData();
        return new ResponseEntity<>("Complete", HttpStatus.OK);
    }


}
