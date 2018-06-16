package master.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.AccountDao;
import master.Dao.FundTransferDao;
import master.dto.FundTransferDto;

import org.apache.catalina.connector.Request;

/**
 * Servlet implementation class FundTransfer
 */
public class FundTransfer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String s_accno=request.getParameter("s_accno");
		String b_accno=request.getParameter("b_accno");
		double amount=Double.parseDouble(request.getParameter("amount"));
		String transdt=request.getParameter("transdt");
		FundTransferDto fdto=new FundTransferDto();
		fdto.setS_accno(s_accno);
		fdto.setB_accno(b_accno);
		fdto.setAmount(amount);
		fdto.setTransdt(transdt);
		FundTransferDao da=new FundTransferDao();
		AccountDao adao=new AccountDao();
		if(adao.checkacc_number(s_accno) && adao.checkacc_number(b_accno))
		{
			if(adao.checkaballance(s_accno)-amount>=1000.00){
			     da.insertdata(fdto);
			    response.sendRedirect("Fundtransferdetail.jsp");
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
