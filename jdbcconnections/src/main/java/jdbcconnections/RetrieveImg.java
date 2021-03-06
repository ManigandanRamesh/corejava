package jdbcconnections;
import java.io.FileOutputStream;
import java.sql.*;

public class RetrieveImg {

	public static void main(String[] args) {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");  
			      
			PreparedStatement ps=con.prepareStatement("select * from imgtable");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){//now on 1st row  
			              
			Blob b=rs.getBlob(2);//2 means 2nd column data  
			byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  
			              
			FileOutputStream fos=new FileOutputStream("d:\\3111.jpg");  
			fos.write(barr);  
			              
			fos.close();  
			}//end of if  
			System.out.println("Retrieve process is success ");  
			              
			con.close();  
			}catch (Exception e) {
				e.printStackTrace(); 
				}  
			}  

	

}
