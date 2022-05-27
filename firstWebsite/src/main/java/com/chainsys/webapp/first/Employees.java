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
import com.chainsys.miniproject.commonutil.LogManager;
import com.chainsys.miniproject.commonutil.ExceptionManager;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;


/**
 * Servlet implementation class Employees
 */
public class Employees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employees() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee result = empIterator.next();
			out.println("<hr/>");//in emp
		
			out.println(result.getEmp_id() +","  + result.getFirst_name() + "," + result.getLast_name() + ","
					+ result.getEmail() + "," + result.getHire_date() + "," + result.getJob_id() + ","
					+ result.getSalary() + "</p>" );
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("click").equals("ADD_EMP")) {
        PrintWriter out = response.getWriter();
        Employee newemp = null;
        int result = 0;
        int empId = 0;
        String testname = null;
        try {
            newemp = new Employee();
            String id = request.getParameter("id");
            try {
                Validator.checkStringForParseInt(id);
            } catch (InvalidInputDataException e) {
            	testname +=" Error in Employee id input </p>";
				String errorPage=ExceptionManager.handleException(e,id, testname);
				out.print(errorPage);
            }
            empId = Integer.parseInt(id);
            try {
                Validator.CheckNumberForGreaterThanZero(empId);
            } catch (InvalidInputDataException e) {
            	testname +=" Error in Employee id input </p>";
				String errorPage=ExceptionManager.handleException(e, id, testname);
				out.print(errorPage);
            }
            newemp.setEmp_id(empId);
//--------------------------------
            String fname = request.getParameter("fname");
            testname = fname;
            try {
                Validator.checkStringOnly(testname);
            } catch (InvalidInputDataException e) {
            	testname +=" Error in First Name input </p>";
				String errorPage=ExceptionManager.handleException(e, fname, testname);
				out.print(errorPage);
                return;
            }
            try {
                Validator.checklengthOfString(fname);
            } catch (InvalidInputDataException err) {
            	testname +=" Error in First Name input </p>";
				String errorPage=ExceptionManager.handleException(err, fname, testname);
				out.print(errorPage);
            }
            newemp.setFirst_name(fname);
//-----------------------------------
            String lname = request.getParameter("lname");
            testname = fname;
            try {
                Validator.checkStringOnly(testname);
            } catch (InvalidInputDataException e) {
            	testname +=" Error in last Name input </p>";
				String errorPage=ExceptionManager.handleException(e, lname, testname);
				out.print(errorPage);
                return;
            }
            try {
                Validator.checklengthOfString(lname);
            } catch (InvalidInputDataException err) {
            	testname +=" Error in last Name input </p>";
				String errorPage=ExceptionManager.handleException(err, lname, testname);
				out.print(errorPage);
                return;
            }
            newemp.setLast_name(lname);
//----------------------------------            
            String email = request.getParameter("email");
            try {
                Validator.checkEmail(email);
            } catch (InvalidInputDataException e) {
            	testname +=" Error in email input </p>";
				String errorPage=ExceptionManager.handleException(e, email, testname);
				out.print(errorPage);
                return;
            }
            newemp.setEmail(email);
//--------------------------------------            
            SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
            String emp_HireDate = request.getParameter("hdate");
            // Date hire_date=hire_dateFormate.parse(emp_HireDate);

            
            java.util.Date newDate = null;
            try {
                newDate = hire_dateFormate.parse(emp_HireDate);
            } catch (ParseException e) {
            	testname +=" Error in Hire Date input </p>";
				String errorPage=ExceptionManager.handleException(e, emp_HireDate, testname);
				out.print(errorPage);
                return;
            }
            
            newemp.setHire_date(newDate);
//----------------------------------------
            String jobId = request.getParameter("jobid");
            try {
                Validator.checkJobId(jobId);
            } catch (InvalidInputDataException err) {
            	testname +=" Error in Job Id input </p>";
				String errorPage=ExceptionManager.handleException(err, jobId, testname);
				out.print(errorPage);
                return;
            }
            newemp.setJob_id(jobId);
//---------------------------------------            
            String sal = request.getParameter("salary");
            try {
                Validator.checkStringForParseInt(sal);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
            }
            float salParse = Float.parseFloat(sal);
            try {
                Validator.CheckNumberForGreaterThanZero(salParse);
            } catch (InvalidInputDataException err) {
                err.printStackTrace();
                return;
            }
            newemp.setSalary(salParse);
//----------------------------------------------            
            result = EmployeeDao.insertEmployee(newemp);
        } catch (Exception e) {
        	testname +=" Error while inserting record </p>";
			String errorPage=ExceptionManager.handleException(e,testname, testname);
			out.print(errorPage);
            return;
        } finally {
		}
		out.println("<div> Add New Employee: " + result + "</div>");
	} else if (request.getParameter("click").equals("UPDATE_EMP")) {
		doPut(request, response);
	} else if (request.getParameter("click").equals("DELETE_EMP")) {
		doDelete(request, response);
	}
}

protected void doPut(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	Employee newemp = null;
	int result = 0;
	int empId = 0;
//	String testname = null;
	try {
		newemp = new Employee();
		String id = request.getParameter("employee_id");
		try {
			Validator.checkStringForParseInt(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		empId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(empId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newemp.setEmp_id(empId);
//--------------------------------
		String fname = request.getParameter("fname");
		try {
			Validator.checkStringOnly(fname);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			return;
		}
		try {
			Validator.checklengthOfString(fname);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newemp.setFirst_name(fname);
//-----------------------------------
		String lname = request.getParameter("lname");
		try {
			Validator.checkStringOnly(lname);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			return;
		}
		try {
			Validator.checklengthOfString(lname);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		newemp.setLast_name(lname);
//----------------------------------			
		String email = request.getParameter("email");
		try {
			Validator.checkEmail(email);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			return;
		}
		newemp.setEmail(email);
//--------------------------------------			
		SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
		String emp_HireDate = request.getParameter("hdate");
		// Date hire_date=hire_dateFormate.parse(emp_HireDate);

		Date newDate = null;
		try {
			newDate = hire_dateFormate.parse(emp_HireDate);
		} catch (ParseException e) {
			e.printStackTrace();
			return;
		}

		newemp.setHire_date(newDate);
//----------------------------------------
		String jobId = request.getParameter("jobid");
		try {
			Validator.checkJobId(jobId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newemp.setJob_id(jobId);
//---------------------------------------			
		String sal = request.getParameter("salary");
		try {
			Validator.checkStringForParseInt(sal);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		float salParse = Float.parseFloat(sal);
		try {
			Validator.CheckNumberForGreaterThanZero(salParse);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
			return;
		}
		newemp.setSalary(salParse);
//----------------------------------------------			
		result = EmployeeDao.updateEmployee(newemp);
	} catch (Exception e) {
		e.printStackTrace();
		return;
	} finally {
	}
	out.println("<div> Updated Employee detail: " + result + "</div>");
}

protected void doDelete(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
{
	PrintWriter out = response.getWriter();
	String id = null;
	try {
		id = request.getParameter("id");
		Validator.checkStringForParseInt(id);
	} catch (InvalidInputDataException e) {
		e.printStackTrace();
		return;
	}
	int emp_id = Integer.parseInt(id);
	try {
		Validator.CheckNumberForGreaterThanZero(emp_id);
	} catch (InvalidInputDataException e) {
		e.printStackTrace();
		return;
	}
	int result = EmployeeDao.deleteEmployee(emp_id);
	out.println(result + "row deleted");
}
}