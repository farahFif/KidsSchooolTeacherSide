package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Matiere;
import com.model.Niveau;

@Repository("matiereRepository")
public interface MatiereRepository extends JpaRepository<Matiere, Integer>
{
	 @Query(value = "SELECT * FROM MATIERE WHERE niveau_niv_id = ?1", nativeQuery = true)
	  List<Matiere> findByNiveauIdMatiere(int n);
  
	 @Query(value = "SELECT * FROM MATIERE WHERE mat_id = ?1", nativeQuery = true)
	  Matiere findByIdMatiere(int n);
}
