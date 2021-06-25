package com.mit.model;

import java.sql.Date;

public class Operation {
	
	private String CompteNumero;
	private int TypeOperationId;
	private int montant;
	private Date dateOperation;
	
	

	public String getCompteNumero() {
		return CompteNumero;
	}



	public void setCompteNumero(String compteNumero) {
		CompteNumero = compteNumero;
	}



	public int getTypeOperationId() {
		return TypeOperationId;
	}



	public void setTypeOperationId(int typeOperationId) {
		TypeOperationId = typeOperationId;
	}



	public int getMontant() {
		return montant;
	}



	public void setMontant(int montant) {
		this.montant = montant;
	}



	public Date getDateOperation() {
		return dateOperation;
	}



	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}



	public Operation(String compteNumero, int typeOperationId, int montant, Date dateOperation) {
		super();
		CompteNumero = compteNumero;
		TypeOperationId = typeOperationId;
		this.montant = montant;
		this.dateOperation = dateOperation;
	}

	public Operation() {
	}

}
