package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import master.Dao.CustomerDao;
import master.dto.CustomerDto;

/**
 * Servlet implementation class CustomerAddServe
 */
public class CustomerAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid =request.getParameter("cid");
		String cname =request.getParameter("cname");
		String cphno =request.getParameter("cphno");
		String cemail=request.getParameter("cemail");
		String houseno =request.getParameter("houseno");
		String strno=request.getParameter("strno");
		String pincode =request.getParameter("pincode");
		int age =Integer.parseInt(request.getParameter("age"));
		String panno =request.getParameter("panno");
		String ocupation =request.getParameter("ocupation");
		String gender =request.getParameter("gender");
		CustomerDto dto=new CustomerDto();
		dto.setCid(cid);
		dto.setCname(cname);
		dto.setCphno(cphno);
		dto.setCemail(cemail);
		dto.setHouseno(houseno);
		dto.setStrno(strno);
		dto.setPincode(pincode);
		dto.setAge(age);
		dto.setPanno(panno);
		dto.setOcupation(ocupation);
		dto.setGender(gender);
		CustomerDao da=new CustomerDao();
		da.insertdata(dto);
		response.sendRedirect("customerdetail.jsp");
		
	}

}
