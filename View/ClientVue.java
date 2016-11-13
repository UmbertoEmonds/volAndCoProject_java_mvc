package sample.View;

import javafx.scene.control.ListView;
import sample.Controller.Buisiness.ClientController;

import java.util.Scanner;

public class ClientVue {
	
	private ClientController clientController = new ClientController();
	private Scanner sc;

	
	public void listerClients(ListView<sample.Model.Client> liste){
		
		for(int i = 0; i<clientController.getClients().size(); i++){
			liste.getItems().add(clientController.getClients().get(i));
		}
	}

	public void ajouterClient(String nom, String prenom, String adresse, String num){
		clientController.ajouterClient(nom, prenom, adresse, num);
	}

	public String rechercherClient(String saisie){
		
		String resutat = "Client recherché non trouvé";

		
		for(int i = 0; i<clientController.rechercherClient(saisie).size(); i++){
			resutat = clientController.rechercherClient(saisie).get(i).toString();
		}

		return resutat;
		
	}
	
}
