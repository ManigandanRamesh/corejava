package com.chainsys.doctor.test;


	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Iterator;
	import java.util.List;

	import com.chainsys.doctor.pojo.Doctor;
	import com.chainsys.doctor.dao.DoctorDao;

	public class TestDoctor {
		
		public static void testGetAllDoctors(){
			List <Doctor> alldoc=DoctorDao.getAllDoctors();
			Iterator<Doctor> docItr=alldoc.iterator();
			while(docItr.hasNext()) {
				Doctor doc=docItr.next();
				System.out.println(doc.getid()+ " "+doc.getname()+" "+doc.getSpeciality());
				//System.out.println("doc.getStandard_fees()");
			}
			
		}
		public static void testGetDoctorById() {
			Doctor doc=DoctorDao.getDoctorById(1100);
			System.out.print(doc.getid()+" "+doc.getname()+" "+doc.getSpeciality());
			//System.out.println("\t"+"Standard fees:"+doc.getStandard_fees());
		}
		public static void testInsertDoctor() {
			Doctor doc=new Doctor();
			doc.setid(4);
			doc.setname("Gokulraj");
			SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				doc.setDob(dobFormate.parse("25/05/2001"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			doc.setSpeciality("ortho");
	    	doc.setcity("Arani");
	    	doc.setPhone(5458769897L);
	    	doc.setStandard_fees(200);
	    	int result=DoctorDao.insertDoctor(doc);
	    	System.out.println(result+"rows inserted");
	    }
		public static void testUpdateDoctor() {
			Doctor doc = new Doctor();
			doc.setid(4);
			doc.setname("chandru");
			SimpleDateFormat dobFormate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				doc.setDob(dobFormate.parse("10/09/1998"));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			doc.setSpeciality("dental");
	    	doc.setcity("Arani");
	    	doc.setPhone(9776547453L);
	    	doc.setStandard_fees(300);
	    	int result=DoctorDao.updateDoctor(doc);
	    	System.out.println(result+"rows updated");
		}
		public static void testdeleteDoctor() {
			int result = DoctorDao.deletedoctor(1);
			System.out.println(result+"row deleted");
		}
		

	}



