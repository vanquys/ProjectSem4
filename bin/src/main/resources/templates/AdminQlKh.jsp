<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="process-form.jsp" method="post">
        <input type="submit" name="action" value="Thêm">
    </form>
    
    <form action="process-form.jsp" method="post">
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Price</th>
                <th>Teacher ID</th>
                <th>Link Online</th>
                <th>Description</th>
                <th></th>
                <th></th>
            </tr>
            
            <tr>
                <td><input type="text" name="id"></td>
                <td><input type="text" name="name"></td>
                <td><input type="text" name="price"></td>
                <td><input type="text" name="teacherId"></td>
                <td><input type="text" name="linkOnline"></td>
                <td><textarea name="description" rows="2" cols="30"></textarea></td>
                <td><input type="submit" name="action" value="Sửa"></td>
                <td><input type="submit" name="action" value="Xóa"></td>
            </tr>

            
        </table>
    </form>
</body>
</html>