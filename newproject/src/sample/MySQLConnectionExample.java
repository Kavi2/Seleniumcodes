package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3305/seleniumusers", "admin", "D101085");
		
		Statement statement=connection.createStatement();
		
		 ResultSet result= statement.executeQuery("SELECT * FROM superhero");
		
		 while(result.next()) {
			 
			 System.out.println("Name:  "+result.getString(2)+"Nickname:  "+result.getString(3));
		 }
		
		
		

	}

}
