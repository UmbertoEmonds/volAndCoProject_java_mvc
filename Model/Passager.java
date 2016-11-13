package sample.Model;

import java.util.*;

public class Passager extends Personne {

    private int id;
    private String numPassport;
    private Date dateExpirationPassport;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumPassport() {
		return numPassport;
	}

	public void setNumPassport(String numPassport) {
		this.numPassport = numPassport;
	}

	public Date getDateExpirationPassport() {
		return dateExpirationPassport;
	}

	public void setDateExpirationPassport(Date dateExpirationPassport) {
		this.dateExpirationPassport = dateExpirationPassport;
	}

	public Passager(String nom, String prenom, String adresse, String numTel) {
    	super(nom, prenom, adresse, numTel);
    	this.id = new Random().nextInt(1000);
    }
	
	@Override
	public String toString(){
		return nom + ", " + prenom + ", " + adresse;
	}

}