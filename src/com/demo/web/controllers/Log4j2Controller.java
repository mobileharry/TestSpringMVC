package com.demo.web.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/log4j2")
public class Log4j2Controller {
	private static final Logger logger = LogManager.getLogger(Log4j2Controller.class);

	@RequestMapping("/test")
	public String test(Model model){
		logger.trace("This is trace log");
		logger.debug("This is debug log");
		logger.info("This is info log");
		logger.warn("This is warn log");
		logger.error("This is error log");
		logger.fatal("This is fatal log");
		
		return "index";
	}
}
