package com.chainsys.miniproject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.webapp.first.Appointments;

public class AppointmentDao {
	private static Connection getConnection() {
		Connection con = null;
		String drivername = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String pwd = "Kavinmani@123";
		try {
			Class.forName(drivername);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static java.sql.Date convertToSqlDate(java.util.Date date) {
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		return sqldate;
	}

	// To insert new row to the table Appointments
	public static int insertAppointment(Appointment newapp) {
		String insertquery = "insert into Appointment (APP_ID,APP_DATE,ID,PATIENT_NAME,FEES_Amounts,FEES_collection) values (?,?,?,?,?,?)";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(insertquery);
			ps.setInt(1, newapp.getApp_id());
			ps.setDate(2, convertToSqlDate(newapp.getApp_date()));
			ps.setInt(3, newapp.getid());
			ps.setString(4, newapp.getPatient_name());
			ps.setFloat(5, newapp.getFees_Amounts());
			ps.setString(6, newapp.getFees_Collection());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

//		For updating all the columns of the table
	public static int updateAppointment(Appointment newapp) {
		String updatequery = "update Appointment set APP_DATE=?,ID=?,PATIENT_NAME=?,FEES_amounts=?,FEES_collection=? where APP_ID=?";
		Connection con = null;
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(updatequery);
			ps.setInt(6, newapp.getApp_id());
			ps.setDate(1, convertToSqlDate(newapp.getApp_date()));
			ps.setInt(2, newapp.getid());
			ps.setString(3, newapp.getPatient_name());
			ps.setFloat(4, newapp.getFees_Amounts());
			ps.setString(5, newapp.getFees_Collection());
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	// To delete a row from the table using id
	public static int deleteAppointment(int id) {
		String deletequery = "delete Appointment where APP_ID=?";
		Connection con = getConnection();
		int rows = 0;
		PreparedStatement ps = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(deletequery);
			ps.setInt(1, id);
			rows = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rows;
	}

	// To retrieve specific Appointments data using app_id
	public static Appointment getAppointmentsByID(int id) {
		Appointment app = null;
		String selectquery = "select APP_ID,APP_DATE,ID,PATIENT_NAME,FEES_Amounts,FEES_collection from Appointment where APP_ID=?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			app = new Appointment();
			while (rs.next()) {
				app.setApp_id(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setApp_date(date);
				app.setid(rs.getInt(3));
				app.setPatient_name(rs.getString(4));
				app.setFees_Amounts(5);
				app.setFees_collection(rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return app;
	}

	// To retrieve all appointments data from the table
	public static List<Appointment> getAllAppointments() {
		List<Appointment> listofAppointments = new ArrayList<Appointment>();
		Appointment app = null;
		String selectquery = "select APP_ID,APP_DATE,ID,PATIENT_NAME,FEES_Amounts,FEES_collection from Appointment";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			ps = con.prepareStatement(selectquery);
			rs = ps.executeQuery();
			while (rs.next()) {
				app = new Appointment();
				app.setApp_id(rs.getInt(1));
				java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
				app.setApp_date(date);
				app.setApp_id(rs.getInt(3));
				app.setPatient_name(rs.getString(4));
				app.setFees_Amounts(5);
				app.setFees_collection(rs.getString(6));
				listofAppointments.add(app);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listofAppointments;
	}
}
