<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="master.Dao.Rd_account_dao"%>
<%@page import="master.dto.Rd_account_dto"%>
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
<td><label>RECCURING ID</label></td>
<td><label>AMOUNT</label></td>
<td><label>S ACC NUMBER</label></td>
<td><label>NUMBER OF YEAR</label></td>
<td><label>DATE OF TRANSCTION</label></td>
</tr>
<%Rd_account_dao da=new Rd_account_dao();
 ArrayList arr=da.getdata();
 Iterator itr =arr.iterator();
 while(itr.hasNext()){
	    Rd_account_dto dt=(Rd_account_dto)itr.next();
	    %>
<tr>
<td><%=dt.getRd_id() %></td>
<td><%=dt.getAmount() %></td>
<td><%=dt.getAcc_number()%></td>
<td><%=dt.getNo_month() %></td>
<td><%=dt.getBook_dt() %></td>	    
</tr>
	    
<%} %>
</table>

</body>
</html>