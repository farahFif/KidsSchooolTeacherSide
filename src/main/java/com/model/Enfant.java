package com.model;



import java.util.Set;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:12
 */
@Entity

@Table(name = "ELEVE")
public class Enfant  {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Enf_id")
	private int id;
	@Column
	private String Nom;
	@Column
	private String Prenom;
	@Column
	private int Num;
	@Column
	private int Score;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "niveau_Niv_id")
	private Niveau niveau;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_Par_id")
	private Parent parent;	
	
	
	/*@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "test_id")
	@JoinColumn(name = "test_id")
	private Set<Test> Test;*/
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            })
	    @JoinTable(name = "test_resultat",
	            joinColumns = { @JoinColumn(name = "ELEVE_id") },
	            inverseJoinColumns = { @JoinColumn(name = "test_id") })
	 private Set<Test> test;
	
	
	public Enfant(){

	}

	 public int getID() {
	        return id;
	    }
	 public Niveau getLang() {
	        return niveau;
	    }
	public String getNom(){
		return this.Nom;
	}

	public String getPrenom(){
		return this.Prenom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom){
			this.Nom = nom;
	}

	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom){
      this.Prenom = prenom ;
	}

	
	public void finalize() throws Throwable {
		super.finalize();
	}

	public int getBonus(){
		return 0;
	}

	public Niveau getNiveauScolaire(){
		return this.niveau;
	}

	

	/**
	 * 
	 * @param bn
	 */
	public  void setBonus(int bn){

	}

	/**
	 * 
	 * @param ns
	 */
	public  void setNiveauScolaire(int ns){

	}
	
	public  void setParent(int ns){

	}

	/**
	 * 
	 * @param nom
	 */


}