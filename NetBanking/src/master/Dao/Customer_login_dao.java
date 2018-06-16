package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import master.utilities.Connectionfactory;

public class Customer_login_dao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
    ResultSet rs=null;

	public boolean checkuserid(String userid){
		 boolean flag=false;
		 String check_userid_sql="select userid from register where userid='"+userid+"'";
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
	public boolean checkpasword(String pasw){
		 boolean flag=false;
		 String check_pasw_sql="select pasw from register where pasw='"+pasw+"'";
		 try{
			 Connectionfactory con=new Connectionfactory();
			 cn=con.getconnect();
			 st=cn.createStatement();
			 rs=st.executeQuery(check_pasw_sql);
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
