package com.model;

import java.util.List;


public class FormAjQuiz {
	
	
	private String nomQuiz ;
	
	private String question ;

	private List<String> choix ;

	private String bonneRep;
	
	
	public FormAjQuiz(){
		
	}

	public String getNomQuiz() {
		return nomQuiz;
	}

	public void setNomQuiz(String nomQuiz) {
		this.nomQuiz = nomQuiz;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getChoix() {
		return choix;
	}

	public void setChoix(List<String> choix) {
		this.choix= choix ;
	}
	
	public void setChoix(String choix) {
		this.choix.add(choix) ;
	}

	public String getBonneRep() {
		return bonneRep;
	}

	public void setBonneRep(String bonneRep) {
		this.bonneRep = bonneRep;
	}


}
