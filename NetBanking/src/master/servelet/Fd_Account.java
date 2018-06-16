package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.AccountDao;
import master.Dao.Fd_account_Dao;
import master.dto.Fd_account_Dto;

/**
 * Servlet implementation class Fd_Account
 */
public class Fd_Account extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	 String s_accno=request.getParameter("s_accno");
	 double ammount=Double.parseDouble(request.getParameter("ammount"));
	 int no_year=Integer.parseInt(request.getParameter("no_year"));
	 String book_dt=request.getParameter("book_dt");
	 Fd_account_Dto fdto=new Fd_account_Dto();
	 fdto.setS_accno(s_accno);
	 fdto.setAmmount(ammount);
	 fdto.setNo_year(no_year);
	 fdto.setBook_dt(book_dt);
	 Fd_account_Dao da=new Fd_account_Dao();
		AccountDao adao=new AccountDao();
		if(adao.checkacc_number(s_accno))
		{
			if(adao.checkaballance(s_accno)-ammount>=1000.00)
			{
			     da.insertdata(fdto);
			     response.sendRedirect("Fd_detail.jsp");	
			     }
			else{
				response.sendRedirect("insuficent_ballance.jsp");
			}
		}
		else{
			response.sendRedirect("invalid_account.jsp");
		}	
	}
}
