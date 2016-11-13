package sample.Model;

import java.util.*;

public class Aeroport {

    private String nom;

    private String code;
    
    private String ville;

    private List<Ville> villes;
    
    public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Ville> getVilles() {
		return villes;
	}

	public void setVilles(List<Ville> villes) {
		this.villes = villes;
	}

	public Aeroport(String nom, String code) {
    	this.nom = nom;
    	this.code = code;
    }

}