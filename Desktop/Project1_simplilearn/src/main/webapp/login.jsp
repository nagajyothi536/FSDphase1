<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<center> <h1>Admin Login</h1> </center>
<form action="/AdminControllerServlet1" method="POST">
<div class="container">
<input type="hidden" name="command" value="Login" />
<label> Username: </label>
<br />
<input type="text" placeholder="Enter Username" name="username" required />
<br />
<label> Password: </label>
<br />
<input type="password" placeholder="Enter Password" name="password" required />
<br />
<button type="submit">Login</button>
<br />
<input type="checkbox" checked="checked" > Remember me
</div>

</form>
</body>
</html>