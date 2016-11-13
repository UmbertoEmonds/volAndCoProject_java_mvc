package sample.Controller.Buisiness;


import sample.Controller.DAO.VilleDAO;
import sample.View.VilleVue;

public class VilleController {

	VilleDAO villesDAO = new VilleDAO();
	VilleVue villeVue = new VilleVue();
	
	public void afficherListe(){
		
		villeVue.afficherListe(villesDAO.getVilleXML());
		
	}
	
}
