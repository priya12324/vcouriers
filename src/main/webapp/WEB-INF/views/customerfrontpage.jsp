<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
    <meta charset="ISO-8859-1">
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
            font-family: serif;
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
        font-family: serif;
        font-size: 30px;
         margin-left: 50px;
        }
        
        .edit{
            border-radius: 10px;
            margin-left: 900px;
            margin-top: 40px;
            font-size: 20px;
            width: 300px;
            height: 50px;
            font-family: serif;
        }
    </style>
    <body>
        <div class="image">Courier Management System<br> <div class ="gety">Adding speed to your deliveries</div></div>
        
        <
        <form action="tracking">
        <input class ="edit "type="submit"  value="Tracking"><br></form>
         <form action="orders">
        <input class ="edit "type="submit"  value="orders"><br></form>
        
        <form action="payment">
        <input class ="edit "type="submit"  value="Payment"><br></form>
        <form action="history">
        <input class ="edit "type="submit"  value="view history"><br></form>
        
        <form action="/">
        <input class ="edit "type="submit"  value="Back to Home"><br></form>
    </body>
</html>