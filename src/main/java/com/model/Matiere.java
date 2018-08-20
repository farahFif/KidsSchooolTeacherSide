package com.model;

import java.util.*;

import javax.persistence.*;


/**
 * @author dell
 * @version 1.0
 * @created 10-mars-2018 00:22:12
 */
@Entity

@Table(name = "MATIERE")

public class Matiere {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Mat_id")
	private int id;
	@Column
	private String Titre;
	@Column
	private String Descirption;
	//Avec test
	@OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.LAZY,
	            mappedBy = "matiere")//L'attribut mappedBy signifie le nom de l'attribut qui gère la relation. Pour le constater
    private Set<Test> test;
	
	//Avec niveau
		@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
		@JoinColumn(name = "niveau_niv_id")
		private Niveau niveau;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getTitre() {
			return Titre;
		}

		public void setTitre(String titre) {
			Titre = titre;
		}

		public String getDescirption() {
			return Descirption;
		}

		public void setDescirption(String descirption) {
			Descirption = descirption;
		}

		public Niveau getNiveau() {
			return niveau;
		}

		public void setNiveau(Niveau niveau) {
			this.niveau = niveau;
		}
		
		
	
}
