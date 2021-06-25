package com.mit.model;

public class TypeCompte {
	
	// Account type name
	private String libelle;
	
	
	
	public String getLibelle() {
		return libelle;
	}



	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}



	public TypeCompte(String libelle) {
		super();
		this.libelle = libelle;
	}

	public TypeCompte() {
	}

}
