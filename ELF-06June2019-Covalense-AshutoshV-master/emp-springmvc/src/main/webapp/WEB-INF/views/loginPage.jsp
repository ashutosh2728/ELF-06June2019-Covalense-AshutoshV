<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session= "false" %>
<html lang="en">
<head>
  <title>Employee Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <!-- <script src="./loginform.js"></script> -->
  <style>
  body {
  background-image : url("https://cdn.pixabay.com/photo/2018/12/10/10/21/earth-3866609_960_720.jpg");
    background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  
}
</style>
</head>
<body >

  
<br /><br />
<div class="container col-md-4" style="background: whitesmoke" >
  <h2>Login</h2>
  <form action="./authenticate" method="post" class="" >
    <div class="form-group"  >
    <H6><span style ="color : red"> ${msg} </span></H6>
      <label for="email">Email:</label>
      <input type="id" class="form-control" id="id" placeholder="Enter Employee ID" name="id">
      <label for="password">Password:</label>
      <input type="password" onkeyup="validateForm()" class="form-control" id="password" placeholder="Enter Password" name="password">
      <!-- <label for="password">Confirm Password:</label>
      <input type="password" onkeyup="validateForm()" class="form-control" id="confirmpassword" placeholder="Confirm Password" name="confirmpassword"> -->
    </div>
    <div class="form-group form-check">
        <label class="form-check-label">
          <input class="form-check-input" onclick="showPassword()" name="showpassword" type="checkbox"> Show Password
        </label>
    </div>
   
    <div class="row"> 
    <input type="submit" name="sbmt"  class="btn btn-primary" style="margin-left: 20px ; background : mediumblue" >
        </input>
    <br>
    <br>

    <a href="../emp/create" style="margin-left: 70px" type="button" class="btn btn-primary style="margin-left: 20px">Create</a>
 
<br><br>
    <button type="button" name="Forgot" onclick="createTable()" class="btn btn-primary" style="margin-left: 50px ; background: mediumblue">
     Forgot Password</button>
  </form>
  <br /><br />
</div>

  
<br>
</div>
</div>
</body>
</html>