package com.cardorg.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Card {

	@Id @GeneratedValue
	private Long id;
	
	private String cardNumber;
	
	private String cardType;

	public Card() {}
	
	public Card(String cardNumber, String cardType) {
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	
	
	
	
}
