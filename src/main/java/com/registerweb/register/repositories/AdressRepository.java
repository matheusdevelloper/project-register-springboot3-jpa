package com.registerweb.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registerweb.register.entities.Adress;

public interface AdressRepository extends JpaRepository<Adress, Long>  {

}
