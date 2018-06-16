package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master.dto.CID_ACC_CUSTOMER_DTO;
import master.dto.CustomerDto;
import master.utilities.Connectionfactory;

public class CustomerDao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
	String sql1 ="insert into customer_master values(?,?,?,?,?,?,?,?,?,?,?)";
	String sql2 ="select * from customer_master";
	String sql3="delete from customer_master where cid=?";
	String sql4="update customer_master set cname=?,cphno=?,cemail=?,houseno=?,streatno=?,pincode=?,age=?,panno=?,ocupation=?,gender=? where cid=?";
	
	public void insertdata(CustomerDto dto){
		try{
		Connectionfactory con= new Connectionfactory();
		cn=con.getconnect();
		ps=cn.prepareStatement(sql1);
		ps.setString(1,dto.getCid());
		ps.setString(2,dto.getCname());
		ps.setString(3,dto.getCphno());
		ps.setString(4,dto.getCemail());
		ps.setString(5,dto.getHouseno());
		ps.setString(6,dto.getStrno());
		ps.setString(7,dto.getPincode());
		ps.setInt(8,dto.getAge());
		ps.setString(9,dto.getPanno());
		ps.setString(10,dto.getOcupation());
		ps.setString(11,dto.getGender());
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
    		 CustomerDto dto=new CustomerDto();
    		    dto.setCid(rs.getString(1));
    			dto.setCname(rs.getString(2));
    			dto.setCphno(rs.getString(3));
    			dto.setCemail(rs.getString(4));
    			dto.setHouseno(rs.getString(5));
    			dto.setStrno(rs.getString(6));
    			dto.setPincode(rs.getString(7));
    			dto.setAge(rs.getInt(8));
    			dto.setPanno(rs.getString(9));
    			dto.setOcupation(rs.getString(10));
    			dto.setGender(rs.getString(11));
    			arr.add(dto);
    		 
    	 }
    	 }
    	 catch(SQLException se)
    	 {
    		 
    		 se.printStackTrace();
    	 }
    	 return arr;
    	 
      }
     public void delete(CustomerDto dto){
    	 try{
    			Connectionfactory con= new Connectionfactory();
    			cn=con.getconnect(); 
    			ps=cn.prepareStatement(sql3);
    			ps.setString(1,dto.getCid());
    			ps.executeUpdate();
                cn.commit();
     }
    	 catch(SQLException se)
    	 { 
    		 se.printStackTrace();
    		 }
    	 }
     public void update(CustomerDto dto){
    	 try{
 			Connectionfactory con= new Connectionfactory();
 			cn=con.getconnect(); 
 			ps=cn.prepareStatement(sql4);
 			ps.setString(1,dto.getCname());
 			ps.setString(2,dto.getCphno());
 			ps.setString(3,dto.getCemail());
 			ps.setString(4,dto.getHouseno());
 			ps.setString(5,dto.getStrno());
 			ps.setString(6,dto.getPincode());
 			ps.setInt(7,dto.getAge());
 			ps.setString(8,dto.getPanno());
 			ps.setString(9,dto.getOcupation());
 			ps.setString(10,dto.getGender());
 			ps.setString(11,dto.getCid());
 			ps.executeUpdate();
            cn.commit();
  }
 	 catch(SQLException se)
 	 { 
 		 se.printStackTrace();
 		 }
     }
     
     
     public ArrayList get_cid_Details(String cid) 
 	{
 	  String sql5="select acc_number,ballance from cid_accno_report where cid='"+cid+"'";
 		ArrayList arr =new ArrayList();
 		try
 		{
 			Connectionfactory con = new Connectionfactory();
 			cn=con.getconnect();
 			ps=cn.prepareStatement(sql5);
 			ResultSet rs=ps.executeQuery();
 			while(rs.next())
 			{
 				CID_ACC_CUSTOMER_DTO accdto=new CID_ACC_CUSTOMER_DTO();
 				accdto.setAcc_number(rs.getString(1));
 				accdto.setBalance(rs.getDouble(2));
 			     arr.add(accdto);
 			}
 			
 		}
 		catch(SQLException se)
 		{
 			se.printStackTrace();
 		}
 		return arr;
 		
 	}  
     
     

}
