package ovChipkaart;

import java.sql.Date;

public class Reiziger {

	private String naam;
	private Date gbdatum;
	
	public Reiziger() {
		
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
