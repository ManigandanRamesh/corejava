package jdbcconnections;

import java.sql.*;

public class InsertPrepared {


	public static void main(String[] args) {
		
	
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");
			PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?)");
			stmt.setString(1, "jerus");
			stmt.setString(2, "kovai");
			stmt.setInt(3, 55);
			stmt.setInt(4, 108);
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
			  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
					
		

	}


