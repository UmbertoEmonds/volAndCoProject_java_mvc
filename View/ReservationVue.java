package sample.View;

import sample.Controller.Buisiness.ClientController;
import sample.Controller.Buisiness.ReservationController;
import sample.Model.Client;

import java.util.ArrayList;
import java.util.Scanner;


public class ReservationVue {

	ReservationController reservationController = new ReservationController();
	ClientController clientController = new ClientController();
	
	private Scanner sc;
	
	String clientString;
	ArrayList<Client> clientTrouve;
	
	Client client;
	String nom;
	String prenom;
	String adresse;
	String numero;
	
	String reponse;
	
	public void ajouterReservation(){
		
		sc = new Scanner(System.in);
		
		System.out.println("Création d'une reservation: ");
		
		System.out.println("Entrez le nom du client pour lui affecter la reservation: ");
		clientString = sc.nextLine();
		
		clientTrouve = clientController.rechercherClient(clientString);
		
		if(clientTrouve.isEmpty()){
			System.out.println("Veuillez en premier temps créer un client");
		}
		else{
			
			System.out.println("le client a été trouvé: " + clientTrouve.get(0));
			client = clientTrouve.get(0);
			
			System.out.println("Le client est-il également le passager ? (O/N)");
			reponse = sc.nextLine();
			
			if(reponse.equals("O")){
				nom = client.getNom();
				prenom = client.getPrenom();
				adresse = client.getAdresse();
				numero = client.getNumTel();
			}else{
				System.out.println("Entrez le nom du passager: ");
				nom = sc.nextLine();
				System.out.println("Entrez le prenom du passager");
				prenom = sc.nextLine();
				System.out.println("Entrez l'adresse du passager");
				adresse = sc.nextLine();
				System.out.println("Entrez le numero du passager");
				numero = sc.nextLine();
			}
			
		}
		
		
		
	}
	
	
}
