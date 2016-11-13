package sample.Model;

import java.util.*;

public class Reservation {

    private int id;

    private Vol vol;

    private Client client;

    private Passager passager;

    private String date;
	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Reservation(String id, Vol vol, Client client, Passager passager, String date) {
		this.id = new Random().nextInt(1000);
    	this.vol = vol;
    	this.client = client;
    	this.passager = passager;
    	this.date = date;
    }

}