package sample.Model;

public class CompanieAerienne {

    private String code;
    private String nom;
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public CompanieAerienne(String code, String nom) {
    	this.code = code;
    	this.nom = nom;
    }

    public void proposerVol() {
        // TODO implement here
    }

    public void ouvrirVol() {
        // TODO implement here
    }

    public void fermerVol() {
        // TODO implement here
    }

}