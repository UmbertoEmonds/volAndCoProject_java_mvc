package sample.Model;

import java.util.*;

public class Vol {

    private String code;

    private boolean confirme;

    private Date dateDepart;

    private Date dateArrivee;

    private Aeroport aeroportArrive;

    private Aeroport aeroportDepart;

    private List<Escale> escales;

    private int nbPlaces;
    
    
    public Aeroport arrivée;

    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isFerme() {
		return confirme;
	}

	public void setFerme(boolean ferme) {
		this.confirme = ferme;
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

	public Aeroport getAeroportArrive() {
		return aeroportArrive;
	}

	public void setAeroportArrive(Aeroport aeroportArrive) {
		this.aeroportArrive = aeroportArrive;
	}

	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	public List<Escale> getEscales() {
		return escales;
	}

	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}

	public void setNbPlaces(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public Aeroport getArrivée() {
		return arrivée;
	}

	public void setArrivée(Aeroport arrivée) {
		this.arrivée = arrivée;
	}

	public Vol(boolean confirme) {
    	this.code = String.valueOf(new Random().nextInt(1000));
    	this.confirme = confirme;
    }
    
	@Override
	public String toString(){
		return "code vol: " + code + "ouvert: " + confirme + ".";
	}
	
    public void calculerDuree() {
        // TODO implement here
    }

}