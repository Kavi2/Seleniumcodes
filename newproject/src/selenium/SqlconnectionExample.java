package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlconnectionExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3305/seleniumusers", "admin", "D101085");
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery("select * from superhero");
		
		while(result.next()) {
			System.out.println("Name :" +result.getString(2));
		}

	}

}


