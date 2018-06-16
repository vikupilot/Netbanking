<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>fix deposit</title>
</head>
<body >
<center>
<h1 style="color:white">CREATE YOUR FD</h1>
<form action="Fd_Account" method="post">
<table>
<tr>
<td><label style="color:white";>FD AMMOUNT</label>
</td>
<td><input type="text" name="ammount"></td>
</tr>
<tr>
<td><label style="color:white";>SAVING ACCOUNT NUMBER</label>
</td>
<td><input type="text" name="s_accno"></td>
</tr>
<tr>
<td><label style="color:white";>NUMBER OF YEAR</label>
</td>
<td><select name="no_year">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
</select></td>
</tr>
<tr>
<td><label style="color:white";>BOOKING_DATE</label>
</td>
<td><input type="text" name="book_dt"></td>
</tr>
<tr>
<td><input type="submit" value="CREATE"></td>
</tr>
</table></form>

</center>
</body>
</html>