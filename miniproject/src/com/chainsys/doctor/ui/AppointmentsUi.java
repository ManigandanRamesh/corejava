package com.chainsys.doctor.ui;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.doctor.pojo.Appointment;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.doctor.dao.AppointmentDao;



public class AppointmentsUi {
	public static void AppointmentOption() {
        System.out.println("\n ---Appointments Option---");
        Scanner sc=new Scanner(System.in);
        System.out.println("press 1 for add new appointment");
        System.out.println("press 2 for see the appointment details");
        System.out.println("press 3 for see all appointments detail");
        System.out.println("press 4 for update appointment details");
        System.out.println("press 5 for delete appointment detail");
        try {
            int choice=sc.nextInt();
            switch(choice) {
            case 1:
                addNewAppointments();
                break;
            case 2:
            	viewAppointmentDetails();
                break;
            case 3:
            	ViewAllAppointmentDetails();
                break;
            case 4:
            	updateAppDetails();
                break;
            case 5:
                deleteAppointmentDetails();
                break;
            default:
                System.out.println("enter the number 7 and below");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            try {
                sc.close();
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
            
        }
	
	
	public static void addNewAppointments() {
		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		app.setApp_id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Doctor id:");
		String doc_Id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_Id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setid(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees Amounts:");
		String fees_Amounts= sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_Amounts);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int fees=Integer.parseInt(fees_Amounts);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_Amounts(fees);
		System.out.println("Enter fees collection:");
		String fees_coll = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_coll);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collection(fees_coll);
		int result = AppointmentDao.insertAppointment(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void viewAppointmentDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		Appointment doc = AppointmentDao.getAppointmentsByID(app_id);
		System.out.println("Appointment id:" + doc.getApp_id());
		System.out.println("Appointment date:" + doc.getApp_date());
		System.out.println("Doctor id:" + doc.getid());
		System.out.println("fees Amounts:" + doc.getFees_Amounts());
		System.out.println("fees collection:" + doc.getFees_Collection());
		sc.close();
	}
	public static void ViewAllAppointmentDetails() {
		List<Appointment> applist =AppointmentDao.getAllAppointments();
		Iterator<Appointment> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointment app=appItr.next();
			System.out.println("app id:"+app.getApp_id());
		}
	}
	public static void updateAppDetails() {
		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setApp_id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1); 
		}
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_name);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setid(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_Amounts = sc.nextLine();
		try {
			Validator.checkStringForParseInt(fees_Amounts);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int fees=Integer.parseInt(fees_Amounts);
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_Amounts(fees);
		System.out.println("Enter fees collection:");
		String fees_collection = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_collection);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collection(fees_collection);
		int result = AppointmentDao.updateAppointment(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	public static void deleteAppointmentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = AppointmentDao.deleteAppointment(app_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
}
