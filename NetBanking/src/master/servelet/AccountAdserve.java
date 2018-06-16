package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.AccountDao;
import master.dto.AccountDto;

/**
 * Servlet implementation class AccountAdserve
 */
public class AccountAdserve extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  response.setContentType("text/html");
	  String acc_number=request.getParameter("acc_number");
	  String acc_type=request.getParameter("acc_type");
	  String cid=request.getParameter("cid");
	  double balance=Double.parseDouble(request.getParameter("balance"));
	  AccountDto dto =new AccountDto();
	  dto.setAcc_number(acc_number);
	  dto.setAcc_type(acc_type);
	  dto.setCid(cid);
	  dto.setBalance(balance);
	  AccountDao da =new AccountDao();
	  da.insertdata(dto);
	  response.sendRedirect("accountdetail.jsp");
	 
	}

}
