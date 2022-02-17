package com.apipothi.logexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	
	private final static Logger logger=LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/")
	public String getLogs() {
		
		logger.error("I AM ERROR");
		logger.warn("I AM WARMING");
		logger.info("I AM INFO");
		logger.debug("I AM DEBUG");
		logger.trace("I AM TRACE");
		
		return "Welcome to API POTHI";
		
	}

}
