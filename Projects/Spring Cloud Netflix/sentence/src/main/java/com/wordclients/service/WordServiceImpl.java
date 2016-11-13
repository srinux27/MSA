package com.wordclients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wordclients.dao.AdjectiveClient;
import com.wordclients.dao.ArticleClient;
import com.wordclients.dao.NounClient;
import com.wordclients.dao.SubjectClient;
import com.wordclients.dao.VerbClient;

@Service
public class WordServiceImpl implements WordService {

	@Autowired
	private SubjectClient subjectClient;
	@Autowired
	private NounClient nounClient;
	@Autowired
	private ArticleClient articleClient;
	@Autowired
	private AdjectiveClient adjectiveClient;
	@Autowired
	private VerbClient verbClient;
	
	
	
	@Override
	public String getSubject() {
		return subjectClient.getWord();
	}

	@Override
	public String getVerb() {
		return verbClient.getWord();
	}

	@Override
	public String getArticle() {
		return articleClient.getWord();
	}

	@Override
	public String getAdjective() {
		return adjectiveClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public String getNoun() {
		return nounClient.getWord();
	}
	
	public String getFallbackNoun(){
		return "SYSTEM FAILURE DETECTED";
	}
	

}
