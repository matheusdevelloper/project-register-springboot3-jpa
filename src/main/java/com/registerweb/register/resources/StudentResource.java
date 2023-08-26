package com.registerweb.register.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registerweb.register.entities.Student;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {
	
	@GetMapping
	public ResponseEntity<Student> findAll(){
		Student u = new Student(1L, "Maria", 23);
		return ResponseEntity.ok().body(u);
	}
}
