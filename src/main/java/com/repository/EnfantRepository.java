package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Enfant;
import com.model.Parent;
import com.model.Utilisateur;

@Repository("enfantRepository")
public interface EnfantRepository extends JpaRepository<Enfant, Integer>
{
	 @Query(value = "SELECT * FROM ELEVE WHERE NOM = ?1", nativeQuery = true)
	  List<Enfant> findByNomEnfant(String nom);
	 
	 @Query(value = "SELECT * FROM ELEVE WHERE parent_Par_id = ?1", nativeQuery = true)
	  List<Enfant> findByParentIDEnfant(int id);
	 

	 @Query(value = "SELECT * FROM Parent WHERE Par_id = ?1", nativeQuery = true)
	 Parent findByParentIDParent(int id);
	 
	 
	 @Query(value = "SELECT count(enf_id) FROM eleve WHERE parent_Par_id = ?1", nativeQuery = true)
	 int findNombreEnfant(int id);
	 
	
	

}
