package com.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:13
 */
@Entity

@Table(name = "QUESTION")
public class Question {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Que_id")
	private int id;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "test_Tes_id")
	private Test test;	
	//Avec Reponses
		@OneToMany(cascade = CascadeType.ALL,
		            fetch = FetchType.LAZY,
		            mappedBy = "question")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
	    private List<Reponses> reponses;
	@Column
	private int NumQ;
	@Column
	private String Contenu;
	
	@Column
	private Boolean decours;
	
	@Column
	private String Reponse;
	public Question(){

	}
	
	public boolean getDecours(){
		return this.decours;
	}
	
	public void setDeCours(boolean i){
		this.decours = i;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public List<Reponses> getReponses() {
		return (List<Reponses>) reponses;
	}
	public void setReponses(List<Reponses> list) {
		this.reponses = list;
	}
	public int getNumQ() {
		return NumQ;
	}
	public void setNumQ(int numQ) {
		NumQ = numQ;
	}
	public String getContenu() {
		return Contenu;
	}
	public void setContenu(String contenu) {
		Contenu = contenu;
	}
	public String getReponse() {
		return Reponse;
	}
	public void setReponse(String reponse) {
		Reponse = reponse;
	}
	
	
}
