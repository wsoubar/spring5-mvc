package br.com.wsoubar.oops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	private final Logger logger = LoggerFactory.getLogger(IndexController.class);

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("nome", "Wagner Barbosa");
		System.out.println("passou index");
        logger.trace("trace logging");
        logger.debug("debug logging");
        logger.info("info logging");
        logger.warn("warning logging");
        //logger.error("error logging", new RuntimeException("help"));		
		
		return "index";
	}

}
