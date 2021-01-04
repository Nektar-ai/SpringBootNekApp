package com.animoz.controller;

import javax.validation.constraints.NotBlank;

public class AnimalDTO {

	@NotBlank(message ="Le nom de l''animal est obligatoire")
	private String nom;
	
	public String getNom() {
		return nom;
	}
	
	public String setNom(String nom) {
		return this.nom = nom;
	}
}
