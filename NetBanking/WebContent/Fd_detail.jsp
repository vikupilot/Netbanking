<%@page import="master.dto.Fd_account_Dto"%>
<%@page import="java.util.Iterator"%>
<%@page import="master.Dao.Fd_account_Dao"%>
<%@page import="java.util.ArrayList"%>
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
<tr>
<td><label>FIX DEPOSIT ACCOUNT</label></td>
<td><label>AMMOUNT</label></td>
<td><label>SAVING ACCOUNT NUMBER</label></td>
<td><label>NUMBER OF YEAR</label></td>
<td><label>DATE OF TRANSCTION</label></td>
</tr>
<%
Fd_account_Dao da = new Fd_account_Dao();

ArrayList arr =da.getdata();
Iterator itr=arr.iterator();
while(itr.hasNext()){
	Fd_account_Dto dto=(Fd_account_Dto)itr.next();

%><tr>
<td><%=dto.getFd_id() %></td>
<td><%=dto.getAmmount() %></td>
<td><%=dto.getS_accno() %></td>
<td><%=dto.getNo_year() %></tr>
<td><%=dto.getBook_dt() %></td>
</tr>
<%} %>
</table>

</body>
</html>