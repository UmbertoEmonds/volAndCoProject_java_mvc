package sample.Controller.Buisiness;


import sample.Controller.DAO.CompagniesDAO;
import sample.View.CompagnieVue;

public class CompagnieController {

	CompagniesDAO compagniesDAO = new CompagniesDAO();
	CompagnieVue compagnieVue = new CompagnieVue();
	
	public void afficherListe(){
		
		compagnieVue.afficherListe(compagniesDAO.getCompagnieAerienneXML());
		
	}
	
}
