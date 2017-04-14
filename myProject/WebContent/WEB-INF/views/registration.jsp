<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
   <head>
        <title>Registration Form</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">
   <link href="<c:url value="/resources/css/materialize.min.css"/>" rel="stylesheet">
   <link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
   <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
  <script type="" src="<c:url value="/resources/js/angular.min.js"/>"></script>
  <script type="" src="<c:url value="/resources/js/jquery.min.js"/>"></script>
  <script type="text/javascript" src="<c:url value="/resources/js/app.js"/>"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">
	</head>
    <body class="container blue">
        <div class="row" ng-app="myApp" ng-controller="maincntrl">
            <div class="col-md-offset-3 col-md-6 col-sm-12" >
                <div class="login white" >
                    <div class="row">
          <div class="input-field col s12 center">
            <img src="<c:url value="/resources/images/logo.png"/>" alt="" class="responsive-img valign profile-image-login">
            <p class="center login-form-text "><b><h5>RTO Registration Form</h5></b> </p>
          </div>
        </div>
        <h3 align="center">${requestScope.mesg}</h3>
					<!--Code of form started-->
                    <form class="form-horizontal " action="completeRegisteration" name="frm" method="post" novalidate>
                        <!--Code to validate first name is written here-->
						<div class="form-group" >
                            <label id="label" class="control-label">First Name</label>
                            <input type="text" class="form-control" name="firstName" ng-model="user.firstName" ng-pattern="/^[a-z A-Z]*$/i" placeholder="Enter First Name" autocomplete="off" required />
							<span ng-show="form.firstname.$touched && form.firstname.$error.required">First Name required!!</span>
							<div ng-show="form.firstname.$dirty && form.firstname.$error.pattern">First Name should contain letters only!!</div>
                        </div>
						 <!--Code to validate last name is written here-->
						<div class="form-group" >
                            <label id="label" class="control-label">Last Name</label>
                            <input type="text" class="form-control" name="lastName" ng-model="user.lastName" ng-pattern="/^[a-z A-Z]*$/i" placeholder="Enter Last Name" autocomplete="off" required />
							<span ng-show="form.lastname.$touched && form.lastname.$error.required">Name required!!</span>
							<span ng-show="form.lastname.$dirty && form.lastname.$error.pattern">Name should contain letters only!!</span>
		
                        </div>
						<!--Code to validate Date of Birth is written here-->
						<div class="form-group" >
							<i class="datepicker"></i>
                            <label id="label" class="control-label">Date Of Birth</label>
                            <input type="date" class="form-control" name="dateOfBirth" ng-model="user.dateOfBirth" placeholder="Select Date of Birth" autocomplete="off" required />
                        </div>
						<!--Code to validate email address is written here-->
                        <div class="form-group">
							
                            <label id="label" class="control-label">Email</label>
							
                            <input type="email" class="form-control" ng-model="user.email" name="email" placeholder="Enter Email Address" autocomplete="off" required>
                            <span class="msg" ng-show="frm.email.$dirty && frm.email.$invalid">Email Address is not valid</span>
                        </div>
						<!--Code to validate gender field-->
                        <div class="form-group">
                            
							<p>
							<label id="label" class="control-label">Gender</label>
							<br/>
							<input class="with-gap" name="gender" type="radio" id="male" value="male" />
							<label for="male">Male</label>
							<input class="with-gap" name="gender" type="radio" id="female" value="female" />
							<label for="female">Female</label>
							<input class="with-gap" name="gender" type="radio" id="other" value="other" />
							<label for="other">Other</label>
							</p>
							<span class="msg" ng-show="frm.gender.$error.required">select any gender</span>
							
                            
                        </div>
						<!--Code to disable submit button is written here-->
                        <div class="form-group">
                            <input ng-disabled="frm.$invalid" class="btn btn-warning" type="submit" ng-click="call()" value="Submit">
                       
						<!--Code to reset button is written here-->
                       
                            <input  class="btn btn-warning" type="reset"  value="Reset">
                        </div>
                    </form>							
                </div>
            </div>
		</div>
    </body>
</html>