<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACCOUNTUPDATE</title>
</head>
<body>
<form action="AccountUpdate" method="post">
<table>
<tr><td><label>ACCOUNTNUMBER</label><td>
<td><input type="text" name="acc_number"></td>
</tr>
<tr><td><label>ACCOUNT TYPE</label><td>
<td><select name="acc_type">
<option value="sav_acc">SAVING_ACCOUNT</option>
<option value="curr_acc">CURRENT_ACCOUNT</option>
</select></td>
</tr>
<tr><td><label>CID</label><td>
<td><input type="text" name="cid"></td>
</tr>
<tr><td><label>Balance</label><td>
<td><input type="text" name="balance"></td>
</tr>
<tr>
<td><input type="submit" value="UPDATE"></td>
</tr>
</table>
</form>
</body>
</html>