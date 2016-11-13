package sample.Controller.Buisiness;


import sample.Controller.DAO.AeroportVilleDAO;
import sample.View.AeroportVilleVue;

import java.util.ArrayList;

public class AeroportVilleController {

	AeroportVilleVue aeroportVilleVue = new AeroportVilleVue();
	AeroportVilleDAO aeroportVilleDAO = new AeroportVilleDAO();
	
	public ArrayList<String> afficherListe(){
		return aeroportVilleVue.afficherListe(aeroportVilleDAO.getAeroportVilleXML());
	}
	
}
