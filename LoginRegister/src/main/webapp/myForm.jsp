<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="regForm" method="post">
<div>
<label for="name">Name:</label>
<input type="text" name="name" id="name" placeholder="Enter name..">
</div>
<div>
<label for="email">Email:</label>
<input type="email" name="email" id="email" placeholder="Enter email id">
</div>
<div>
<label for="password">Password:</label>
<input type="password" name="password" id="password" placeholder="Enter password">
</div>
<div>
Gender:<input type="radio" name="gender" id="gender" value="male">Male<input type="radio" name="gender" id="gender" value="female"/>Female
</div>
<div>
<label for="city">City</label>
<select name="city" id="city">
<option>Select</option>
<option>Mumbai</option>
<option>Delhi</option>
<option>Pune</option>
<option>Banglore</option>
</select>
</div>
<div>
<input type="submit" value="Register">
</div>
</form>
</body>
</html>