package com.animoz.repository;

import java.util.List;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.animoz.entite.Soigneur;

@Repository
public class SoigneurRepository {

	// @PersistenceContext
	@Autowired
	private EntityManager entitymanager;
	
	public List<Soigneur> getListeSoigneurs() {				
		
		return entitymanager.createQuery("SELECT s FROM Soigneur s ORDER BY s.nom", Soigneur.class)
							.getResultList();		
	}
	
}
