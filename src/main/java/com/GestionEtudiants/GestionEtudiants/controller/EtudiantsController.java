package com.GestionEtudiants.GestionEtudiants.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GestionEtudiants.GestionEtudiants.model.EntityEtudiants;
import com.GestionEtudiants.GestionEtudiants.repository.EtudiantsRepository;
import com.GestionEtudiants.GestionEtudiants.service.EtudiantsService;



@RestController
public class EtudiantsController {
	@Autowired
	private EtudiantsService es;
	@Autowired
	private EtudiantsRepository er;
	
	
	
	
	
	@PostMapping("addUser")
	public void addStudent(	@RequestParam(required = true)int matricule ,
							@RequestParam(required = true)String nom ,
							@RequestParam(required = true)String prenom ,
							@RequestParam(required = true)String niveau
							) {
		
		EntityEtudiants newEtudiant = new EntityEtudiants(matricule, nom, prenom, niveau);
		er.save(newEtudiant);
	}
	
	@GetMapping("/rechercheEtd")
	public EntityEtudiants rechercheEtd(@RequestParam(required = true )int matricule) {
	//	EntityEtudiants ee= es.searcheStudent(matricule);	
		return es.searcheStudent(matricule);
	}
	
	@GetMapping("/allUsers")
	public List<EntityEtudiants> allUsers(){
		System.out.println("Etudiant ajouter avec succes");
		return es.AllStudent();	
	}
	
	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam(required = true)int matricle) {
		es.deleteEtudiant(matricle);
		System.out.println("Etudiant avec le matricule :"+matricle + " est supprimer");
	}
	
	
	
	

}
