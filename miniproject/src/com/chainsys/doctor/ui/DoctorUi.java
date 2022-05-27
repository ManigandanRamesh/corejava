package com.chainsys.doctor.ui;
import com.chainsys.doctor.pojo.Doctor;
import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



import com.chainsys.doctor.dao.DoctorDao;

public class DoctorUi {
	

	public static void addNewDoctor() {

		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int doctor_id=Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setid(doctor_id);
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setname(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setSpeciality(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setcity(city);
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setPhone(Long.parseLong(phone));
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		try {
			Validator.CheckNumberForGreaterThanZero(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setStandard_fees(std_fees);
		int result = DoctorDao.insertDoctor(doc);
		System.out.println(result + "row inserted");
		sc.close();
	}

	public static void viewDoctorDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Doctor id:");
		int doc_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		Doctor doc = DoctorDao.getDoctorById(doc_id);
		System.out.println("Doctor id:" + doc.getid());
		System.out.println("Doctor Name:" + doc.getname());
		System.out.println("Date of birth:" + doc.getDob());
		System.out.println("Speciality:" + doc.getSpeciality());
		System.out.println("phone number:" + doc.getPhone());
		System.out.println("Standard fees:" + doc.getStandard_fees());
		sc.close();
	}
	public static void ViewAllDoctorDetails() {
		List<Doctor> doclist =DoctorDao.getAllDoctors();
		Iterator<Doctor> docItr=doclist.iterator();
		while(docItr.hasNext()) {
			Doctor doc=docItr.next();
			System.out.println("doc id:"+doc.getid());
		}
	}
	public static void updateDocDetails() {
		Scanner sc = new Scanner(System.in);
		Doctor doc = new Doctor();
		System.out.println("Enter the Doctor id:");
		String doc_id = sc.nextLine();
		try {
			Validator.checkStringForParseInt(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int doctor_id=Integer.parseInt(doc_id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setid(doctor_id);
		System.out.println("Enter Doctor name:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setname(doc_name);
		System.out.println("Enter Doctor Date of birth like \"dd/mm/yyyy\":");
		SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
		String Dob = sc.nextLine();
		try {
			doc.setDob(dobFormate.parse(Dob));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter the Speciality:");
		String speciality = sc.nextLine();
		try {
			Validator.checkStringOnly(speciality);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setSpeciality(speciality);
		System.out.println("Enter city:");
		String city = sc.nextLine();
		try {
			Validator.checkStringOnly(city);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setcity(city);
		System.out.println("Enter phone number:");
		String phone = sc.nextLine();
		try {
			Validator.checkPhone(phone);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setPhone(Long.parseLong(phone));
		System.out.println("Enter Standard fees:");
		Float std_fees = sc.nextFloat();
		try {
			Validator.CheckNumberForGreaterThanZero(std_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		doc.setStandard_fees(std_fees);
		int result = DoctorDao.updateDoctor(doc);
		System.out.println(result + "row updated");
		sc.close();
	}
	public static void deleteDoctordetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int result = DoctorDao.deletedoctor(doc_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updateDoctorName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Name:");
		String doc_name=sc.nextLine();
		try {
			Validator.checkStringOnly(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);	
		}
		int result=DoctorDao.updateDoctorName(doc_id,doc_name);
		System.out.println(result+" row updated");
		sc.close();
	}
	public static void updateStandardFees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Doctor Salary:");
		float doc_salary=sc.nextFloat();
		System.out.println("Enter Doctor id:");
		int doc_id=sc.nextInt();
		int result=DoctorDao.updateStandardFees(doc_id,doc_salary);
		System.out.println(result+" row updated");
		sc.close();
	}


}
