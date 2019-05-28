package ovChipkaart;

import java.sql.Date;

public class Reiziger {

	private int reizigerID;
	private String naam;
	private Date gbdatum;
	
	public Reiziger() {
		
	}
	
	public int getReizigerID() {
		return reizigerID;
	}
	
	public void setReizigerID(int reizigerID) {
		this.reizigerID = reizigerID;
}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String nm) {
		naam = nm;
	}
	
	public Date getGBdatum() {
		return gbdatum;
	}
	
	public void setGBdatum(Date gbd) {
		gbdatum = gbd;
	}
}
