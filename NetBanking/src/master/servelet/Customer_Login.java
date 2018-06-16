package master.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.Customer_login_dao;
import master.dto.Customer_Login_Dto;
import master.dto.Customer_reg_Dto;

/**
 * Servlet implementation class Customer_Login
 */
public class Customer_Login extends HttpServlet {
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
		Customer_Login_Dto cdto=new Customer_Login_Dto();
		cdto.setUserid(userid);
		cdto.setPasw(pasw);
		Customer_login_dao da=new Customer_login_dao();
		if(da.checkuserid(userid)){
			out.println("hi");
			if(da.checkpasword(pasw)){
		      response.sendRedirect("Userpage.jsp");
			}
		}
		else{
			if(cdto.getUserid().equalsIgnoreCase("admin") && cdto.getPasw().equalsIgnoreCase("admin"))
				out.println("admin page here");	
		}
	}

}
