<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.dto.AccountDto"%>
<%@page import="master.Dao.AccountDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Export</title>
<%
    response.setContentType("application/vnd.ms-excel");
    response.setHeader("Content-disposition","attachment;filename=AccountReport.xls");
    %>
</head>
<body>
<table border="2">
<tr><td><label>ACCOUNT NUMBER</label></td>
<td><label>ACCOUNT TYPE</label></td>
<td><label>CUSTOMER ID</label></td>
<td><label>BALANCE</label></td>
<%
AccountDao ado=new AccountDao();
ArrayList arr=ado.getdata();
Iterator itr=arr.iterator();
while(itr.hasNext())
{     AccountDto adto=(AccountDto)itr.next();
System.out.println(adto.getAcc_type());

%>
<tr>
<td><%=adto.getAcc_number() %></td>
<td><%=adto.getAcc_type()%></td>
<td><%=adto.getCid()%></td>
<td><%=adto.getBalance()%></td>
</tr>
<%} %>
</table>
</body>
</html>