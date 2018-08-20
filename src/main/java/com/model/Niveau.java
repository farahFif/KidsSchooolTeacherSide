package com.model;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;


/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:12
 */
@Entity

@Table(name = "NIVEAU")
public class Niveau implements Serializable{
	/**
	 * 
	 */

	//private Set<Enfant> enfants;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Niv_id")
	private int id;
	@Column
	private String Descirption;
	//Avec Eleve
	@OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "niveau")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
    private Set<Enfant> eleve;
	//Avec Matiere
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "niveau")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	private Set<Matiere> matiere;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescirption() {
		return Descirption;
	}
	public void setDescirption(String descirption) {
		Descirption = descirption;
	}
	public Set<Enfant> getEleve() {
		return eleve;
	}
	public void setEleve(Set<Enfant> eleve) {
		this.eleve = eleve;
	}
	public Set<Matiere> getMatiere() {
		return matiere;
	}
	public void setMatiere(Set<Matiere> matiere) {
		this.matiere = matiere;
	}
	public Niveau(){

	}
	public int getNiveauId(){
		return id ;
	}

}
