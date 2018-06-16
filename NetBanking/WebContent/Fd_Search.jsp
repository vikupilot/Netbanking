<%@page import="master.dto.Fd_Report_Dto"%>
<%@page import="master.Dao.Fd_account_Dao"%>
<%@page import="master.Dao.AccountDao"%>
<%@page import="master.dto.CID_ACC_CUSTOMER_DTO"%>
<%@page import="master.dto.CustomerDto"%>
<%@page import="master.Dao.CustomerDao"%>


<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fd Search</title>
<script type="text/javascript">
 function getIDDetails()
 {

	 var cid=document.f1.cid.value;
   
	 document.f1.action="Fd_Search.jsp?cid="+cid;
	 document.f1.submit();
 }
</script>
</head>
<body>
<form name="f1" method="post" align="center">
<table>
<tr>
<td><label>CHOOSE CID</label></td>
<td><input type="text" name="cid" id="cid" onchange="getIDDetails()">
</td>
</tr>
<tr>
<td><input type="submit" value="Fd Detail"></td>
</tr>
<%
Fd_account_Dao fdao= new Fd_account_Dao();
//to get the Fd detail we use Account Dao to view all the data
ArrayList results=fdao.Fd_Report_View();
Iterator itr=results.iterator();
while(itr.hasNext())
{
Fd_Report_Dto cdto=(Fd_Report_Dto)itr.next();

%>
<%
}
%>
</table>

<%

if(request.getParameter("cid")!=null )
{
  String cid=request.getParameter("cid");
   Fd_account_Dao cdao1=new Fd_account_Dao();
  ArrayList list=cdao1.get_Fd_Search(cid);
  Iterator itr1=list.iterator();
  
%>
<table border=1 align="center">
    <tr>
        <th> ACCOUNT NUMBER</th>
        <th> CUSTOMR NAME</th> 
        <th> CUSTOMER ID</th> 
        <th> FD ID</th> 
        <th> FD AMMOUNT</th> 
        <th> BOOKING DATE</th> 
        <th> NO OF YEAR </th> 
       
   </tr>
      <%
          while(itr1.hasNext())
          {
       	  Fd_Report_Dto acdto=(Fd_Report_Dto)itr1.next();
       	   
       	%>
       	 <tr>
       	     <td><%=acdto.getAcc_number() %></td>
       	     <td><%=acdto.getCname() %></td> 
       	     <td><%=acdto.getCid() %></td>
       	     <td><%=acdto.getFd_id() %></td>
       	     <td><%=acdto.getAmmount() %></td>
       	     <td><%=acdto.getBook_dt() %></td>
       	     <td><%=acdto.getNo_year() %></td>
       	  </tr>   
       	<%
          }     
      %>  
</table>
<%
}
%>
</form>
</body>
</html>