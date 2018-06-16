<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CUSTOMERJSP</title>
</head>
<body>
<form action="CustomerAddServe" method="post">
<table>
<tr><td><label>CUSTOMER ID</label><td>
<td><input type="password" name="cid"></td>
</tr>
<tr><td><label>CUSTOMER NAME</label><td>
<td><input type="text" name="cname"></td>
</tr>
<tr><td><label>MOBILE NO</label><td>
<td><input type="text" name="cphno"></td>
</tr>
<tr><td><label>CUSTOMER EMAIL</label><td>
<td><input type="text" name="cemail"></td>
</tr>
<tr><td><label>HOUSE NO</label><td>
<td><input type="text" name="houseno"></td>
</tr>
<tr><td><label>STREAT NO</label><td>
<td><input type="text" name="strno"></td>
</tr>
<tr><td><label>PINCODE</label><td>
<td><input type="text" name="pincode"></td>
</tr>
<tr><td><label>AGE</label><td>
<td><input type="text" name="age"></td>
</tr>
<tr><td><label>PAN NO</label><td>
<td><input type="text" name="panno"></td>
</tr>
<tr><td><label>OCCUPATION</label><td>
<td><select name="ocupation">
<option value="farmer">FARMER</option>
<option value="business">BUSINESS</option>
<option value="student">STUDENT</option>
<option value="housewife">HOUSEWIFE</option>
<Option value="other">OTHER</Option>
</select></td>
</tr>
<tr><td><label>GENDER</label><td>
<td><select name="gender">
<option value="M">MALE</option>
<option value="F">FEMALE</option>
</select>
</td>
</tr>
<tr>
<td><input type="submit" value="REGISTER"></td>
</tr>
</table></form>
</body>
</html>