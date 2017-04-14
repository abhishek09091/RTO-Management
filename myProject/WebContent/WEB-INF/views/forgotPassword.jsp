<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Forgot Password Form</title>
  <!-- CORE CSS-->
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">
   <link href="<c:url value="/resources/css/materialize.min.css"/>" rel="stylesheet">
  <link href="<c:url value="/resources/js/jquery.min.js"/>" rel="stylesheet">
  <script type="" src="<c:url value="/resources/js/angular.min.js"/>"></script>
  <script type="text/javascript" src="<c:url value="/resources/js/app.js"/>"></script>

<style type="text/css">
html,
body {
    height: 100%;
}
html {
    display: table;
    margin: auto;
}
body {
    display: table-cell;
    vertical-align: middle;
}
.margin {
  margin: 0 !important;
}
</style>
  
</head>

<body class="yellow">


  <div id="login-page" class="row">
    <div class="col s12 z-depth-6 card-panel">
      <form class="login-form">
        <div class="row">
          <div class="input-field col s12 center">
            <img src="<c:url value="/resources/images/logo.png"/>"  class="responsive-img valign profile-image-login">
            <p class="center login-form-text">Forgot Password Form </p>
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-social-person-outline prefix"></i>
            <input class="validate" id="email" type="email" name="email">
            <label for="email" data-error="wrong" data-success="right">Email</label>
          </div>
        </div>
        <div class="row">
          <div class="input-field col s12">
            <a href="forgot-password.html" class="btn waves-effect waves-light col s12">Recover my Password</a>
          </div>
        </div>
        <div class="row">
          <div class="input-field col s6 m6 l6">
            <p class="margin medium-small"><a href="register.html">Register Now!</a></p>
          </div>
          <div class="input-field col s6 m6 l6">
              <p class="margin right-align medium-small"><a href="login.html">Login</a></p>
          </div>          
        </div>

      </form>
    </div>
  </div>


  <center>
   
</center>

  <!-- jQuery Library -->
 <script type="text/javascript" src="jquery.min.js"></script>
  <!--materialize js-->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/js/materialize.min.js"></script>






   <footer class="page-footer">
          <div class="footer-copyright">
            <div class="container">
            © 2017 RTO Management System
            </div>
          </div>
  </footer>
</body>

</html>