package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Enfant;
import com.model.Parent;

@Repository("parentRepository")
public interface ParentRepository extends JpaRepository<Parent, Long>{

	 @Query(value = "SELECT * FROM parent WHERE par_id = ?1 ", nativeQuery = true)
	 Parent findParent(int id);
	
}
