<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    
<title>home</title>
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans:ital@1&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Balsamiq+Sans:ital@1&family=Dancing+Script:wght@700&display=swap" rel="stylesheet">
    <style> 
        body{
            margin-top: 220px;
            background-image: url(https://www.techjockey.com/blog/wp-content/uploads/2018/12/Courier-Management.jpg);
            background-size: cover;
            background-attachment: local;
        }
        
        .image{
            margin-left: 900px;
            margin-top: 40px;
            margin-bottom: 1px;
            font-family:serif;
            font-size: 50px;
            
            font-weight: 500;
        }
        .gen{
            margin-left: 900px;
            margin-top: 20px;
            width: 300px;
            height: 50px;
            font-family: serif;
            font-size: 20px;
            border-radius: 10px;
        }
        .gety{
        font-family:serif;
        font-size: 30px;
        margin-left: 50px;
        }
        
        .add{
            border-radius: 10px;
            margin-left: 900px;
            margin-top: 40px;
            font-size: 20px;
            width: 300px;
            height: 50px;
            font-family:serif;
        }
    </style>
    <body>
        <div class="image">Courier Management System<br> <div class ="gety">Adding spped to your deliveries</div></div>
        <form action="admin">
            <input class ="add "type="submit"  value="Admin"><br></form>
        <form action="user">
        <input class="gen" type="submit"  value="System User"><br></form>
        
        <form action="customer">
        <input class="gen" type="submit"  value="Customer"><br></form>
         <form action="register">
        <input class="gen" type="submit"  value="New user?"><br></form>
    </body>
</html>