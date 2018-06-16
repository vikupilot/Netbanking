package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.AccountDao;
import master.dto.AccountDto;

/**
 * Servlet implementation class Accountdelete
 */
public class Accountdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String acc_number=request.getParameter("acc_number");
		AccountDto dto=new AccountDto();
		dto.setAcc_number(acc_number);
		AccountDao da=new AccountDao();
		da.delete(dto);
		response.sendRedirect("accountdetail.jsp");
	      
	}

}
