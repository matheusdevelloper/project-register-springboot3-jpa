package com.registerweb.register.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.registerweb.register.entities.Student;
import com.registerweb.register.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;

	//Inserindo ussários no banco de dados.
	@Override
	public void run(String... args) throws Exception {
		
		Student st1 = new Student(null, "Maria Brown", 25);
		Student st2 = new Student(null, "Alex Grenn", 22);
		
		studentRepository.saveAll(Arrays.asList(st1, st2));
	}
	
	

}
