package com.spring.Controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home(Map<String, Object> model){
		logger.debug("test welcome");
		model.put("message", "Hello Welcome");
		return "welcome";
	}
}
