package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Niveau;

@Repository("NiveauRepository")
public interface NiveauRepository extends JpaRepository<Niveau, Integer>{

}
