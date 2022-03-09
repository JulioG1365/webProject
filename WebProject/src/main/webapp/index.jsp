<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">

  <title>Website/Login</title>

  <link rel="stylesheet" href="main.css">

</head>
<body>
<nav class="nav">
  <ul>
    <li><a href="login.jsp">Index</a></li>
    <li><a href="index.jsp">Login</a></li>
    <li><a href="contact.jsp">Contact</a></li>

  </ul>
</nav>

<div id="Login">
  <h1>Login</h1>

<form action="ProcessInfo" method= "post">
    <p>Email</p>
    <br>
    <input type="text" name="email" placeholder="Enter Email">
    <p>Password</p>
    <br>
    <input type="password" name="passW" placeholder="Enter Password">
    <input type="submit" name="" value="Login">
  </form>
  </div>
</body>
</html>
