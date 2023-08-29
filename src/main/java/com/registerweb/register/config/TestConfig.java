package com.registerweb.register.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.registerweb.register.entities.Adress;
import com.registerweb.register.entities.Enrollment;
import com.registerweb.register.entities.Student;
import com.registerweb.register.repositories.AdressRepository;
import com.registerweb.register.repositories.EnrollmentRepository;
import com.registerweb.register.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AdressRepository adressRespository;
	
	@Autowired
	private EnrollmentRepository enrollmentRespository;

	//Inserindo ussários no banco de dados.
	@Override
	public void run(String... args) throws Exception {
		
		Student st1 = new Student(null, "Maria Brown", 25);
		Student st2 = new Student(null, "Alex Grenn", 22);
		Student st3 = new Student(null, "Laryssa Gouveia", 27);
		
		Adress adrs1 = new Adress(null, "Av: manoel Brandão", "Formoso do Araguaia", "Tocantins", st1);
		Adress adrs2 = new Adress(null, "Rua N° 06 Novo Horizonte", "Gurupi", "Tocantins", st2);
		Adress adrs3 = new Adress(null, "Av: pedro afonso centro I", "Belo Horizonte", "Minas Gerais", st3);
		
		Enrollment enroll1 = new Enrollment(null, "15002023", Instant.parse("2019-06-20T19:53:07Z"), st1);
		Enrollment enroll2 = new Enrollment(null, "17002023", Instant.parse("2019-07-22T15:21:07Z"), st2);
		Enrollment enroll3 = new Enrollment(null, "16002023", Instant.parse("2019-08-01T18:00:07Z"), st3);
		Enrollment enroll4 = new Enrollment(null, "16002023", Instant.parse("2019-08-01T18:00:07Z"), st3);
		Enrollment enroll5 = new Enrollment(null, "16002023", Instant.parse("2019-08-01T18:00:07Z"), st3);
		
	    
		studentRepository.saveAll(Arrays.asList(st1, st2, st3));
		adressRespository.saveAll(Arrays.asList(adrs1, adrs2, adrs3));
		enrollmentRespository.saveAll(Arrays.asList(enroll1,  enroll2, enroll3, enroll4, enroll5));
	}
	
	

}
