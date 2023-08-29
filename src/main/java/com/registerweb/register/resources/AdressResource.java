package com.registerweb.register.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registerweb.register.entities.Adress;
import com.registerweb.register.services.AdressService;

@RestController
@RequestMapping(value = "/adress")
public class AdressResource {
	
	@Autowired
	private AdressService service;
	
	//Retorna os usuários do banco de dados
	@GetMapping
	public ResponseEntity<List<Adress>> findAll(){
		List<Adress> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	//Retorna o usuário através do id pela url passando o valor do id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Adress> findById(@PathVariable Long id){
		Adress obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
