<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="Customer_registration" method="post">
<table><tr>
<td><label>USER ID</label></td>
<td><input type="text" name="userid"></td>
</tr>
<tr>
<td><label>PASSWORD</label></td>
<td><input type="password" name="pasw"></td>
</tr>
<tr>
<td><label>Security question</label></td>
<td><select name="sec_ques">
<option value="what is your mother name">what is your mother name</option>
<option value="which web you daily visit">which web you daily visit</option>
<option value="what is your pet animal name">what is your pet animal name</option>
<option value="what is best friend name">what is best friend name</option>
</select>
</td>
</tr>
<tr>
<td><label>Security answer</label></td>
<td><input type="text" name="answer"></td>
</tr>
<tr>
<td><input type="submit" value="REGISTER"></td>
</tr>
</table>
</form>
</center>
</body>
</html>