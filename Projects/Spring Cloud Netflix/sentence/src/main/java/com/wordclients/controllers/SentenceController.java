package com.wordclients.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordclients.service.SentenceService;

@Controller
public class SentenceController {

	@Autowired SentenceService sentenceService;
	
	@RequestMapping("/sentence")
	public @ResponseBody String getSentence() {
		return sentenceService.buildSentence();
	}
}
