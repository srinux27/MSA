package com.wordclients.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("artsvc")
public interface ArticleClient {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String getWord();
}
