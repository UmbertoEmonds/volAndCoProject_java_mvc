package sample.Model;

import java.util.*;

public class Ville {

    private String nom;

    private String pays;

    private String code;
	
    public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Ville(String code, String nom) {
    	this.code = code;
    	this.nom = nom;
    }
}