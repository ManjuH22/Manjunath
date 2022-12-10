package TestScript;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class jdbc_Connec 
{
	@Test
	public void script1() throws SQLException
	{
		String un="root";
		String pass="Manoj123";
		String url="jdbc:mysql://localhost:3306/RASA14";
		Connection dm = DriverManager.getConnection(url, un, pass);
		Statement create = dm.createStatement();
		ResultSet out = create.executeQuery("select * from user_cred");
		out.next();
		System.out.println(out.getString("username"));
		System.out.println(out.getString("pass"));
		
	}
	

}
