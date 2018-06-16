package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.CustomerDao;
import master.dto.CustomerDto;

/**
 * Servlet implementation class Customerdelete
 */
public class Customerdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	String cid=request.getParameter("cid");
	CustomerDto dto=new CustomerDto();
	dto.setCid(cid);
	CustomerDao da=new CustomerDao();
	da.delete(dto);
	response.sendRedirect("customerdetail.jsp");
	}

}
