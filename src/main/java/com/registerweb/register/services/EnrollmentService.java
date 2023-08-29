package com.registerweb.register.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registerweb.register.entities.Enrollment;
import com.registerweb.register.repositories.EnrollmentRepository;

@Service
public class EnrollmentService {
	
	@Autowired
	private EnrollmentRepository repository;
	
	//Retorna lista de usuários do banco de dados
	public List<Enrollment> findAll(){
		return repository.findAll();
	}
	
	//Retorna o usuário pelo o id do usuário
	public Enrollment findById(Long id) {
		Optional<Enrollment> obj = repository.findById(id);
		return obj.get();
	}
}
