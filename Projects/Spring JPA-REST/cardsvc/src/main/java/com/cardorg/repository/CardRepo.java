package com.cardorg.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.cardorg.domain.Card;



@RestResource(path="/cards", rel="/cards")
public interface CardRepo extends CrudRepository<Card, Long>{

	List<Card> findAll();
}
