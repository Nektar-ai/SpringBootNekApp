package com.animoz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.animoz.entite.Animal;
import com.animoz.service.AnimalService;

@Controller
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	Boolean	ok = true;
	
	@GetMapping(path ="/animaux")
	public String afficherListeAnimaux(Model model)
	{
		List<Animal> listeAnimaux = animalService.getListeAnimaux();
		model.addAttribute("listeAnimaux", listeAnimaux);
		return "listeAnimaux";
	}
	
	@GetMapping(path= "/animal")
	public String afficherFormulaireCreation(@ModelAttribute("animal") AnimalDTO animalDto) {
		return "formAnimal";
	}
	
	// Validated pour vérifier que l'attribut du @ModelAttribute animal soit existant
	
	@PostMapping(path= "/animal")
	public String traiterFormulaireCreation(@Validated @ModelAttribute("animal") AnimalDTO animalDto, BindingResult bindingResult) {
		bindingResult.rejectValue("nom", "error", "Ceci est une erreur bidon");
		if (bindingResult.hasErrors()) {
			return afficherFormulaireCreation(animalDto);
		}
		System.out.println(animalDto.getNom());
		return "accueil";
		
	}
}
