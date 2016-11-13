package sample.Controller.DAO;

import java.util.ArrayList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import sample.Model.CompanieAerienne;

public class CompagniesDAO {

	private int nbRacineNoeuds;
	ArrayList<CompanieAerienne> compagnieAerienneXML = new ArrayList<>();
	
	public ArrayList<CompanieAerienne> getCompagnieAerienneXML() {
		return compagnieAerienneXML;
	}

	public CompagniesDAO(){
		
		ToolsXML toolXML = new ToolsXML("compagnies.xml");
		
		nbRacineNoeuds = toolXML.openXML().getLength();
		
		for (int i = 0; i<nbRacineNoeuds; i++) {

		    if(toolXML.openXML().item(i).getNodeType() == Node.ELEMENT_NODE) {

		    	final Element personne = (Element) toolXML.openXML().item(i);
		    
		    	compagnieAerienneXML.add(new CompanieAerienne(personne.getAttribute("code"), personne.getAttribute("nom")));
		    
		    }               
		}
		
	}
}
