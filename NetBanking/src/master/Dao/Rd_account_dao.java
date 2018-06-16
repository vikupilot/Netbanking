package master.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master.dto.Rd_account_dto;
import master.utilities.Connectionfactory;

public class Rd_account_dao {
	Connection cn=null;
	PreparedStatement ps=null;
	Statement st=null;
	ResultSet rs=null;
	String sql1="insert into rd_master values(rd_id_seq.nextval,?,?,?,?)";
	String sql2="select * from rd_master";
	public void insertdata( Rd_account_dto rdto)
	{
		try{
			Connectionfactory con=new Connectionfactory();
			cn=con.getconnect();
			ps=cn.prepareStatement(sql1);
			ps.setDouble(1,rdto.getAmount());
			ps.setString(2,rdto.getAcc_number());
			ps.setInt(3,rdto.getNo_month());
			ps.setString(4,rdto.getBook_dt());
			ps.executeUpdate();
			cn.commit();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
			
		}
	public ArrayList getdata(){
	ArrayList arr=new ArrayList();
	try{
		Connectionfactory con=new Connectionfactory();
		cn=con.getconnect();
		st=cn.createStatement();
		rs=st.executeQuery(sql2);
		
		while(rs.next())
		{   Rd_account_dto dto=new Rd_account_dto();
		dto.setRd_id(rs.getInt(1));
		dto.setAmount(rs.getDouble(2));
		dto.setAcc_number(rs.getString(3));
		dto.setNo_month(rs.getInt(4));
		dto.setBook_dt(rs.getString(5));            
		arr.add(dto);			
		}
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	return arr;
	
		
	}	
	

}


