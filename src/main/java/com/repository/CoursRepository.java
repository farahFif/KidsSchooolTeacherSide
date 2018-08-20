package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Cours;
import com.model.Enfant;

@Repository("CoursRepository")
public interface CoursRepository extends JpaRepository<Cours, Integer>{

	 @Query(value = "SELECT * FROM cours", nativeQuery = true)
	  List<Cours> findCours();
	 
}
