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
import sample.Model.Passager;
import sample.Model.Reservation;
import sample.Model.Vol;

public class ReservationDAO {
	
	String nomPassager;
	String prenomPassager;
	String adressePassager;
	String numTelPassager;
	
	String nomClient;
	String prenomClient;
	String adresseClient;
	String numTelClient;

	public void writeXML(ArrayList<Reservation> listeReservation){
	    
		final DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
		
		try {
			
		final DocumentBuilder builder = fabrique.newDocumentBuilder();
		final Document document = builder.newDocument();

		final Element racine = document.createElement("reservations");
		document.appendChild(racine);

		for(int i = 0; i<listeReservation.size(); i++){
		
			final Element personne = document.createElement("reservation");
			
			personne.setAttribute("id", String.valueOf(listeReservation.get(i).getId()));
			personne.setAttribute("vol", listeReservation.get(i).getVol().toString());
			personne.setAttribute("client", listeReservation.get(i).getClient().toString());
			personne.setAttribute("passager", listeReservation.get(i).getPassager().toString());
			personne.setAttribute("date", listeReservation.get(i).getDate());
			
			nomClient = listeReservation.get(i).getClient().getNom();
			prenomClient = listeReservation.get(i).getClient().getPrenom();
			adresseClient = listeReservation.get(i).getClient().getAdresse();
			numTelClient = listeReservation.get(i).getClient().getNumTel();
			
			nomPassager = listeReservation.get(i).getPassager().getNom();
			prenomPassager = listeReservation.get(i).getPassager().getPrenom();
			adresseClient = listeReservation.get(i).getClient().getAdresse();
			numTelClient = listeReservation.get(i).getClient().getNumTel();
			
			racine.appendChild(personne);
			
		}
		
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    final Transformer transformer = transformerFactory.newTransformer();
	    final DOMSource source = new DOMSource(document);
	    
	    final StreamResult sortie = new StreamResult(new File(ToolsXML.PATH + "reservations.xml"));
			
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
	
	public void readXML(ArrayList<Reservation> listeReservation){
		
		int nbRacineNoeuds;
		
		try {
		
		ToolsXML toolsXML = new ToolsXML("reservations.xml");
		
		nbRacineNoeuds = toolsXML.openXML().getLength();
		
		for (int i = 0; i<nbRacineNoeuds; i++) {

		    if(toolsXML.openXML().item(i).getNodeType() == Node.ELEMENT_NODE) {

		    	final Element personne = (Element) toolsXML.openXML().item(i);
		    	
		    	listeReservation.add(new Reservation(personne.getAttribute("id"), new Vol(true),new Client(nomClient, prenomClient, adresseClient, numTelClient), new Passager(nomPassager, prenomPassager, adressePassager, numTelPassager), personne.getAttribute("date")));
		    
		    }               
		}
		
		}catch(Exception e){
			System.out.println("Erreur lors de la lecture du XML");
		}
		
	}
	
}
