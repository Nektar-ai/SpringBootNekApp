package com.animoz.entite;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Soigneur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String numero;
	private String nom; 

	private LocalDate dateRecrutement;
	
	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getNumero() {
		return numero;
	}

	public LocalDate getDateRecrutement() {
		return dateRecrutement;
	}
}

