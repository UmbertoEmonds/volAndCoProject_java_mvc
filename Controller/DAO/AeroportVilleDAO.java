package sample.Controller.DAO;

import java.util.ArrayList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class AeroportVilleDAO {

	private int nbRacineNoeuds;
	ArrayList<String> aeroportVilleXML = new ArrayList<>();
	
	public ArrayList<String> getAeroportVilleXML() {
		return aeroportVilleXML;
	}

	public AeroportVilleDAO(){
		
		ToolsXML toolsXML = new ToolsXML("aeroportVille.xml");
		
		nbRacineNoeuds = toolsXML.openXML().getLength();
		
		for (int i = 0; i<nbRacineNoeuds; i++) {

		    if(toolsXML.openXML().item(i).getNodeType() == Node.ELEMENT_NODE) {

		    	final Element personne = (Element) toolsXML.openXML().item(i);
		    
		    	aeroportVilleXML.add(personne.getAttribute("codeAeroport") + " - " + personne.getAttribute("codeVille"));
		    
		    }               
		}
		
	}
	
}
