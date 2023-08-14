<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
    <h2>Đăng nhập</h2>
    <form action="login.jsp" method="post">
        <label for="username">Tên đăng nhập:</label>
        <input type="text" id="username" name="username" required><br><br>
        
        <label for="password">Mật khẩu:</label>
        <input type="password" id="password" name="password" required><br><br>
        
        <input type="submit" value="Đăng nhập">
    </form>
    
    <br>
    
    <a href="forgotPassword.jsp">Quên mật khẩu?</a><br>
    <a href="register.jsp">Đăng ký</a>
</body>
</html>