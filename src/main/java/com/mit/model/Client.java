package com.mit.model;

import java.util.Date;

public class Client {
	
	private String Nom;
	private String Prenom;
	private String Sexe;
	private String Adresse;
	private Date DateNaissance;
	
	

	public String getNom() {
		return Nom;
	}



	public void setNom(String nom) {
		Nom = nom;
	}



	public String getPrenom() {
		return Prenom;
	}



	public void setPrenom(String prenom) {
		Prenom = prenom;
	}



	public String getSexe() {
		return Sexe;
	}



	public void setSexe(String sexe) {
		Sexe = sexe;
	}



	public String getAdresse() {
		return Adresse;
	}



	public void setAdresse(String adresse) {
		Adresse = adresse;
	}



	public Date getDateNaissance() {
		return DateNaissance;
	}



	public void setDateNaissance(Date dateNaissance) {
		DateNaissance = dateNaissance;
	}



	public Client(String nom, String prenom, String sexe, String adresse, Date dateNaissance) {
		super();
		Nom = nom;
		Prenom = prenom;
		Sexe = sexe;
		Adresse = adresse;
		DateNaissance = dateNaissance;
	}


	public Client() {
	}

}
