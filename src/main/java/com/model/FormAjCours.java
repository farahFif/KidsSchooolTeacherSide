package com.model;

import java.util.List;

public class FormAjCours {
	
	private String cours ;
	
	private String question ;
	
	private List<String> choix ;

	private String bonneRep;

	
	public FormAjCours(){
		
	}

	public String getCours() {
		return cours;
	}

	public void setCours(String cours) {
		this.cours = cours;
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
		this.choix = choix;
	}

	public String getBonneRep() {
		return bonneRep;
	}

	public void setBonneRep(String bonneRep) {
		this.bonneRep = bonneRep;
	}

	

}
