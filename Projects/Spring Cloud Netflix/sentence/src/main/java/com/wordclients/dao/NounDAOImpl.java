package com.wordclients.dao;

import org.springframework.stereotype.Component;

@Component("nounServices")
public class NounDAOImpl extends WordDAOImpl {

	@Override
	public String getPartOfSpeech() {
		return NOUN;
	}

}
