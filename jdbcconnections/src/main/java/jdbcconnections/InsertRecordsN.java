package jdbcconnections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class InsertRecordsN {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");  
		  
		PreparedStatement Np=con.prepareStatement("insert into student values(?,?,?,?)");  
		  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		  
		do{
        System.out.println("enter name:");  
        String name=br.readLine();
		System.out.println("enter city:");  
		String city=br.readLine();  
		System.out.println("enter age:");  
		int age=Integer.parseInt(br.readLine());  
		System.out.println("enter Rollno:");  
		int rollno=Integer.parseInt(br.readLine());  
		  
		Np.setString(1,name);  
		Np.setString(2,city);  
		Np.setInt(3,age);
		Np.setInt(4, rollno);
		int i=Np.executeUpdate();  
		System.out.println(i+" records affected");  
		  
		System.out.println("Do you want to continue: y/n");  
		String s=br.readLine();  
		if(s.startsWith("n")){  
		break;  
		}  
		}while(true);  
		  
		con.close();  
		}
	  

	}


