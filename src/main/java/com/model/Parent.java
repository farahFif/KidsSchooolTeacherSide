package com.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "Parent")
public class Parent  {

	//public Enfant m_Enfant; hadhi telli join vc Enfant

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Par_id")
	private int id;
	@Column
	private String Nom;
	@Column
	private String Prenom;
	@Column
	private int Num;
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "parent")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	private Set<Enfant> eleve;
	public Parent(){

	}

	
	public Parent(String nom, String prenom){
		this.Nom = nom ;
		this.Prenom = prenom ;
	}

	
	public String getNom(){
		return this.Nom;
	}

	public String getPrenom(){
		return this.Prenom;
	}
	public int getID(){
		return this.id;
	}
	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom){

	}

	/**
	 * 
	 * @param prenom
	 */
	public  void setPrenom(String prenom){

	}

}