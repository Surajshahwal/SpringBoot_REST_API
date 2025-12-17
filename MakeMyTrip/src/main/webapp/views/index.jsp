<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2>Enter passenger info </h2>
	<form action="bookTicket" method="post">
	<table>
		<tr>
			<td>Fname:</td>
			<td><input type="text" name="fname" /></td>
		</tr>
		<tr>
			<td>Lname:</td>
			<td><input type="text" name="lname" /></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><input type="text" name="gender" /></td>
		</tr>

		<tr>
			<td>Age:</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>From:</td>
			<td><input type="text" name="from" /></td>
		</tr>
		<tr>
			<td>To:</td>
			<td><input type="text" name="to" /></td>
		</tr>
		<tr>
			<td>TrainNo:</td>
			<td><input type="text" name="trainNo" /></td>
		</tr>
		<tr>
			<td>Doj:</td>
			<td><input type="text" name="doj" /></td>
		</tr>
		<tr>
		<td></td>
			<td><input type="submit" value="book Ticket" /></td>

		</tr>

	</table>
	</form>
	<a href="search"> Search Ticket</a>
	
</body>
</html>