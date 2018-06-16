package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.Rd_account_dao;
import master.dto.Rd_account_dto;

/**
 * Servlet implementation class Rd_account
 */
public class Rd_account extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		double amount=Double.parseDouble(request.getParameter("amount"));
		String acc_number=request.getParameter("acc_number");
		int no_month=Integer.parseInt(request.getParameter("no_month"));
		String book_dt=request.getParameter("book_dt");
		Rd_account_dto rdto=new Rd_account_dto();
		rdto.setAmount(amount);
		rdto.setAcc_number(acc_number);
		rdto.setNo_month(no_month);
		rdto.setBook_dt(book_dt);
		Rd_account_dao da=new Rd_account_dao();
		da.insertdata(rdto);
		response.sendRedirect("rd_accountdetail.jsp");
		
	}

}
