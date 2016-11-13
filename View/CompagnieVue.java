package sample.View;

import sample.Model.CompanieAerienne;

import java.util.ArrayList;

public class CompagnieVue {

	public void afficherListe(ArrayList<CompanieAerienne> companieAeriennesListe){
		
		for (int i = 0; i<companieAeriennesListe.size(); i++){
			
			System.out.println(companieAeriennesListe.get(i).getCode() + " - " + companieAeriennesListe.get(i).getNom());

			
		}
		
	}
	
}
