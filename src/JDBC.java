import java.sql.*;

public class JDBC {
public static Connection connect()
{
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ardent","root","");
	} catch (ClassNotFoundException e) {
	
		e.printStackTrace(); 
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return con;
	
}
}
