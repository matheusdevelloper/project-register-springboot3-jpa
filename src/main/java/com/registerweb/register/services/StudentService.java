package com.registerweb.register.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registerweb.register.entities.Student;
import com.registerweb.register.repositories.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;
	
	//Retorna lista de usuários do banco de dados
	public List<Student> findAll(){
		return repository.findAll();
	}
	
	//Retorna o usuário pelo o id do usuário
	public Student findById(Long id) {
		Optional<Student> obj = repository.findById(id);
		return obj.get();
	}
}
