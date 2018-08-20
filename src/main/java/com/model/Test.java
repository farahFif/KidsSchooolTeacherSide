package com.model;



import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:13
 */
@Entity

@Table(name = "TEST")
public class Test {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Tes_id")
	private int id;
	@Column
	private String Matiere;
	@Column
	private int NumT;
	@Column
	private String Titre;
	//Avec Question
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "test")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	private Set<Question> question;
	//avec Matiere
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "matiere_Mat_id")
	private Matiere matiere;	
   	
	/* @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "eleve_id")
	@JoinColumn(name = "eleve_id")
	private Set<Enfant> enfant;*/
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            },
            mappedBy = "test")
    private Set<Enfant> enfant ;
	
	@Column
    private int niveau ;

	
	
	public Test(){

	}

	public void finalize() throws Throwable {

	}

	public String getMatiere(){
		return this.Matiere;
	}

	public int getNum(){
		return 0;
	}

	public String getTitre(){
		return this.Titre;
	}
	
	public int getNiveau(){
		return this.niveau;
	}
	
	public void setNiveau(int niv){
		 this.niveau = niv;
	}
	/**
	 * 
	 * @param matiere
	 */
	public  void setMatiere(Matiere matiere){
          this.matiere = matiere;
	}

	/**
	 * 
	 * @param num
	 */
	public  void setNum(int num){
      this.NumT = num ;
	}

	
	public  void setTitre(String titre){
		this.Titre = titre ;
	}

}