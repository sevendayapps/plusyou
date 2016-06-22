package com.microl.plusyou.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.microl.plusyou.common.constant.RequestMappingConstant;
import com.microl.plusyou.service.cache.RequestURLCache;

@Controller
public class IndividualController {
	
	private final RequestURLCache pageCache;
	
	@Autowired
	public IndividualController(RequestURLCache pageCache) {
		this.pageCache = pageCache;
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping(value=RequestMappingConstant.INDIVIDUAL + RequestMappingConstant.URL_EXTENSION, method=RequestMethod.GET)
	public ModelAndView getPage() {
		ModelMap modelMap = new ModelMap();
		
		
		String pageTitle = "";
		pageTitle = pageCache.get(RequestMappingConstant.INDIVIDUAL) == null ? null : 
						pageCache.get(RequestMappingConstant.INDIVIDUAL).getTitle() == null ? null : 
								pageCache.get(RequestMappingConstant.INDIVIDUAL).getTitle()
		
		
		
		modelMap.addAttribute("pageTitle", pageTitle);
		return new ModelAndView(RequestMappingConstant.INDIVIDUAL, modelMap);
	}
	
}
