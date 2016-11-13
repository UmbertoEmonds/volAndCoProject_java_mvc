package sample.Model;

import java.util.*;

public class Personne {

	protected String nom;

	protected String prenom;

	protected Date dateNaissance;

	protected String adresse;

	protected String numTel;

	protected String mail;
	
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
    public Personne(String nom, String prenom, String adresse, String numTel) {
    	
    	this.nom = nom;
    	this.prenom = prenom;
    	this.adresse = adresse;
    	this.numTel = numTel;
    	
    }
    
    @Override
    public String toString(){
    	return nom + ", " + prenom + ", " + adresse + ", " + numTel;
    }

}