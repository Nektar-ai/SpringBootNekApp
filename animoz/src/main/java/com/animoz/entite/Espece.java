package com.animoz.entite;

import java.util.List;

// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Espece {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	// @Column(name = "espece_nom")
	private String nom;

	@OneToMany(mappedBy = "espece")
	private List<Animal> animaux;
	
	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
