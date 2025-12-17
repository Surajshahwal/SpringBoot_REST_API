<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Get Your ticket info</h2>

<form action="searchTicket" method="get">
Ticket ID: <input type="text", name="ticketId"/>
<input type="submit" value="search">

</form>
<hr/>
<table>

		<tr>
			<td>TicketID :</td>
			<td>${ticket.id}</td>
		</tr>
		<tr>
			<td>FName :</td>
			<td>${ticket.fname}</td>
		</tr>

		<tr>
			<td>LName :</td>
			<td>${ticket.lname}</td>
		</tr>

		<tr>
			<td>Gender :</td>
			<td>${ticket.gender}</td>
		</tr>


		<tr>
			<td>Age :</td>
			<td>${ticket.age}</td>
		</tr>

		<tr>
			<td>From :</td>
			<td>${ticket.from}</td>
		</tr>
		<tr>
			<td>To :</td>
			<td>${ticket.to}</td>
		</tr>

		<tr>
			<td>TrainNo :</td>
			<td>${ticket.trainNo}</td>
		</tr>
		<tr>
			<td>Doj :</td>
			<td>${ticket.doj}</td>
		</tr>
		<tr>
			<td>TicketStatus:</td>
			<td>${ticket.ticketStatus}</td>
		</tr>
		<tr>
			<td>TicketCost :</td>
			<td>${ticket.ticketCost}</td>
		</tr>

	</table>
	<a href="/">Go back</a>

</body>
</html>