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
        <h2><b>homepage details</b></h2>
    </div>
    <br>
    <div class="alert alert-primary" role="alert">
    <form action="homeopagedetails">
  <div class="form-group">
    <label><b>Heading</b></label>   
    <input type="text" class="form-control" name = "homepageheading">
    </div>
  <div class="form-group">
    <label><b>Quote</b></label>
    <textarea class="form-control" name = homepagequote></textarea>
  </div>
  <div class="form-group">
    <label><b>Image for HomePage</b></label>
    <input type="file" class="form-control-file" name = "homepageimage">
  </div>
  <input type="submit" class="btn btn-primary">
   </form>
   </div>


<hr><hr><hr>

    <div class="alert alert-dark" role="alert">
        <h2><b>Contact details</b></h2>
    </div>
        <div class="alert alert-primary" role="alert">
    <form action = "contactdetails">
  <div class="form-group">
    <label><b>Phone number</b></label>   
    <input type="text" class="form-control" name = "mobilenumber">
    </div>
  <div class="form-group">
    <label><b>email</b></label>
    <input type="email" class="form-control" name = "email">
  </div>
  <input type="submit" class="btn btn-primary">
   </form>
   </div>

   <hr>

       <div class="alert alert-dark" role="alert">
        <h1><b><a href="home">GO TO HOMEPAGE</a></b></h1>
    </div>
</div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
  </body>
</html>