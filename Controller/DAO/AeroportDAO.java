package sample.Controller.DAO;

import java.util.ArrayList;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import sample.Model.Aeroport;

public class AeroportDAO {

	private int nbRacineNoeuds;
	ArrayList<Aeroport> listeAeroportsXML = new ArrayList<>();
	
	public ArrayList<Aeroport> getListeAeroportsXML() {
		return listeAeroportsXML;
	}

	public AeroportDAO(){
		
		ToolsXML toolsXML = new ToolsXML("aeroports.xml");
		
		nbRacineNoeuds = toolsXML.openXML().getLength();
		
		for (int i = 0; i<nbRacineNoeuds; i++) {

		    if(toolsXML.openXML().item(i).getNodeType() == Node.ELEMENT_NODE) {

		    	final Element personne = (Element) toolsXML.openXML().item(i);
		    
		    	listeAeroportsXML.add(new Aeroport(personne.getAttribute("code"), personne.getAttribute("nom")));
		    
		    }               
		}
		
	}
	
}
