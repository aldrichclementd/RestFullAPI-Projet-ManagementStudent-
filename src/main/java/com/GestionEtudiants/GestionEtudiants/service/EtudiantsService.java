package com.GestionEtudiants.GestionEtudiants.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.GestionEtudiants.GestionEtudiants.model.EntityEtudiants;
import com.GestionEtudiants.GestionEtudiants.repository.EtudiantsMethode;
import com.GestionEtudiants.GestionEtudiants.repository.EtudiantsRepository;


@Service
public class EtudiantsService implements EtudiantsMethode{

	@Autowired
	EtudiantsRepository er;

	
	
	@Override
	public void addStudent(EntityEtudiants s) {
		er.save(s);
		System.out.println("Donnees sauvegarder");
	};
	@Override
	public EntityEtudiants searcheStudent(int matricule) {	
		return er.searcheStudent(matricule);
	};
	@Override
	public List<EntityEtudiants> AllStudent() {
		List<EntityEtudiants> Allstudent = er.findAll();
		return Allstudent;
	}
	@Override
	public void deleteEtudiant(int matricule) {
		// TODO Auto-generated method stub
		//EntityEtudiants deleteUsers = er.searcheStudent(matricule);
		er.deleteStudent(matricule);
		
	};
	
}
