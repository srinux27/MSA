package com.cardorg.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cardholder {
	
	@Id @GeneratedValue
	private Long id;
	
	private String cardholderName;
	
	private String cardholderEmail;
	
	@OneToMany(cascade=CascadeType.ALL) @JoinColumn(name="cardholderId")
	private List<Card> cards;

	public Cardholder() {}
	
	public Cardholder(String cardholderName, String cardholderEmail, List<Card> cards)
	{
		super();
		this.cardholderName = cardholderName;
		this.cardholderEmail = cardholderEmail;
		this.cards = cards;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardholderName() {
		return cardholderName;
	}

	public void setCardholderName(String cardholderName) {
		this.cardholderName = cardholderName;
	}

	public String getCardholderEmail() {
		return cardholderEmail;
	}

	public void setCardholderEmail(String cardholderEmail) {
		this.cardholderEmail = cardholderEmail;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
}
