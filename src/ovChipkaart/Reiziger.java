package ovChipkaart;

public class Reiziger {

	private int reizigerID;
	private String naam;
	private String gbdatum;
	
	public Reiziger(int reizigerID,String nm, String GBdatum) {
		this.reizigerID = reizigerID;
		naam = nm;
		gbdatum = GBdatum;
	}
	
	public int getReizigerID() {
		return reizigerID;
	}
	
	public void setReizigerID(int reID) {
		this.reizigerID = reID;
}
	
	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String nm) {
		naam = nm;
	}
	
	public String getGBdatum() {
		return gbdatum;
	}
	
	public void setGBdatum(String gbd) {
		gbdatum = gbd;
	}
	
	public String toString() {
		String s = reizigerID  + " " + naam + " " + gbdatum;
		return s;
	}
}
