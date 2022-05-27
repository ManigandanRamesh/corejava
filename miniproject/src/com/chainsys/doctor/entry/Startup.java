package com.chainsys.doctor.entry;

import com.chainsys.doctor.ui.AppointmentsUi;
import com.chainsys.doctor.ui.DoctorUi;

public class Startup {
	public static void main(String[] args) {
		loadDoctorMenu();
	}

	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=addNewDoctor ,2=updateDoctorName ,3=updateDocDetails ,4=updateStandardFees, 5=deleteDoctordetails, 6=viewAllDoctorDetails, 7=viewDoctorDetails ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUi.addNewDoctor();
				break;
			case 2:
				DoctorUi.updateDoctorName();;
				break;
			case 3:
				DoctorUi.updateDocDetails();
				break;
			case 4:
				DoctorUi.updateStandardFees();
				break;
			case 5:
				DoctorUi.deleteDoctordetails();
				break;
			case 6:
				DoctorUi.ViewAllDoctorDetails();
				break;
			case 7:
				DoctorUi.viewDoctorDetails();

			}
		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println(
				"Enter Method : 1=addNewAppointment ,2=updateAppointment ,3=allAppointment ,4=viewAppointment ,5=deleteAppointment ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentsUi.addNewAppointments();
				break;

			case 2:
				AppointmentsUi.updateAppDetails();
				break;
			case 3:
				AppointmentsUi.ViewAllAppointmentDetails();
				break;
			case 4:
				AppointmentsUi.viewAppointmentDetails();
				break;
			case 5:
				AppointmentsUi.deleteAppointmentDetails();
				break;

			}
		} finally {
			sc.close();
		}
	}

}
