package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connector {
	public static String getDatos(){
		String result = "";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","maven","maven");
			Statement s = conn.createStatement();
			ResultSet r =s.executeQuery("select * from prueba");
			while(r.next()){
				result += r.getString(1)+ " ; ";
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}
}
