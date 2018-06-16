package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import master.dto.Forgot_pasword_Dto;
import master.utilities.Connectionfactory;

public class Forgot_Pasword_Dao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
    String sql1="update register set pasw=?  where userid=?";
	public void updatepasword(Forgot_pasword_Dto dto)
	{
		try{
			Connectionfactory con=new Connectionfactory();
			cn=con.getconnect();
			ps=cn.prepareStatement(sql1);
			ps.setString(1,dto.getPasw());
			ps.setString(2,dto.getUserid());
			ps.executeUpdate();
			cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	/*public boolean checkuserid(String userid){
		 boolean flag=false;
		 String check_userid_sql="select cid from customer_master where cid='"+userid+"'";
		 try{
			 Connectionfactory con=new Connectionfactory();
			 cn=con.getconnect();
			 st=cn.createStatement();
			 rs=st.executeQuery(check_userid_sql);
			 if(rs.next())
			 {
				 flag =true;
			 }
		 }
		 catch(SQLException se){
			 se.printStackTrace();
		 }
		 return flag;
	 }*/
	public String checkanswer(String userid){
		 String answer=null;
		 String check_answer_sql="select answer from register where userid='"+userid+"'";
		 try{
			 Connectionfactory con=new Connectionfactory();
			 cn=con.getconnect();
			 st=cn.createStatement();
			 rs=st.executeQuery(check_answer_sql);
			 if(rs.next())
			 {
				 
				answer=rs.getString(1);
				System.out.println(answer);
			 }
		 }
		 catch(SQLException se){
			 se.printStackTrace();
		 }
		 return answer;
	 }
	
}

