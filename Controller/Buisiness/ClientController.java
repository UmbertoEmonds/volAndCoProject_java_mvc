package sample.Controller.Buisiness;

import sample.Controller.DAO.ClientDAO;
import sample.Model.Client;

import java.util.ArrayList;


public class ClientController{
		
	private ArrayList<Client> clients = new ArrayList<>();
		
	public ArrayList<Client> getClients() {
		return clients;
	}
	
	ClientDAO clientDAO = new ClientDAO();
	
	public ClientController(){
		clientDAO.readXML(clients);
	}
	
	//ajout d'un simple client
	public void ajouterClient(String nom, String prenom, String adresse, String numTel){
		
		clients.add(new Client(nom, prenom, adresse, numTel));
		clientDAO.writeXML(clients);

	}
	
	// création d'une méthode de recherche qui renvoi la liste des clients trouvés par le nom ou le prénom
	public ArrayList<Client> rechercherClient(String nom){
		
		ArrayList<Client> clients = new ArrayList<>();

		try {

			for (int i = 0; i < this.clients.size(); i++) {
				if (nom.equals(this.clients.get(i).getNom())) {
					clients.add(this.clients.get(i));
				} else if (nom.equals(this.clients.get(i).getPrenom())) {
					clients.add(this.clients.get(i));
				} else {
				}
			}
		}catch (Exception e){
			System.out.println("Client non trouvé");
			return null;

		}
		return clients;
	}
	
}
