package sample.Controller.DAO;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ToolsXML {

	public static final String PATH = "C:\\Users\\Umberto\\IdeaProjects\\VolAndCo\\src\\sample\\Data\\";
	private Document document;
	
	public ToolsXML(String nomXML){
		
		try{
				
		DocumentBuilderFactory fabrique = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder constructeur = fabrique.newDocumentBuilder();
		
		document = constructeur.parse(PATH + nomXML);
		
		} catch (IOException e){
			System.out.println("Erreur d'entrée/sortie");
		} catch(SAXException e){
			System.out.println("Erreur lors du parsing du document");
		} catch(ParserConfigurationException e){
			System.out.println("Erreur de configuration du parseur DOM lors de l'appel à fabrique.newDocumentBuilder();");
		}
						
	}
	
	public NodeList openXML(){
		
		NodeList listeNoeud = null;
		
		try{
			
		listeNoeud  = this.document.getDocumentElement().getChildNodes();
		
		} catch (Exception e){
			
			System.out.println("Erreur lors de la récupération des données du fichier XML");
			
		}
		return listeNoeud;
	}
	
}
