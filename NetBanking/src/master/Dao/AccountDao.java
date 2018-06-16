package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

import master.dto.AccountDto;
import master.dto.CID_ACC_CUSTOMER_DTO;
import master.utilities.Connectionfactory;

public class AccountDao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
	String sql1="insert into account_master values(?,?,?,?)";
	String sql2="select * from account_master";
	String sql3="update account_master set acc_type=?,cid=?,ballance=? where acc_number=?";
	String sql4="delete from account_master where acc_number=?";
	String sql5="select * from CID_ACCNO_REPORT";
	public void insertdata(AccountDto dto){
	
		try{
		Connectionfactory con= new Connectionfactory();
		cn=con.getconnect();
		ps=cn.prepareStatement(sql1);
		ps.setString(2,dto.getAcc_number());
		ps.setString(1,dto.getAcc_type());
		ps.setString(3,dto.getCid());
		ps.setDouble(4,dto.getBalance());
		ps.executeUpdate();
	     cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}

	}
	
	 public ArrayList getdata()
     {
    	 ArrayList arr =new ArrayList();
    	 try{
    	 Connectionfactory con= new Connectionfactory();
    	 cn=con.getconnect();
    	 st=cn.createStatement();
    	 rs=st.executeQuery(sql2);
    	 while(rs.next())
    	 {
    		AccountDto dto =new AccountDto();
    		    dto.setAcc_number(rs.getString(2));
    			dto.setAcc_type(rs.getString(1));
    			dto.setCid(rs.getString(3));
    			dto.setBalance(rs.getDouble(4));
    			arr.add(dto);	
    	 }
    	 }
    	 catch(SQLException se)
    	 {
    		 
    		 se.printStackTrace();
    	 }
    	 return arr;
    	 
      }
	 public void update(AccountDto dto){
		
		 try{
			 Connectionfactory con=new Connectionfactory();
			 cn=con.getconnect();
			 ps=cn.prepareStatement(sql3);
			 ps.setString(1,dto.getAcc_type());
			 ps.setString(2,dto.getCid());
			 ps.setDouble(3,dto.getBalance());
			 ps.setString(4,dto.getAcc_number());
			 ps.executeUpdate();
			 cn.commit();
			
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 }
		 
	 }
	 public void delete(AccountDto dto){
		 Connectionfactory con =new Connectionfactory();
		 try{
		 cn=con.getconnect();
		 ps=cn.prepareStatement(sql4);
		 ps.setString(1,dto.getAcc_number());
		ps.executeUpdate();
		cn.commit(); 
		 }
		 catch(SQLException se)
		 {
			 se.printStackTrace();
		 } 
	 }
	 public boolean checkacc_number(String acc_number){
		 boolean flag=false;
		 String check_acc_sql="select acc_number from account_master where acc_number='"+acc_number+"'";
		 try{
			 Connectionfactory con=new Connectionfactory();
			 cn=con.getconnect();
			 st=cn.createStatement();
			 rs=st.executeQuery(check_acc_sql);
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
	 public double checkaballance(String acc_number){
	double balance=0.00;
		 String check_bal_sql="select ballance from account_master where acc_number='"+acc_number+"'";
		 try{
			 Connectionfactory con=new Connectionfactory();
			 cn=con.getconnect();
			 st=cn.createStatement();
			 rs=st.executeQuery(check_bal_sql);
			 if(rs.next())
			 {
				balance=rs.getDouble(1);
			 }
		 }
		 catch(SQLException se){
			 se.printStackTrace();
		 }
		 return balance;
	 }
	 public ArrayList CID_VIEWDATA()
     {
    	 ArrayList arr =new ArrayList();
    	 try{
    	 Connectionfactory con= new Connectionfactory();
    	 cn=con.getconnect();
    	 st=cn.createStatement();
    	 rs=st.executeQuery(sql5);
    	 while(rs.next())
    	 {
    	     CID_ACC_CUSTOMER_DTO dto =new CID_ACC_CUSTOMER_DTO();
    		  
    			 dto.setAcc_number(rs.getString(1));
    			 dto.setAcc_type(rs.getString(2));
    			dto.setCid(rs.getString(3));
    			dto.setBalance(rs.getDouble(4));
    			dto.setCname(rs.getString(5));
    			dto.setCphno(rs.getString(6));
    			dto.setAge(rs.getInt(7));
    			dto.setGender(rs.getString(8));
    			dto.setPanno(rs.getString(9));
    			arr.add(dto);	
    	 }
    	 }
    	 catch(SQLException se)
    	 {
    		 
    		 se.printStackTrace();
    	 }
    	 return arr;
    	 
      }
	
	

}


