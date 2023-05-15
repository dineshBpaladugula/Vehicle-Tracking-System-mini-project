<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>



<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
<style type="text/css">
  @import url('https://fonts.googleapis.com/css?family=Roboto:300,400,400i,500');
*{
  padding: 0;
  margin: 0;
  list-style: none;
  text-decoration: none;
}
body {
  font-family: 'Roboto', sans-serif;
}
.sidebar {
  position: fixed;
  left: -250px;
  width: 250px;
  height: 100%;
  background: #042331;
  transition: all .5s ease;
}
.sidebar header {
  font-size: 22px;
  color: white;
  line-height: 70px;
  text-align: center;
  background: #063146;
  user-select: none;
}
.sidebar ul a{
  display: block;
  height: 100%;
  width: 100%;
  line-height: 65px;
  font-size: 20px;
  color: white;
  padding-left: 40px;
  box-sizing: border-box;
  border-bottom: 1px solid black;
  border-top: 1px solid rgba(255,255,255,.1);
  transition: .4s;
}
ul li:hover a{
  padding-left: 50px;
}
.sidebar ul a i{
  margin-right: 16px;
}
#check{
  display: none;
}
label #btn,label #cancel{
  position: absolute;
  background: #042331;
  border-radius: 3px;
  cursor: pointer;
}
body {
          background-image: url('img/admin.jpg');
          background-repeat: no-repeat;
          background-attachment: fixed;
          background-size: 1680px 800px ;
         
      }
label #btn{
  left: 40px;
  top: 25px;
  font-size: 35px;
  color: white;
  padding: 6px 12px;
  transition: all .5s;
}
label #cancel{
  z-index: 1111;
  left: -195px;
  top: 17px;
  font-size: 30px;
  color: #0a5275;
  padding: 4px 9px;
  transition: all .5s ease;
}
#check:checked ~ .sidebar{
  left: 0;
}
#check:checked ~ label #btn{
  left: 250px;
  opacity: 0;
  pointer-events: none;
}
#check:checked ~ label #cancel{
  left: 195px;
}
#check:checked ~ section{
  margin-left: 250px;
}
section{
  background: url(bg.jpeg) no-repeat;
  background-position: center;
  background-size: cover;
  height: 100vh;
  transition: all .5s;
}
  body {
  background-image: url("images/p.jpeg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
  </style>
  <head>
  
    <meta charset="utf-8">
    <title>ADMIN</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
  </head>
  <body background="images/p.jpeg">
    <input type="checkbox" id="check">
    <label for="check">
      <i class="fas fa-bars" id="btn"></i>
      <i class="fas fa-times" id="cancel"></i>
    </label>
    <div class="sidebar">
    <header>ADMIN</header>
    <ul>
     <li><a href="viewallcustomers"><i class="fas fa-qrcode"></i>view all customers</a></li>
     <li><a href="viewallpartners"><i class="fas fa-qrcode"></i>view all partners</a></li>
     
     <li><a href="adminlogin"><i class="fas fa-stream"></i>Logout</a></li>
    </ul>
   </div>
   <section></section>
  </body>
</html>

 
