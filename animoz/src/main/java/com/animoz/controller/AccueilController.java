package com.animoz.controller;

import java.util.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {

	@GetMapping(path="/")
	public String accueillir(Model model) {
		
		model.addAttribute("date", new Date());
		model.addAttribute("localDate", LocalDate.now());
		
		return "accueil";
	}
}
