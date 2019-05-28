package les1;

import java.sql.*;

public class Main {
	
	private static final String DB_DRIV = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/xepdb1";
	private static final String DB_USER = "KELVIN";
	private static final String DB_PASS = "0000";
	private static Connection conn;
	
	
	
	public static void main(String [] args) throws SQLException {
		
		try {
			Class.forName(DB_DRIV).newInstance();
		} 
		catch (InstantiationException | IllegalAccessException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		System.out.println("Connection made with " + DB_URL + "\n");
		
		Statement stmt = conn.createStatement();
		
		String strQuery = "DELETE FROM afdelingen WHERE anr = 50  ";
		stmt.executeUpdate(strQuery);
		System.out.println("Afdelingen met anr 50 verwijderd");
		
		String queryText = "Select * FROM afdelingen";
		ResultSet rs = stmt.executeQuery(queryText);
		System.out.println("Eerste ResultSet: " + rs + "\n");
		

		int anr;
		String naam;
		String locatie; 
		while (rs.next()) {   
			anr = rs.getInt("ANR");	
			naam = rs.getString("naam");
			locatie = rs.getString("locatie"); 
			System.out.println("Afdeling nr: " + anr + ", " + naam + " in " + locatie);
		}	

		rs.close();
		stmt.close();	
		System.out.println("");
	}

}
