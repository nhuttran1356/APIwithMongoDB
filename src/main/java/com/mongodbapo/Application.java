package com.mongodbapo;

import com.mongodbapo.entity.Address;
import com.mongodbapo.entity.Gender;
import com.mongodbapo.entity.Student;
import com.mongodbapo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner runner(StudentRepository repository){
		return args -> {
			Address address = new Address("VietNam", "123", "HoChiMinh");
			Student student = new Student("Nhut", "Tran", "nhuttran1356@gmail.com"
					, Gender.Male,address, List.of("infomation tech"), BigDecimal.TEN
					, LocalDateTime.now());
			repository.insert(student);
		};
	}
}
