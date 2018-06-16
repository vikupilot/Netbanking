<%@page import="master.dto.CID_ACC_CUSTOMER_DTO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.Dao.AccountDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr><td><label>ACCOUNT NUMBER</label></td>
<td><label>ACCOUNT TYPE</label></td>
<td><label>CUSTOMER ID</label></td>
<td><label>BALANCE</label></td>
<td><label>CUSTOMER NAME</label></td>
<td><label>MOBILE NO</label></td>
<td><label>AGE</label></td>
<td><label>PAN NO</label></td>
<td><label>GENDER</label></td></tr>
<%
   AccountDao da=new AccountDao();
    ArrayList arr=da.CID_VIEWDATA();
    Iterator itr=arr.iterator();
    while(itr.hasNext())
    {   
    	 CID_ACC_CUSTOMER_DTO cadto=(CID_ACC_CUSTOMER_DTO)itr.next();  	 
%>
<tr>
<td><%=cadto.getAcc_number() %></td>
<td><%=cadto.getAcc_type() %></td>
<td><%=cadto.getCid() %></td>
<td><%=cadto.getBalance() %></td>
<td><%=cadto.getCname()%></td>
<td><%=cadto.getCphno() %></td>
<td><%=cadto.getAge() %></td>
<td><%=cadto.getPanno() %></td>
<td><%=cadto.getGender() %></td>
</tr>
<%}%>

</table>
</body>
</html>