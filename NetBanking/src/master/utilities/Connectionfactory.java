package master.utilities;
import java.sql.*;


public class Connectionfactory {
	Connection cn =null;
	public Connection getconnect(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","banking","banking");
		}
	   catch(ClassNotFoundException ce)
		{
		    ce.printStackTrace();	
         }
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return cn;
		
		
	}
		
}
	

	


