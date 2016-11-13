package sample.Controller.DAO;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import sample.Model.Client;

public class ClientDAO {
	
	public void writeXML(ArrayList<Client> listeClients){
	    
		final DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
		
		try {
			
		final DocumentBuilder builder = fabrique.newDocumentBuilder();
		final Document document = builder.newDocument();

		final Element racine = document.createElement("clients");
		document.appendChild(racine);

		for(int i = 0; i<listeClients.size(); i++){
		
			final Element personne = document.createElement("client");
			
			personne.setAttribute("nom", listeClients.get(i).getNom());
			personne.setAttribute("prenom", listeClients.get(i).getPrenom());
			personne.setAttribute("adresse", listeClients.get(i).getAdresse());
			personne.setAttribute("numTel", listeClients.get(i).getNumTel());
			
			racine.appendChild(personne);
			
		}
		
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    final Transformer transformer = transformerFactory.newTransformer();
	    final DOMSource source = new DOMSource(document);
	    
	    final StreamResult sortie = new StreamResult(new File(ToolsXML.PATH + "clients.xml"));
			
	    transformer.setOutputProperty(OutputKeys.VERSION, "1.0");
	    transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	    transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");		
	    		
	    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			
	    transformer.transform(source, sortie);
	    
		}
		catch (final ParserConfigurationException e) {
		    e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
	}
	
	public void readXML(ArrayList<Client> listeClients){
		
		int nbRacineNoeuds;
		
		try {
		
		ToolsXML toolsXML = new ToolsXML("clients.xml");
		
		nbRacineNoeuds = toolsXML.openXML().getLength();
		
		for (int i = 0; i<nbRacineNoeuds; i++) {

		    if(toolsXML.openXML().item(i).getNodeType() == Node.ELEMENT_NODE) {

		    	final Element personne = (Element) toolsXML.openXML().item(i);
		    
		    	listeClients.add(new Client(personne.getAttribute("nom"), personne.getAttribute("prenom"), personne.getAttribute("adresse"), personne.getAttribute("numTel")));
		    
		    }               
		}
		
		}catch(Exception e){
			System.out.println("Erreur lors de la lecture du XML");
		}
		
	}
	
}

