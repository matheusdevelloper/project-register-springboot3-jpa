package com.registerweb.register.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registerweb.register.entities.Adress;
import com.registerweb.register.repositories.AdressRepository;

@Service
public class AdressService {
	
	@Autowired
	private AdressRepository repository;
	
	//Retorna lista de usuários do banco de dados
	public List<Adress> findAll(){
		return repository.findAll();
	}
	
	//Retorna o usuário pelo o id do usuário
	public Adress findById(Long id) {
		Optional<Adress> obj = repository.findById(id);
		return obj.get();
	}
}
