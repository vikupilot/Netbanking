<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rd_account</title>
</head>
<body ><center>
<h2 style="color:white">CREATE RD</h2>
<form action="Rd_account" method="post">
<table>
<tr>
<td><label style="color:white";>AMOUNT</label></td>
<td>
<input type="text"  name="amount"></td></tr>
<tr>
<td><label style="color:white";>Account Number</label></td>
<td>
<input type="text"  name="acc_number"></td></tr>
<tr>
<td><label style="color:white";>Number of month</label></td>
<td>
<select name="no_month">
<option value="1">1 month</option>
<option value="2">2 month</option>
<option value="3">3 month</option>
<option value="4">4 month</option>
<option value="5">5 month</option>
<option value="6">6 month</option>
</select></td></tr>
<tr>
<td><label style="color:white";>Booking date</label></td>
<td>
<input type="text"  name="book_dt"></td></tr>
<tr>
<td>
<input type="Submit"  value="Create Rd"></td></tr>
</table></form>
</center>
</body>
</html>