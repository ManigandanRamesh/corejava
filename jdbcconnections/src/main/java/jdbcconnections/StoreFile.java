package jdbcconnections;

import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class StoreFile {

	public static void main(String[] args) {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");  
			      
			PreparedStatement ps=con.prepareStatement("Insert into filetable1 values(?,?)");
			
			File f=new File("d:\\assignment.txt");
			FileReader fr=new FileReader(f);
			
			ps.setInt(1, 110);
			ps.setCharacterStream(2,fr,(int)f.length());
			int i=ps.executeUpdate();
			System.out.println(i+ "Records affected");
			
			con.close();
			

	}catch(Exception e) {
		System.out.println(e);
	}

}
}