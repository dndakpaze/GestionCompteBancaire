package com.mit.model;

import java.util.Date;

public class Compte {
	
	private int TypeCompteId;
	private int ClientId;
	private Date DateOuverture;
	

	public int getTypeCompteId() {
		return TypeCompteId;
	}



	public void setTypeCompteId(int typeCompteId) {
		TypeCompteId = typeCompteId;
	}



	public int getClientId() {
		return ClientId;
	}



	public void setClientId(int clientId) {
		ClientId = clientId;
	}



	public Date getDateOuverture() {
		return DateOuverture;
	}



	public void setDateOuverture(Date dateOuverture) {
		DateOuverture = dateOuverture;
	}



	public Compte(int typeCompteId, int clientId, Date dateOuverture) {
		super();
		TypeCompteId = typeCompteId;
		ClientId = clientId;
		DateOuverture = dateOuverture;
	}



	public Compte() {
	}

}
