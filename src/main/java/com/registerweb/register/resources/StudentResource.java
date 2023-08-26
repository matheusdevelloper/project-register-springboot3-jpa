package com.registerweb.register.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registerweb.register.entities.Student;
import com.registerweb.register.services.StudentService;

@RestController
@RequestMapping(value = "/students")
public class StudentResource {
	
	@Autowired
	private StudentService service;
	
	//Retorna os usuários do banco de dados
	@GetMapping
	public ResponseEntity<List<Student>> findAll(){
		List<Student> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//Retorna o usuário através do id pela url passando o valor do id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Student> findById(@PathVariable Long id){
		Student obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
