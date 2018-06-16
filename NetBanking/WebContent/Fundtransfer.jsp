<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FundTransfer" method="post">
<table>
<tr>
<td><label>SOURCE ACCOUNT NUMBER</label></td>
<TD><input TYPE="text" NAME="s_accno"></TD>
</tr>
<tr>
<td><label>BENIFECIERY ACCOUNT NUMBER</label></td>
<TD><input TYPE="text" NAME="b_accno"></TD>
</tr>
<TR>
<td><label>AMOUNT</label></td>
<TD><input TYPE="text" NAME="amount"></TD>
</tr>
<tr>
<td><label>DATE OF TRANSCTION</label></td>
<TD><input TYPE="text" NAME="transdt"></TD>
</tr>
<tr>
<TD><input TYPE="submit" value="TRANSFER"></TD>
</tr>
</table>
</form>
</body>
</html>