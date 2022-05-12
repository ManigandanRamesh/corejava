package jdbcconnections;


import java.sql.*;

public class MyClass {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","Kavinmani@123");
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("Select * from employees");
			while(rs.next()) {
				System.out.println(rs.getInt("salary")+"\t"+rs.getString("First_Name"));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
