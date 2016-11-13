package sample.Controller.Buisiness;

import sample.Controller.DAO.ReservationDAO;
import sample.Model.Client;
import sample.Model.Passager;
import sample.Model.Reservation;
import sample.Model.Vol;

import java.util.ArrayList;

public class ReservationController {

	private ArrayList<Reservation> listeReservations = new ArrayList<>();

	public ArrayList<Reservation> getListeReservations() {
		return listeReservations;
	}
	
	ReservationDAO reservationDAO = new ReservationDAO();
	
	public ReservationController(){
		
		reservationDAO.readXML(listeReservations);
		
	}
	
	public void ajouterReservations(String id, Vol vol, Client client, Passager passager, String date){
		
		listeReservations.add(new Reservation(id, new Vol(true), new Client("", "", "", ""), new Passager("", "", "", ""), "")); // demander à l'user de selectionner son profil client
		
	}
	
}
