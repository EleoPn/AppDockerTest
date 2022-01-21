package com.isika.app.AppDockerTest.modele;


public class Personne {

	String nom;
	String message;
	String prenom;

	public Personne() {

	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMessage() {
		return message;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Personne(String nom, String message, String prenom) {
		super();
		this.nom = nom;
		this.message = message;
		this.prenom = prenom;
	}

}
