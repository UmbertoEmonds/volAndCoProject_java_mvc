package sample.Model;

import java.util.*;

public class Escale {

    public Escale() {
    }

    public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Aeroport getAeroport() {
		return aeroport;
	}

	public void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	private Date dateDepart;

    private Date dateArrivee;

    private Aeroport aeroport;

    public void calculerDuree() {
        // TODO implement here
    }

}