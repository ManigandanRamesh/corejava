package com.chainsys.miniproject.pojo;


import java.util.Date;
	public class Doctor {
		private int id ;
		private String name; 
		private Date dob ; 
		private String speciality ;
		private String city; 
		private long phone_no; 
		private float Standard_fees; 
		
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name = name;
		}
		public Date getDob() {
			return dob;
		}
		public void setDob(Date dob) {
			this.dob = dob;
		}
		public String getSpeciality() {
			return speciality;
		}
		public void setSpeciality(String speciality) {
			this.speciality = speciality;
		}
		public String getcity() {
			return city;
		}
		public void setcity(String city) {
			this.city = city;
		}
		public long getPhone() {
			return phone_no;
		}
		public void setPhone(long phone) {
			this.phone_no = phone_no;
		}
		public float getStandard_fees() {
			return Standard_fees;
		}
		public void setStandard_fees(float standard_fees) {
			Standard_fees = standard_fees;
		}
		

	}


