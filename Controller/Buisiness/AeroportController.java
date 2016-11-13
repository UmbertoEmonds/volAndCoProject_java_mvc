package sample.Controller.Buisiness;

import sample.Controller.DAO.AeroportDAO;
import sample.View.AeroportVue;

import java.util.ArrayList;

public class AeroportController {
	
	AeroportDAO aeroportDAO = new AeroportDAO();
	AeroportVue aeroportVue = new AeroportVue();
	
	public ArrayList<String> afficherListe(){
		
		return aeroportVue.afficherListe(aeroportDAO.getListeAeroportsXML());
		
	}
	
}
