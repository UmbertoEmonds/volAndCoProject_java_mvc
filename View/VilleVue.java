package sample.View;

import sample.Model.Ville;

import java.util.ArrayList;


public class VilleVue {

	public void afficherListe(ArrayList<Ville> villesListe){
		
		for (int i = 0; i<villesListe.size(); i++){
			System.out.println(villesListe.get(i).getCode() + " - " + villesListe.get(i).getNom());
		}
		
	}
	
}
