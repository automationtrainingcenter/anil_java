package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To work with database we have gather the following information 
 * 1. DB technology (MSSQL Server, MYSQL, Oracle, DB2 ..etc) 
 * 2. DB Server address 
 * 3. DB credentials
 * 4. Database Name we want to connect to 
 * 5. Table Name on which we want to perform the operations
 * 6. Column Names and their data types
 */

public class DatabaseDemo {
	public static void main(String[] args) {
		/*
		 * Load the driver class related to the DB technology dynamically using
		 * forName() method of Class class
		 */
		String driverClass = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driverClass);
			/*
			 * Create connection to the required database by calling getConnection() method
			 * of DriverManager class and storing reference in Connection class object
			 */	
			// connection url for mysql is ("protocol://sever_ip_address:port/data_base_name", "username", "password")
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world", "user1", "password");
			/*
			 * Create Statement class object by calling createStatement() method of
			 * Connection class so that we can execute SQL queries
			 */
			Statement statement = con.createStatement();

			/*
			 * Execute SQL queries using executeQuery() method of Statement class and store
			 * the results in ResultSet class object
			 */
			ResultSet rs = statement.executeQuery("select * from city where CountryCode='IND'");

			/* Iterate over the results using next() method of ResultSet class */
			while(rs.next()) {
				int id = rs.getInt("ID");
				String name = rs.getString("Name");
				String countryCode = rs.getString("CountryCode");
				String district = rs.getString("District");
				long population = rs.getLong("Population");
				System.out.println(id+"\t"+name+"\t"+countryCode+"\t"+district+"\t"+population);
			}

			/* Close the data base connection using close() method of Connection class */
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
