package com.animoz.repository;

import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.animoz.entite.Animal;

@Repository
public class AnimalRepository {

	// @PersistenceContext
	@Autowired
	private EntityManager entitymanager;
	
	public List<Animal> getListeAnimaux() {				
		
		return entitymanager.createQuery("SELECT a FROM Animal a ORDER BY a.nom", Animal.class)
							.getResultList();		
	}
}
