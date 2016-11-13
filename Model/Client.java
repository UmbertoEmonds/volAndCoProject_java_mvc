package sample.Model;

import java.util.Random;

public class Client extends Personne {
	
    private int id;
	
    public Client(String nom, String prenom, String adresse, String numTel) {
    	super(nom, prenom, adresse, numTel);
    	this.id = new Random().nextInt(1000);
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void annulerReservation() {
        // TODO implement here
    }

    public void confirmerReservation() {
        // TODO implement here
    }

}