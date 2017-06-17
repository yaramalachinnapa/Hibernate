<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
    <h1>Registration Form</h1>
    <form action="register" method="post">
		<table border="4" align="center">
			<tr>
				<td>StudentNumber</td>
				<td><input type="text" name="sno"/></td>
			</tr>
			<tr>
				<td>StudentName</td>
				<td><input type="text" name="sname"/></td>
			</tr>
			<tr>
				<td>Marks</td>
				<td><input type="text" name="marks"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="register"/></td>
			</tr>
		</table>

	</form>
</body>
</html>
