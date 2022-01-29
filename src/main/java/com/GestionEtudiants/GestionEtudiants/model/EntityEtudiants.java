package com.GestionEtudiants.GestionEtudiants.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EntityEtudiantsSpring")
public class EntityEtudiants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private int matricule;
	private String nom;
	private String prenom;
	private String niveau;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public EntityEtudiants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EntityEtudiants(int matricule, String nom, String prenom, String niveau) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.niveau = niveau;
	}
	@Override
	public String toString() {
		return "EntityEtudiants [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom
				+ ", niveau=" + niveau + "]";
	}

}
