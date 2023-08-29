package com.registerweb.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registerweb.register.entities.Enrollment;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>  {

}
