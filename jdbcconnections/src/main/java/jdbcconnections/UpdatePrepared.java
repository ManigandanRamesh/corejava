package jdbcconnections;

import java.sql.*;


public class UpdatePrepared {

	public static void main(String[] args) {
		//updaterecords();
 		deleterecords();
	}
	     public static void updaterecords() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");
			PreparedStatement stmt=con.prepareStatement("update table1 set id=? where name=? ");
		    stmt.setInt(1, 10);
			stmt.setString(2, "ani");
			int i=stmt.executeUpdate();  
			System.out.println(i+" records updated");
		
			
			con.close();  
			  
		}catch(Exception e){ System.out.println(e);}  
		  
		} 
	     public static void deleterecords() {
	    	 try {
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");
				PreparedStatement stmt=con.prepareStatement("delete from table1 where id=? ");
				stmt.setInt(1, 1);
				int i=stmt.executeUpdate();  
				System.out.println(i+" records deleted");
				con.close();  
				  
	 		}catch(Exception e){ System.out.println(e);}
	    	 
	     }
		
}


