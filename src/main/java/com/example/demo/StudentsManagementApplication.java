package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@SpringBootApplication
public class StudentsManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementApplication.class, args);
	}

	
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student student1 = new Student("Vinay", "Patil", "vinay12@gmail.com", "Wadia");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Rahul", "Patil", "rahul12@gmail.com", "PCC");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Suha", "Patil", "suha12@gmail.com", "Wadia");
//		studentRepository.save(student3);
		
		
	}

}
