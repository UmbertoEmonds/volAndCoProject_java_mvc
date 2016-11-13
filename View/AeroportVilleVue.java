package sample.View;

import java.util.ArrayList;

public class AeroportVilleVue {

	public ArrayList<String> afficherListe(ArrayList<String> listeAeroportVille){

		ArrayList<String> liste = new ArrayList<>();

		for (int i = 0; i<listeAeroportVille.size(); i++){
			liste.add(listeAeroportVille.get(i));
		}

		return liste;

	}
	
}
