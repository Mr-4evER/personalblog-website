<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  	<div class="container">
    <div class="alert alert-dark" role="alert">
        <h2><b>About us Page details</b></h2>
    </div>
    <br>
    <div class="alert alert-primary" role="alert">
    <form action = "about1">
  <div class="form-group">
    <label><b>Heading for about us first column</b></label>   
    <input type="text" class="form-control" name = "aboutfirstheading">
    </div>
  <div class="form-group">
    <label><b>description for about us first column</b></label>
    <textarea class="form-control" name = "aboutfirstdescription"></textarea>
  </div>
  <input type="submit" class="btn btn-primary">
   </form>
   </div>


<hr><hr><hr>

    <div class="alert alert-primary" role="alert">
    <form action = "about2">
  <div class="form-group">
    <label><b>Heading for about us second column</b></label>   
    <input type="text" class="form-control" name="aboutsecondheading">
    </div>
  <div class="form-group">
    <label><b>desricption for about us second column</b></label>
    <textarea class="form-control" name ="aboutseconddescription"></textarea>
  </div>
  <input type="submit" class="btn btn-primary">
   </form>
   </div>

   <hr><hr><hr>

       <div class="alert alert-primary" role="alert">
    <form action = "about3">
  <div class="form-group">
    <label><b>Heading for about us third column</b></label>   
    <input type="text" class="form-control" name = "aboutthirheading">
    </div>
  <div class="form-group">
    <label><b>desricption for about us third column</b></label>
    <textarea class="form-control" name = "aboutthirddescription"></textarea>
  </div>
  <input type="submit" class="btn btn-primary">
   </form>
   </div>

       <div class="alert alert-dark" role="alert">
        <h1><b><a href="home">GO TO HOMEPAGE</a></b></h1>
    </div>
</div>

</html>