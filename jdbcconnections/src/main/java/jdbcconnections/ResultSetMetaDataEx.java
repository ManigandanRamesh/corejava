package jdbcconnections;
import java.sql.*;

public class ResultSetMetaDataEx {

	public static void main(String[] args) {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");  
			PreparedStatement ps=con.prepareStatement("select * from student");  
			ResultSet rs=ps.executeQuery();  
			ResultSetMetaData rsmd= rs.getMetaData();
			System.out.println("Total columns: "+rsmd.getColumnCount()); 
			System.out.println("1st column name     : "+rsmd.getColumnName(3));  
			System.out.println("sType Name of 1st column: "+rsmd.getColumnTypeName(3));  
			  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
			 
	}


