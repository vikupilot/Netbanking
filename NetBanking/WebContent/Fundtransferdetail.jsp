<%@page import="master.dto.FundTransferDto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.Dao.FundTransferDao"%>
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
<td>TRANSCTION ID</td>
<td>SOURCE ACC NUMBER</td>
<td>BENIFECIERY ACC NUMBER</td>
<td>AMOUNT</td>
<td>DATE OF TRANSCTION</td>
</tr>
<%
FundTransferDao ado=new FundTransferDao();
ArrayList arr=ado.getdata();
Iterator itr=arr.iterator();
while(itr.hasNext())
{        FundTransferDto fdto=(FundTransferDto)itr.next();

%>
<tr><td><%=fdto.getTrans_id()%></td>
<td><%=fdto.getS_accno() %></td>
<td><%=fdto.getB_accno() %></td>
<td><%=fdto.getAmount() %></td>
<td><%=fdto.getTransdt() %></td>
</tr>
<%}%>
</table>
</body>
</html>