package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master.dto.FundTransferDto;
import master.utilities.Connectionfactory;

public class FundTransferDao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
	String sql1="insert into transid_auto values(transid_seq.nextval,?,?,?,?)";
	String sql2="select * from transid_auto";
 public void insertdata(FundTransferDto dto)
 {   
	 
	 
	 try{
	 Connectionfactory con=new Connectionfactory();
	 cn=con.getconnect();
     ps=cn.prepareStatement(sql1);
     ps.setString(1,dto.getS_accno());
     ps.setString(2,dto.getB_accno());
     ps.setDouble(3,dto.getAmount());
     ps.setString(4,dto.getTransdt());
     ps.executeUpdate();
     cn.commit();
     
	 }
	 catch(SQLException se){
		 se.printStackTrace();
	 }
     
	 
 }
 public ArrayList getdata()
 {     ArrayList arr =new ArrayList();
	 try{
		 Connectionfactory con=new Connectionfactory();
		 cn=con.getconnect();
		 st=cn.createStatement();
		 rs=st.executeQuery(sql2);
		 while(rs.next())
		 {
			FundTransferDto dto=new FundTransferDto();
			dto.setTrans_id(rs.getInt(1));
			dto.setS_accno(rs.getString(2));
			dto.setB_accno(rs.getString(3));
			dto.setAmount(rs.getDouble(4));
			dto.setTransdt(rs.getString(5));
			arr.add(dto);
		 }
		 
	 }catch(SQLException se){
		 se.printStackTrace();
	 }
	 return arr;
	 
 }
}
