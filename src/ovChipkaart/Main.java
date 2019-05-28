package ovChipkaart;

import java.sql.*;

public class Main {
	public static void main(String[] args) {
		
		ReizigerOracleDaolmpl DAO = new ReizigerOracleDaolmpl();
		Reiziger R1 = new Reiziger(0, "Kelvin", "20-04-1997");
		DAO.save(R1);
		Reiziger R2 = new Reiziger(1, "Misha" , "25-5-1990");
		DAO.save(R2);
		
		System.out.println(DAO.findAll());
		
		R1.setGBdatum("25-04-1997");
		DAO.update(R1);
		
		System.out.println(DAO.findAll());
	}
}
