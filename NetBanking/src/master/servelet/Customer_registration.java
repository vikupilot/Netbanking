package master.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.Customer_registration_dao;
import master.dto.Customer_reg_Dto;

/**
 * Servlet implementation class Customer_registration
 */
public class Customer_registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    response.setContentType("text/html");
	    PrintWriter out =response.getWriter();
		String userid=request.getParameter("userid");
		String pasw=request.getParameter("pasw");
		String sec_ques=request.getParameter("sec_ques");
		String answer=request.getParameter("answer");
		Customer_reg_Dto cdto=new Customer_reg_Dto();
		cdto.setUserid(userid);
		cdto.setPasw(pasw);
		cdto.setSec_ques(sec_ques);
		cdto.setAnswer(answer);
		Customer_registration_dao da=new  Customer_registration_dao();
		if(da.checkuserid(userid))
		{
			da.insertdata(cdto);
			out.println("registration sucessfull");
		}
		else{
			out.println("invalid user id");
		}
		
	}

}
