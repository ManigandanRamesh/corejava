package com.chainsys.doctor.pojo;


	import java.util.Date;

	public class Appointment {
		private int app_id; 
		private Date app_date; 
		private int id; 
		private String patient_name; 
		private int fees_Amounts; 
		private String fees_collection; 
		
		public int getApp_id() {
			return app_id;
		}
		public void setApp_id(int app_id) {
			this.app_id = app_id;
		}
		public Date getApp_date() {
			return app_date;
		}
		public void setApp_date(Date app_date) {
			this.app_date = app_date;
		}
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getPatient_name() {
			return patient_name;
		}
		public void setPatient_name(String patient_name) {
			this.patient_name = patient_name;
		}
		public float getFees_Amounts() {
			return fees_Amounts;
		}
		public void setFees_Amounts(int fees_Amounts) {
			this.fees_Amounts= fees_Amounts;
		}
		public String getFees_Collection() {
			return fees_collection;
		}
		public void setFees_collection(String i) {
			this.fees_collection  = i;
		}
		
		 		
				}
		
			
		
		

	

