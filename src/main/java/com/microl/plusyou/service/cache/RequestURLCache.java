package com.microl.plusyou.service.cache;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.microl.plusyou.entity.WebPage;

@Component
public class RequestURLCache {
	
	private static Map<String, WebPage> urlCache = new HashMap<String, WebPage>();
	
	public WebPage get(String page) {
		if(!urlCache.containsKey(page)) {
			return null;
		}
		
		WebPage webPage = urlCache.get(page);
		return urlCache.get(page);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
