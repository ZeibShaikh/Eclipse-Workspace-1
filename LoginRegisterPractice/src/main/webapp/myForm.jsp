<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerForm" method="post">
<div>
<label for="name">Name:</label>
<input type="text" name="name" id="name" placeholder="Enter your name here">
</div>
<div>
<label for="name">Email:</label>
<input type="email" name="email" id="email" placeholder="Enter your email here">
</div>
<div>
<label for="name">Password:</label>
<input type="password" name="password" id="password" placeholder="Enter your password here">
</div>
<div>
<label for="name">Gender:</label>
<input type="radio" name="gender" id="gender" value="Male">Male
<input type="radio" name="gender" id="gender" value="Female">Female
</div>
<div>
<label for="city">City:</label>
<select name="city" id="city">
<option>Select</option>
<option>Mumbai</option>
<option>Delhi</option>
<option>Pune</option>
</select>
</div>
<div>
<input type="submit" value="Register">
</div>
</form>
</body>
</html>