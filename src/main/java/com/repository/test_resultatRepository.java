package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Test_resultat;

	 
@Repository("TestResRepository")
 public interface test_resultatRepository extends JpaRepository<Test_resultat, Integer>
{
	 @Query(value = "SELECT * FROM test_resultat WHERE eleve_id = ?1", nativeQuery = true)
	 List<Test_resultat> findByEnfantIDResultat(int a);	
	 
	 @Query(value = "SELECT * FROM test_resultat WHERE test_id = ?1", nativeQuery = true)
	 Test_resultat findByTestIDResultat(String a);
	 
	 @Query(value = "SELECT * FROM test_resultat WHERE eleve_id = ?1 AND test_id = ?2 ", nativeQuery = true)
	 Test_resultat findByEnfTestResultat(String a, String b);
	 
	 @Query(value = "SELECT matiere FROM test WHERE id = ?1 LIMIT 1", nativeQuery = true)
	 String findByTestIDMatiere(int a);
	 
	 @Query(value = "SELECT test_id FROM test_resultat WHERE eleve_id = ?1", nativeQuery = true)
	 List<Integer> findByEnfantIDTestID(int a);	
	 
	 
	 
	 
}
