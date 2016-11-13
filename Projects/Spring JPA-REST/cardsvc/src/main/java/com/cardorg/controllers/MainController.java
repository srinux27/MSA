package com.cardorg.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardorg.domain.Card;
import com.cardorg.domain.Cardholder;
import com.cardorg.repository.CardholderRepo;

@RestController
public class MainController {
	
	
	@Autowired
	private CardholderRepo cardholderRepo;
	
	private Cardholder cardHolder;
	
	@Value("${lucky-word}") String luckyWord;
	
	@PostConstruct
	public void init() {
		List<Card> cardList = new ArrayList<>();
		cardList.add(new Card("4444-5555-8888-0099", "VISA"));
		cardList.add(new Card("5555-5555-8888-0199", "AMEX"));
		cardHolder = new Cardholder("Sabapathy", "saba@gmail.com", cardList);
		
		cardholderRepo.save(cardHolder);
	}
	
	
	@RequestMapping (path = "/cardholder")
	public List<Cardholder> mainEntry() {
		return cardholderRepo.findAll();
	}
	
	@RequestMapping (path = "/checkprop")
	public String checkConfigServer() {
		return "Hello" + luckyWord;
	}
}
