package com.GestionEtudiants.GestionEtudiants.repository;


import java.util.List;

import com.GestionEtudiants.GestionEtudiants.model.EntityEtudiants;

public interface EtudiantsMethode {
	public void addStudent(EntityEtudiants s);
	public EntityEtudiants searcheStudent(int matricule);
	public List<EntityEtudiants > AllStudent(); 
	public void deleteEtudiant(int matricule);
	
	
}
