package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

/**
 * Servlet implementation class Doctor
 */
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Doctor> list = DoctorDao.getAllDoctors();
		Iterator<Doctor> docItr = list.iterator();
		while (docItr.hasNext()) {
			Doctor doc = docItr.next();
			out.println("</hr>");
			out.println("doc id:" + doc.getid() + "," + "Doc_Name:" + doc.getname() + "," + "Doc_Dob:" + doc.getDob()
					+ "," + "doc_City:" + doc.getcity() + "," + "Doc_Speciality:" + doc.getSpeciality() + "</p>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//doGet(request, response);
		if(request.getParameter("click").equals("ADDDOC"))
		{
		 PrintWriter out = response.getWriter();
	        Doctor newdoc = null;
	        int result = 0;
	        int Id = 0;
	        String testname = null;
	        try {
	            newdoc = new Doctor();
	            String id = request.getParameter("id");
	            try {
	                Validator.checkStringForParseInt(id);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	            }
	           Id = Integer.parseInt(id);
	            try {
	                Validator.CheckNumberForGreaterThanZero(Id);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setid(Id);
//------------------------------------------------
	            String Name = request.getParameter("dname");
	            testname = Name;
	            try {
	                Validator.checkStringOnly(testname);
	            } catch (InvalidInputDataException e) {
	                e.printStackTrace();
	                return;
	            }
	            try {
	                Validator.checklengthOfString(Name);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	            }
	            newdoc.setname(Name);
//--------------------------------------------------
	            SimpleDateFormat DOB = new SimpleDateFormat("dd/MM/yyyy");
	            String doctor_Date = request.getParameter("doctorDob");
	            // Date hire_date=hire_dateFormate.parse(emp_HireDate);

	            
	            java.util.Date newDate = null;
	            try {
	                newDate = DOB.parse(doctor_Date);
	            } catch (ParseException e) {
	                e.printStackTrace();
	                return;
	            }
	            
	            newdoc.setDob(newDate);
//---------------------------------------------------	            
	           String Speciality = request.getParameter("Speciality");
	           testname= Speciality;
	           try {
	        	   Validator.checkStringOnly(testname);
	           }catch (InvalidInputDataException e) {
	                e.printStackTrace();
	                return;
	            }
	            try {
	                Validator.checklengthOfString(Speciality);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	            }
	            newdoc.setSpeciality(Speciality);
//-------------------------------------------------------	        	   
	           String city = request.getParameter("City");
	           testname = city;
	           try {
	        	   Validator.checkStringOnly(testname);
	           }catch (InvalidInputDataException e) {
	                e.printStackTrace();
	                return;
	            }
	            try {
	                Validator.checklengthOfString(city);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	            }
	            newdoc.setcity(city);
//---------------------------------------------------------
	            String Phone_No = request.getParameter("Phone_No");
	            testname = Phone_No;
	            try {
	            	Validator.checkPhone(Phone_No);
	            }catch (InvalidInputDataException e) {
	                e.printStackTrace();
	                return;
	            }
	            newdoc.setPhone(Long.parseLong(Phone_No));
//------------------------------------------------------------
	            String fees = request.getParameter("Doctor Fees");
	            try {
	                Validator.checkStringForParseInt(fees);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	            }
	            float feesParse = Float.parseFloat(fees);
	            try {
	                Validator.CheckNumberForGreaterThanZero(feesParse);
	            } catch (InvalidInputDataException err) {
	                err.printStackTrace();
	                return;
	            }
	            newdoc.setStandard_fees(feesParse);
	//----------------------------------------------            
	            result = DoctorDao.insertDoctor(newdoc);
	        } catch (Exception e) {
	            e.printStackTrace();
	            return;
	        } finally {
	        }
	        out.println("<div> Add New Doctor: "+result+"</div>");
	    }else if (request.getParameter("click").equals("UPDATE_DOC")) {
			doPut(request, response);
		} else if (request.getParameter("click").equals("DELETE_DOC")) {
			doDelete(request, response);
	}
	}
	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
        Doctor newdoc = null;
        int result = 0;
        int docId = 0;
        String testname = null;
        try
        {
        	newdoc = new Doctor();
            String id = request.getParameter("id");
            try
            {
                Validator.checkStringForParseInt(id);
            } catch (InvalidInputDataException err) 
            {
                err.printStackTrace();
                return;
            }
            docId = Integer.parseInt(id);
            try 
            {
                Validator.CheckNumberForGreaterThanZero(docId);
            } catch (InvalidInputDataException err) 
            {
                err.printStackTrace();
                return;
            }
            newdoc.setid(docId);
//--------------------------------
            String name = request.getParameter("dname");
            testname = name;
            try 
            {
                Validator.checkStringOnly(testname);
            } catch (InvalidInputDataException e)
            {
                e.printStackTrace();
                return;
            }
            try
            {
                Validator.checklengthOfString(testname);
            } catch (InvalidInputDataException err)
            {
                err.printStackTrace();
                return;
            }
            newdoc.setname(name);
//-----------------------------------           
            SimpleDateFormat doc_dobFormate = new SimpleDateFormat("dd/MM/yyyy");
            String doc_Dob = request.getParameter("Doctordob");
            Date newDate = null;
            try 
            {
                newDate = doc_dobFormate.parse(doc_Dob);
            } catch (ParseException e)
            {
                e.printStackTrace();
                return;
            }
            
            newdoc.setDob(newDate);
//----------------------------------------
            String speciality = request.getParameter("speciality");
            testname = speciality;
            try
            {
                Validator.checkStringOnly(testname);
            } catch (InvalidInputDataException e) 
            {
                e.printStackTrace();
                return;
            }
            try
            {
                Validator.checklengthOfString(speciality);
            } catch (InvalidInputDataException err) 
            {
                err.printStackTrace();
                return;
            }
            newdoc.setSpeciality(speciality);
//---------------------------------------
            String city = request.getParameter("city");
            testname = city;
            try
            {
                Validator.checkStringOnly(testname);
            } catch (InvalidInputDataException e) 
            {
                e.printStackTrace();
                return;
            }
            try
            {
                Validator.checklengthOfString(testname);
            } catch (InvalidInputDataException err) 
            {
                err.printStackTrace();
                return;
            }
            newdoc.setcity(city);       
//---------------------------------------
            String phoneno =request.getParameter("phoneno");
    	
    		try 
    		{
    			Validator.checkPhone(phoneno);
    		} catch (InvalidInputDataException e) 
    		{
    			e.printStackTrace();
    			return;
    		}
    		newdoc.setPhone(Long.parseLong(phoneno));
//---------------------------------------            
            String std_fees = request.getParameter("Doctorfees");
            try
            {
                Validator.checkStringForParseInt(std_fees);
            } catch (InvalidInputDataException err)
            {
                err.printStackTrace();
                return;
            }
            float feesParse = Float.parseFloat(std_fees);
            try 
            {
                Validator.CheckNumberForGreaterThanZero(feesParse);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newdoc.setStandard_fees(feesParse);
//----------------------------------------------            
            result = DoctorDao.updateDoctor(newdoc);
            System.out.println();
            } catch (Exception e) 
        {
            e.printStackTrace();
            return;
        } 
        out.println("<div> update doctor: " + result + "</div>");
        
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String id = null;
		try {
			id = request.getParameter("id");
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException e) 
		{
			e.printStackTrace();
			return;
		}
		int doc_id = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(doc_id);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
		    return;
		}
		int result =DoctorDao.deletedoctor(doc_id);
		out.println(result + "row deleted");
		
	}

}



