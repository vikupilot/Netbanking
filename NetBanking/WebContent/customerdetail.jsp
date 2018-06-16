<%@page import="master.dto.CustomerDto"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.Dao.CustomerDao"%>
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
<tr><td><label>CUSTOMER ID</label></td>
<td><label>CUSTOMER NAME</label></td>
<td><label>MOBILE NO</label></td>
<td><label>CUSTOMER EMAIL</label></td>
<td><label>HOUSE NO</label></td>
<td><label>STREAT NO</label></td>
<td><label>PINCODE</label></td>
<td><label>AGE</label></td>
<td><label>PAN NO</label></td>
<td><label>OCCUPATION</label></td>
<td><label>GENDER</label></td></tr>
</tr>
<%
CustomerDao da=new CustomerDao();
 ArrayList results=da.getdata();
 Iterator itr=results.iterator();
 while(itr.hasNext())
 {    CustomerDto ldto=(CustomerDto)itr.next();

%>
<tr>
<td><%=ldto.getCid() %></td>
<td><%=ldto.getCname()%></td>
<td><%=ldto.getCphno()%></td>
<td><%=ldto.getCemail()%></td>
<td><%=ldto.getHouseno()%></td>
<td><%=ldto.getStrno()%></td>
<td><%=ldto.getPincode()%></td>
<td><%=ldto.getAge()%></td>
<td><%=ldto.getPanno()%></td>
<td><%=ldto.getOcupation()%></td>
<td><%=ldto.getGender()%></td>
</tr>
<%} %>
</table>
</body>
</html>