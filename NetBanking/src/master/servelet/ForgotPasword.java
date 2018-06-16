package master.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.Dao.Forgot_Pasword_Dao;
import master.dto.Forgot_pasword_Dto;

/**
 * Servlet implementation class ForgotPasword
 */
public class ForgotPasword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userid=request.getParameter("userid");
		String sec_ques=request.getParameter("sec_ques");
		String answer=request.getParameter("answer");
		String pasw=request.getParameter("npasw");
	     Forgot_pasword_Dto dto=new Forgot_pasword_Dto();
		dto.setUserid(userid);
		dto.setSec_ques(sec_ques);
		dto.setAnswer(answer);
		dto.setPasw(pasw);
		Forgot_Pasword_Dao fda=new Forgot_Pasword_Dao();
		
		if(answer.equals(fda.checkanswer(userid))){
			//out.println("right answer");
		      fda.updatepasword(dto);
		      response.sendRedirect("CustomerLogin_Temp.jsp");
		}
		else{
			response.sendRedirect("Forgot_Pasword.jsp");
			out.println("wrong answer");
		}
		
	}

}
