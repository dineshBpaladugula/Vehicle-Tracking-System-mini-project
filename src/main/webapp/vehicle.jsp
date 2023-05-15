<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
.blink {
  animation: blink 1s steps(1, end) infinite;
}

@keyframes blink {
  0% {
    opacity: 1;
  }
  50% {
    opacity: 0;
  }
  100% {
    opacity: 1;
  }
}

.button {
  background-color: green;
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

input[type=text],input[type=password],input[type=number],input[type=email],
select,input[type=date]
{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

label 
{
  padding: 12px 12px 12px 0;
  display: inline-block;
  font-weight: bold;
}


ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: lightgreen;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: orange;
  color: white;
}
body {
  background-image: url("images/sd1.jpg");
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}
</style>


    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/login.css">
    <title>signup</title>
</head>
<body background="images/sd1.jpg">

    <img src="img/loader.gif" class="loader" alt="">

    <div class="container">
        <img src="img/icon.webp" class="logo" alt="">
        <div>
            <h2 align=center>Vehicle registration</h2>
            


<br>
<span class="blink">
<h3 align=center style="color: green"><c:out value="${msg}"/></h3>
</span>
<form action="addvehicle" method="post" enctype="multipart/form-data">

<table align=center>


<tr>
<td><label>Vehicle Number</label></td>
<td><input type="text" name="vehiclenumber" required="required"/></td>
</tr>

<tr>
<td><label>VehicleType</label></td>
<td>
<select name="vehicletype" required="required">
<option value="-1">---category---</option>
<option value="Car">Car</option>
<option value="Truck">Truck</option>
<option value="Bus">Bus</option>
<option value="Bike">Bike</option>
</select>
</td>
</tr>

<tr><td></td></tr>

<tr><td></td></tr>

<tr align=center>
<td colspan=2><input type="submit" value="Add" class="button"></td>
</tr>

</table>

</form>
           
            
        </div>
        <center><a href="new" class="link">You want to go to home? click me</a><br></center>
        <center><a href="login" class="link">You want to go to UserLogin? click me</a></center>
        
    </div>

</body>
</html>