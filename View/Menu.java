package sample.View;

import sample.Controller.Buisiness.*;

import java.util.Scanner;

public class Menu {

	AeroportController aeroportController = new AeroportController();
	AeroportVilleController aeroportVilleController = new AeroportVilleController();
	CompagnieController compagnieController = new CompagnieController();
	VilleController villeController = new VilleController();
	ClientVue clientVue = new ClientVue();
	ReservationVue reservationVue = new ReservationVue();
	
	
	public Menu() {
		
		 	String saisie = "";
			
			System.out.println("Gestion des réservations");
			System.out.println("	R1 - Rechercher  (sur base de l'id de la réservation, l'id du client ou l'id du passager)");
			System.out.println("	R2 - Ajouter" + "\n");
			
			System.out.println("Gestion des personnes");
			System.out.println("	P1 - Rechercher client (nom ou prenom client)");
			System.out.println("	P2 - Rechercher passager (nom ou prenom passager)");
			System.out.println("	P3 - Ajouter client");
			System.out.println("	P4 - Ajouter passager");
			System.out.println("	P5 - Modifier client");
			System.out.println("	P6 - Modifier passager");
			System.out.println("	P7 - Lister tous les clients" + "\n");

			System.out.println("Gestion des vols");
			System.out.println("	V1 - Rechercher vol");
			System.out.println("	V2 - Ajouter vol");
			System.out.println("	V3 - Fermer vol" + "\n");
			
			System.out.println("Autres");
			System.out.println("	A1 - Lister les aéroports");
			System.out.println("	A2 - Lister les compagnies");
			System.out.println("	A3 - Lister les villes");
			System.out.println("	A4 - Lister les aéroports-ville");
			
			System.out.println("Q - Quitter" + "\n");
						
			while(!saisie.equals("q")){
			
			System.out.println(" --> Faites votre choix");
				
			Scanner sc = new Scanner(System.in);
			saisie = sc.nextLine().toLowerCase();
			
			switch(saisie){
			
				case "r1":
				break;
				
				case "r2": reservationVue.ajouterReservation();
				break;
					
				case "p1":
				break;
					
				case "p2":
				break;
					
				case "p3":
				break;
					
				case "p4":
				break;
					
				case "p5":
				break;
				
				case "p6":
				break;
				
				case "p7":
				break;
				
				case "v1":
				break;
				
				case "v2":
				break;
				
				case "v3":
				break;
				
				case "a1": aeroportController.afficherListe();
				break;
				
				case "a2": compagnieController.afficherListe();
				break;
				
				case "a3": villeController.afficherListe();
				break;
				
				case "a4": aeroportVilleController.afficherListe();
				break;
				
				case "q": 
				break;
			
			}
			
			System.out.println("\n");
			
		}
		System.out.println("A bientôt...");
		
	}
	
}
