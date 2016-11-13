package sample.View;

import sample.Model.Aeroport;

import java.util.ArrayList;


public class AeroportVue {
	
	public ArrayList<String> afficherListe(ArrayList<Aeroport> listeAeroport){

		ArrayList<String> liste = new ArrayList<>();

		for(int i = 0; i<listeAeroport.size(); i++){
			liste.add(listeAeroport.get(i).getCode() + " - " + listeAeroport.get(i).getNom());
		}

		return liste;
		
	}
	
}
