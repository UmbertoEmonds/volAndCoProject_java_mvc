package sample.Controller.DAO;

import java.util.ArrayList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import sample.Model.Ville;

public class VilleDAO {

	private int nbRacineNoeuds;
	ArrayList<Ville> villeXML = new ArrayList<>();
	
	public ArrayList<Ville> getVilleXML() {
		return villeXML;
	}
	
	public VilleDAO(){
		
		ToolsXML toolsXML = new ToolsXML("villes.xml");
		
		nbRacineNoeuds = toolsXML.openXML().getLength();
		
		for (int i = 0; i<nbRacineNoeuds; i++) {

		    if(toolsXML.openXML().item(i).getNodeType() == Node.ELEMENT_NODE) {

		    	final Element personne = (Element) toolsXML.openXML().item(i);
		    
		    	villeXML.add(new Ville(personne.getAttribute("code"), personne.getAttribute("nom")));
		    	
		    
		    }               
		}
		
	}
	
}
