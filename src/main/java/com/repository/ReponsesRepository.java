package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Enfant;
import com.model.Reponses;

@Repository("reponseRepository")
public interface ReponsesRepository extends  JpaRepository<Reponses, Integer>{

}
