package com.registerweb.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registerweb.register.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long>  {

}
