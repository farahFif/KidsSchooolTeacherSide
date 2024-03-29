package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_resultat")
public class Test_resultat {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Tes_res_id")
	private int id;
	
	@Column(name="score")
	private int score;
	
	@Column(name="date")
	private Date date;

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
