package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="REPONSES")
public class Reponses {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Rep_id")
	private int id;
	@Column
	private String contenu;
	@Column
	private boolean choixJuste;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "question_que_id")
	private Question question;	
	
	
	public Reponses(){

	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContenu() {
		return contenu;
	}


	public void setContenu(String contenu) {
		this.contenu = contenu;
	}


	public boolean isChoixJuste() {
		return choixJuste;
	}


	public void setChoixJuste(boolean choixJuste) {
		this.choixJuste = choixJuste;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}
	
	

}
