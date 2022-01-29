package com.GestionEtudiants.GestionEtudiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.GestionEtudiants.GestionEtudiants.model.EntityEtudiants;

@Repository
public interface EtudiantsRepository extends JpaRepository<EntityEtudiants, Long>{
	
	@Query("SELECT u FROM EntityEtudiants u WHERE u.matricule=:matricule")
	EntityEtudiants searcheStudent(int matricule);
	
	
	@Transactional
	@Modifying
	@Query("DELETE FROM EntityEtudiants u WHERE u.matricule=:mat")
	void deleteStudent(int mat);

	
}
