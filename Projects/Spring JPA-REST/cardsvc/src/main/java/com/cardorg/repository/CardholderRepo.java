package com.cardorg.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.cardorg.domain.Cardholder;

@RestResource(path="/cardholders", rel="/cardholders")
public interface CardholderRepo extends CrudRepository<Cardholder, Long>{

	List<Cardholder> findAll();
	
}
