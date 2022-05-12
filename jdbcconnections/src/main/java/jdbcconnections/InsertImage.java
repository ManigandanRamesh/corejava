package jdbcconnections;
import java.io.FileInputStream;
import java.sql.*;

public class InsertImage {

	public static void main(String[] args) {
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");  
			              
			PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
			ps.setString(1, "Kalai");
			
			FileInputStream fis= new FileInputStream("D:\\New folder\\new1.jpg");
			ps.setBinaryStream(2,fis,fis.available());
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}catch (Exception e) {
				e.printStackTrace();}  
			}  


	}


