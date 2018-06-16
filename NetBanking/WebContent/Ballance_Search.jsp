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
<title>Balance Search</title>
<script type="text/javascript">
 function getIDDetails()
 {
     alert("View Balance");
	 var cid=document.f1.cid.value;
     alert(cid);
	 document.f1.action="Ballance_Search.jsp?cid="+cid;
	 document.f1.submit();
 }
</script>
</head>
<body>
<form name="f1" method="post" align="center">
<table>
<tr>
<td><label>CHOOSE CID</label></td>
<td><select name="cid" id="cid" onchange="getIDDetails()">
<option value="">SELECT CID</option>
<%
AccountDao cdao= new AccountDao();
//to get the cid detail we use Account Dao to view all the data
ArrayList results=cdao.CID_VIEWDATA();
Iterator itr=results.iterator();
while(itr.hasNext())
{
CID_ACC_CUSTOMER_DTO cdto=(CID_ACC_CUSTOMER_DTO)itr.next();

%>
<option value="<%=cdto.getCid()%>"><%=cdto.getCid()%></option>
<%
}
%>
</select>
</table>
<%
     
     if(request.getParameter("cid")!=null )
     {
       String cid=request.getParameter("cid");
        CustomerDao cdao1=new CustomerDao();
       ArrayList list=cdao1.get_cid_Details(cid);
       Iterator itr1=list.iterator();
       
  %>
  <table border=1 align="center">
         <tr>
             <th> ACCOUNT NUMBER</th>
             <th> BALANCE</th>    
        </tr>
           <%
               while(itr1.hasNext())
               {
            	 CID_ACC_CUSTOMER_DTO cacdto=(CID_ACC_CUSTOMER_DTO)itr1.next();
            	   
            	%>
            	 <tr>
            	     <td><%=cacdto.getAcc_number() %></td>
            	     <td><%=cacdto.getBalance() %></td> 
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