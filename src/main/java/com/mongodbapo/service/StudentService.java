package com.mongodbapo.service;

import com.mongodbapo.entity.Address;
import com.mongodbapo.entity.Gender;
import com.mongodbapo.entity.Student;
import com.mongodbapo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class StudentService implements StudentServiceImp{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public boolean addData() {
        Boolean isSuccess = false;
        Address address = new Address("VietNam", "123", "HoChiMinh");
        Student student = new Student("Nhut", "Tran", "nhuttran1356@gmail.com"
                                        , Gender.Male,address, List.of("infomation tech"), BigDecimal.TEN
                ,LocalDateTime.now());
        studentRepository.save(student);

        return isSuccess;
    }
}
