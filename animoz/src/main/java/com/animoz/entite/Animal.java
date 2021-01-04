package com.animoz.entite;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String origine;
	private String description;
	
	@Enumerated  (EnumType.STRING)
	private Regime regime; 
	
	@ManyToOne
	@JoinColumn(name = "espece_id")
	private Espece espece;
	
	public Long getId() {
		return id;
	}
	
	public Espece getEspece() {
		return espece;
	}
	
	public String getNom() {
		return nom;
	}

	public String getOrigine() {
		return origine;
	}
	
	public String getDesc() {
		return description;
	}
	
	public Regime getRegime() {
		return regime;
	}
	
	public void setOrigine(String s) {
		this.origine = s;
	}
	
	public void setDesc(String s) {
		this.description = s;
	}
	
	public void setRegime(Regime r) {
		this.regime = r;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
