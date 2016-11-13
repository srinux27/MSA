package com.wordclients.dao;

public interface WordDAO {

	static final String SUBJECT = "subsvc";
	static final String VERB = "verbsvc";
	static final String ARTICLE = "artsvc";
	static final String ADJECTIVE = "adjsvc";
	static final String NOUN = "nounsvc";
	
	String getWord();
	
	
}
