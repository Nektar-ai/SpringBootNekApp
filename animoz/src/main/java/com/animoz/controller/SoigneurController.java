package com.animoz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.animoz.entite.Soigneur;
import com.animoz.service.SoigneurService;

@Controller
public class SoigneurController {

	@Autowired
	private SoigneurService soigneurService;
	
	@GetMapping(path ="/soigneurs")
	public String afficherListeSoigneurs(Model model)
	{
		List<Soigneur> listeSoigneurs = soigneurService.getListeSoigneurs();
		model.addAttribute("listeSoigneurs", listeSoigneurs);
		return "listeSoigneurs";
	}
}
