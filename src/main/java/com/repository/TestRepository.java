package com.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Enfant;
import com.model.Parent;
import com.model.Test;

import org.springframework.stereotype.Repository;

@Repository("testRepository")
public interface TestRepository extends JpaRepository<Test, Integer> {

	@Query(value = "SELECT tes_id FROM TEST WHERE matiere_mat_id = ?1 AND date = ?2", nativeQuery = true)
	int findByMatiereDateTestID(int matId , Date date);
	
	@Query(value = "SELECT tes_id FROM TEST WHERE matiere_mat_id = ?1 AND date = ?2", nativeQuery = true)
	Test findByMatiereDateTest(int matId , Date date);
	
	@Query(value = "SELECT tes_id FROM TEST WHERE matiere_mat_id = ?1 ", nativeQuery = true)
	int findByMatiereTestID(int matId);
	
	@Query(value = "SELECT SUM(score) FROM TEST WHERE matiere_mat_id = ?1 ", nativeQuery = true)
	int findByMatiereScore(int matId);
	
	@Query(value = "SELECT * FROM TEST WHERE titre = ?1 ", nativeQuery = true)
	Test findBytitreTest(String titre);
	
	@Query(value = "SELECT * FROM TEST WHERE matiere_mat_id = ?1 ", nativeQuery = true)
	 int findByTestIDMatiere(int id);
	
	
	
	
	
	
	
}
