package com.registerweb.register.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.registerweb.register.entities.Adress;
import com.registerweb.register.entities.Student;
import com.registerweb.register.repositories.AdressRepository;
import com.registerweb.register.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AdressRepository adressRespository;

	//Inserindo ussários no banco de dados.
	@Override
	public void run(String... args) throws Exception {
		
		Student st1 = new Student(null, "Maria Brown", 25);
		Student st2 = new Student(null, "Alex Grenn", 22);
		Student st3 = new Student(null, "Laryssa Gouveia", 27);
		
		Adress adrs1 = new Adress(null, "Av: manoel Brandão", "Formoso do Araguaia", "Tocantins", st1);
		Adress adrs2 = new Adress(null, "Rua N° 06 Novo Horizonte", "Gurupi", "Tocantins", st2);
		Adress adrs3 = new Adress(null, "Av: pedro afonso centro I", "Belo Horizonte", "Minas Gerais", st3);
		
		
		studentRepository.saveAll(Arrays.asList(st1, st2, st3));
		adressRespository.saveAll(Arrays.asList(adrs1, adrs2, adrs3));
	}
	
	

}
