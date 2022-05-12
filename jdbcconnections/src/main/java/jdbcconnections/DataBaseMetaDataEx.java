package jdbcconnections;

import java.sql.*;

public class DataBaseMetaDataEx {

	public static void main(String[] args) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Kavinmani@123");
		DatabaseMetaData dbmd=con.getMetaData();
		
		System.out.println("Driver Name:"+dbmd.getDriverName());
		System.out.println("Driver Version:" +dbmd.getDriverVersion());
		System.out.println("UserName:" +dbmd.getUserName());
		System.out.println("Database Product Name: " +dbmd.getDatabaseProductName());
		System.out.println("Database Product Version: " +dbmd.getDriverVersion());
		
		con.close();
	} catch (Exception e)
	{
		System.out.println(e);
	}
		

	}
}


