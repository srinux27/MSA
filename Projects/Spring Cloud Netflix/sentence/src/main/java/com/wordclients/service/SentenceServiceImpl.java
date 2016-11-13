package com.wordclients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImpl implements SentenceService {
	
	private WordService wordService;
	
	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}


	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format(wordService.getSubject() + " " + 
					wordService.getVerb()+ " " +
					wordService.getArticle()+ " " +
					wordService.getAdjective()+ " " +
					wordService.getNoun());
		
		return sentence;
	}
}
