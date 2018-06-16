package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master.dto.CID_ACC_CUSTOMER_DTO;
import master.dto.Fd_Report_Dto;
import master.dto.Fd_account_Dto;
import master.utilities.Connectionfactory;

public class Fd_account_Dao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
    String sql1="insert into fd_master values(fd_id_seq.nextval,?,?,?,?)";
    String sql2="Select * from fd_master";
    String sql5="select * from fd_report";
    public void insertdata(Fd_account_Dto dto){
    	try{Connectionfactory con=new Connectionfactory();
    	cn=con.getconnect();
    	ps=cn.prepareStatement(sql1);
    	ps.setDouble(1,dto.getAmmount());
    	ps.setString(2,dto.getS_accno());
    	ps.setInt(3,dto.getNo_year());
    	ps.setString(4,dto.getBook_dt());
        ps.executeUpdate();
        cn.commit();
    	}
    	catch(SQLException se)
    	{
    		se.printStackTrace();
    	}
    }
    public ArrayList getdata(){
    	ArrayList arr =new ArrayList();
    	
    	try{
    		Connectionfactory con=new Connectionfactory();
    		cn=con.getconnect();
    		st=cn.createStatement();
    		rs=st.executeQuery(sql2);
    		while(rs.next()){
    			Fd_account_Dto fdto=new Fd_account_Dto();
    			fdto.setFd_id(rs.getInt(1));
    			fdto.setAmmount(rs.getDouble(2));
    			fdto.setS_accno(rs.getString(3));
    			fdto.setNo_year(rs.getInt(4));
    			fdto.setBook_dt(rs.getString(5));
    		arr.add(fdto);
    		}
    	}catch(SQLException se){
    		se.printStackTrace();
    	}
    	return arr;
    }
    public ArrayList Fd_Report_View()
    {
   	 ArrayList arr =new ArrayList();
   	 try{
   	 Connectionfactory con= new Connectionfactory();
   	 cn=con.getconnect();
   	 st=cn.createStatement();
   	 rs=st.executeQuery(sql5);
   	 while(rs.next())
   	 {
   	    Fd_Report_Dto dto =new Fd_Report_Dto();
   		  
   			 dto.setAcc_number(rs.getString(1));
   			 dto.setCid(rs.getString(2));
   			dto.setCname(rs.getString(3));
   			dto.setFd_id(rs.getInt(4));
   			dto.setAmmount(rs.getDouble(5));
   		    dto.setNo_year(rs.getInt(6));
   			dto.setBook_dt(rs.getString(7));
   			arr.add(dto);	
   	 }
   	 }
   	 catch(SQLException se)
   	 {
   		 
   		 se.printStackTrace();
   	 }
   	 return arr;
   	 
     }
    
    public ArrayList get_Fd_Search(String cid) 
 	{
 	  String sql5="select acc_number,cid,cname,fd_id,ammount,no_of_year,book_dt from fd_report where cid='"+cid+"'";
 		ArrayList arr =new ArrayList();
 		try
 		{
 			Connectionfactory con = new Connectionfactory();
 			cn=con.getconnect();
 			ps=cn.prepareStatement(sql5);
 			ResultSet rs=ps.executeQuery();
 			while(rs.next())
 			{
 				Fd_Report_Dto dto =new Fd_Report_Dto();
 		
 	   			dto.setAcc_number(rs.getString(1));
 	   			dto.setCid(rs.getString(2));
 	   			dto.setCname(rs.getString(3));
 	   			dto.setFd_id(rs.getInt(4));
 	   			dto.setAmmount(rs.getDouble(5));
 	   		    dto.setNo_year(rs.getInt(6));
 	   			dto.setBook_dt(rs.getString(7));
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
