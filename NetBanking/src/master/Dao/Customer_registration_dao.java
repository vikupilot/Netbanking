package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import master.dto.Customer_reg_Dto;
import master.utilities.Connectionfactory;

public class Customer_registration_dao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
	String sql1="insert into register values(?,?,?,?)";
	public void insertdata(Customer_reg_Dto dto)
	{
		try{
			Connectionfactory con=new Connectionfactory();
			cn=con.getconnect();
			ps=cn.prepareStatement(sql1);
			ps.setString(1,dto.getUserid());
			ps.setString(2,dto.getPasw());
			ps.setString(3,dto.getSec_ques());
			ps.setString(4,dto.getAnswer());
			ps.executeUpdate();
			cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public boolean checkuserid(String userid){
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
	 }
	
}
