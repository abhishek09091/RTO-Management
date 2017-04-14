<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Bootstrap Long Multi-Step Form</title>

        <!-- CSS -->
        
        <link href="<c:url value="/resources/css/materialize.min.css"/>" rel="stylesheet">
  		<link href="<c:url value="/resources/js/jquery.min.js"/>" rel="stylesheet">
  		
     	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway:400,700"></link>
     	
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/bootstrap.min.css"/>" ></link>
        <link rel="stylesheet" href="<c:url value="/resources/assets/font-awesome/css/font-awesome.min.css"/>" ></link>
        <link rel="stylesheet" href="<c:url value="/resources/assets/css/form-elements.css"/>"></link>
        <link rel="stylesheet" href="<c:url value="resources/assets/css/style.css"/>"></link>
        <link rel="stylesheet" href="<c:url value="resources/assets/css/media-queries.css"/>"></link>
         <script type="" src="<c:url value="/resources/assets/js/jquery-1.11.1.min.js"/>"></script>
         <script src="<c:url value="/resources/assets/bootstrap/js/bootstrap.min.js"/>"></script>
         <script src="<c:url value="/resources/assets/js/jquery.backstretch.min.js"/>"></script>
       	<script src="<c:url value="/resources/assets/js/scripts.js"/>"></script>
    </head>

    <body >
		
		<!-- Top menu -->
		<nav class="navbar navbar-inverse" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.html">Bootstrap Long Multi-Step Form</a>
				</div>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="top-navbar-1">
					<ul class="nav navbar-nav navbar-right">
						<li>
							<span class="li-text">
								Logout 
							</span> 
							<span class="li-social">
								<a href="login.html" target="_blank"><i class="fa fa-sign-out"></i></a> 
								</span>
						</li>
					</ul>
				</div>
			</div>
		</nav>
        
        <!-- Description -->
		<div class="description-container">
	        <div class="container">
	        	<div class="row">
	                <div class="col-sm-12 description-title">
	                    <img src="<c:url value="/resources/images/logo.png"/>" alt="Govt. Of India" >
	                </div>
	            </div>
	            <div class="row">
	                <div class="col-sm-12 description-text">
	                    <p>
	                    	<h2>RTO Management System- Under Govt. of India</h2>
	                    </p>
	                    
	                </div>
	            </div>
			</div>
		</div>
		
		<!-- Multi Step Form -->
		<div class="msf-container">
	        <div class="container">
	        	<div class="row">
	                <div class="col-sm-12 msf-title">
	                    <h3>Complete Registration Form</h3>
	                </div>
	            </div>
	            <div class="row">
	                <div class="col-sm-12 msf-form">
	                    
	                    <form role="form" action="" method="post" class="form-inline">
	                    	
	                    	<fieldset>
	            				<h4>Personal Information (Read Only)<span class="step">(Step 1 / 7)</span></h4>
	            				<div class="form-group">
				                    <label for="firstName">First Name:</label><br>
				                    <input type="text" name="firstName" class="firstName form-control" value="abhishek" id="firstName" readonly/>
				                </div>
				                <div class="form-group">
				                    <label for="lastName">Last Name:</label><br>
				                    <input type="text" name="lastName" class="lastName form-control" value="tripathi" id="lastName" readonly/>
				                </div>
				                <div class="form-group">
				                    <label for="email">Email:</label><br>
				                    <input type="text" name="email" class="email form-control" value="abhishek.09091@gmail.com" id="email" readonly/>
				                </div>
				                <div class="form-group">
				                    <label for="dateOfBirth">Date Of Birth:</label><br>
				                    <input type="text" name="dateOfBirth" class="dateOfBirth form-control" value="09-09-1992" id="dateOfBirth" readonly/>
				                </div>
								 <div class="form-group">
				                    <label for="gender">Gender:</label><br>
				                    <input type="text" name="gender" class="gender form-control" value="Male" id="gender" readonly/>
				                </div>
	            				<br>
	            				<button type="button" class="btn btn-next">Next <i class="fa fa-angle-right"></i></button>
	            			</fieldset>
	            			
	            			<fieldset>
	            				<h4> Further Identifications(All fields are Compulsory)<span style="color:red;">*<span class="step">(Step 2 / 7)</span></h4>
	            				<div class="form-group">
				                    <label for="indentificationMark">Indentification Mark:<span style="color:red;">*</label><br>
				                    <input type="text" name="indentificationMark" class="indentificationMark form-control" id="indentificationMark" required/>
				                </div>
				                <div class="form-group">
				                    <label for="bloodGroup">Blood Group:<span style="color:red;">*</label><br>									<select name="bloodGroup" class="bloodGroup form-control" id="bloodGroup"  ng-model="bg" ng-required="true" required/>
									<option value="">--Select Blood Group--</option>
									<option value="A+">A+</option><option value="A-">A-</option><option value="B+">B+</option>
									<option value="B-">B-</option><option value="O+">O+</option><option value="O-">O-</option>
									<option value="AB+">AB+</option><option value="AB-">AB-</option>
									</select>
				                </div>
				                <div class="form-group">
				                    <label for="mobileNumber">Mobile Number:<span style="color:red;">*</label><br>
				                    <input type="text" name="mobileNumber" class="mobileNumber form-control" id="mobileNumber" required/>
				                </div>
				                <div class="form-group">
				                    <label for="adharCard">Adhar Card Number:<span style="color:red;">*</label><br>
				                    <input type="text" name="adharCard" class="adharCard form-control" id="adharCard" required/>
				                </div>
	            				<br>
	            				<button type="button" class="btn btn-previous"><i class="fa fa-angle-left"></i>Previous</button>
	            				<button type="button" class="btn btn-next">Next<i class="fa fa-angle-right"></i></button>
	            			</fieldset>
	            			
	            			<fieldset>
	            				<h4>Permanent And Temporary Address(All fields are Compulsory)<span style="color:red;">*<span class="step">(Step 3 / 7)</span></h4>
	            				<h2>Permanent Address</h2>
								<div class="form-group">
				                    <label for="pHouseNumber">House Number:<span style="color:red;">*</label><br>
				                    <input type="text" name="pHouseNumber" class="pHouseNumber form-control" id="pHouseNumber" required/>
				                </div>
				                <div class="form-group">
				                    <label for="pAreaName">Area Name:<span style="color:red;">*</label><br>
				                    <input type="text" name="pAreaName" class="pAreaName form-control" id="pAreaName" required/>
				                </div>
				                <div class="form-group">
				                    <label for="pLandmark">Landmark:<span style="color:red;">*</label><br>
				                    <input type="text" name="pLandmark" class="pLandmark form-control" id="pLandmark" required/>
				                </div>
				                <div class="form-group">
				                    <label for="pDistrict">District:<span style="color:red;">*</label><br>
				                    <input type="text" name="pDistrict" class="pDistrict form-control" id="pDistrict" required/>
				                </div>
								<div class="form-group">
				                    <label for="pState">State:<span style="color:red;">*</label><br>
				                    <input type="text" name="pState" class="pState form-control" id="pState" required/>
				                </div>
				                <div class="form-group">
				                    <label for="pPinCode">Postal Code:<span style="color:red;">*</label><br>
				                    <input type="text" name="pPinCode" class="pPinCode form-control" id="pPinCode" required/>
				                </div>
								<h2>Correspondence Address</h2>
								<div class="form-group">
				                    <label for="tHouseNumber">House Number:<span style="color:red;">*</label><br>
				                    <input type="text" name="tHouseNumber" class="tHouseNumber form-control" id="tHouseNumber" required/>
				                </div>
				                <div class="form-group">
				                    <label for="tAreaName">Area Name:<span style="color:red;">*</label><br>
				                    <input type="text" name="tAreaName" class="tAreaName form-control" id="tAreaName" required/>
				                </div>
				                <div class="form-group">
				                    <label for="tLandmark">Landmark:<span style="color:red;">*</label><br>
				                    <input type="text" name="tLandmark" class="tLandmark form-control" id="tLandmark" required/>
				                </div>
				                <div class="form-group">
				                    <label for="tDistrict">District:<span style="color:red;">*</label><br>
				                    <input type="text" name="tDistrict" class="tDistrict form-control" id="tDistrict" required/>
				                </div>
								<div class="form-group">
				                    <label for="tState">State:<span style="color:red;">*</label><br>
				                    <input type="text" name="tState" class="tState form-control" id="tState" required/>
				                </div>
				                <div class="form-group">
				                    <label for="tPinCode">Postal Code:<span style="color:red;">*</label><br>
				                    <input type="text" name="tPinCode" class="tPinCode form-control" id="tPinCode">
				                </div>
	            				<br>
	            				<button type="button" class="btn btn-previous"><i class="fa fa-angle-left"></i> Previous</button>
	            				<button type="button" class="btn btn-next">Next <i class="fa fa-angle-right"></i></button>
	            			</fieldset>
	                    	
	                    	<fieldset>
	            				<h4>Refernce Person Information(All fields are Compulsory)<span style="color:red;">* <span class="step">(Step 4 / 7)</span></h4>
	            				<div class="form-group">
				                    <label for="rPersonName">Reference Person Name:<span style="color:red;">*</label><br>
				                    <input type="text" name="rPersonName" class="rPersonName form-control" id="rPersonName" required/>
				                </div>
				                <div class="form-group">
				                    <label for="relationWithPerson">Relation with Person:<span style="color:red;">*</label><br>
				                    <input type="text" name="relationWithPerson" class="relationWithPerson form-control" id="relationWithPerson" required/>
				                </div>
				                
				                <div class="form-group">
				                    <label for="rPersonMobile">Reference Person Mobile Number:<span style="color:red;">*</label><br>
				                    <input type="text" name="rPersonMobile" class="rPersonMobile form-control" id="rPersonMobile" required/>
				                </div>
				                
	            				<br>
	            				<button type="button" class="btn btn-previous"><i class="fa fa-angle-left"></i> Previous</button>
	            				<button type="button" class="btn btn-next">Next <i class="fa fa-angle-right"></i></button>
	            			</fieldset>
	            			
	            			<fieldset>
	            				<h4>Educational Qualification(All fields are Compulsory)<span style="color:red;">*<span class="step">(Step 5 / 7)</span></h4>
	            				<div class="form-group">
				                    <label for="qualification">Qualification:<span style="color:red;">*</label><br>									<select name="bloodGroup" class="bloodGroup form-control" id="bloodGroup"  ng-model="bg" ng-required="true" required/>
									<option value="">--Select Qualification--</option>
									<option value="postGraduation">Post-Graduation</option><option value="graduation">Graduation</option><option value="higherSecondary">Higher Secondary</option>
									<option value="secondary">Secondary</option><option value="others">Others</option>
									</select>
				                </div>
								
								
	            				<br>
	            				<button type="button" class="btn btn-previous"><i class="fa fa-angle-left"></i> Previous</button>
	            				<button type="button" class="btn btn-next">Next <i class="fa fa-angle-right"></i></button>
	            			</fieldset>
	            			
	            			<fieldset>
	            				<h4>Upload Photo(All fields are Compulsory)<span style="color:red;">* <span class="step">(Step 6 / 7)</span></h4>
	            				<div class="form-group">
									<label for="photo">Pofile Pic(Only .jpeg or .jpg format)<span style="color:red;">*</label><br>
				                    <input width="300px" type="file" name="photo" enctype="multipart/form-data" class="photo form-control" id="photo" ng-model="photo" required/>
				                </div>
								
								
								
							
	            				<br>
	            				<button type="button" class="btn btn-previous"><i class="fa fa-angle-left"></i> Previous</button>
	            				<button type="button" class="btn btn-next">Next <i class="fa fa-angle-right"></i></button>
	            			</fieldset>
	            			
	            			<fieldset>
	            				<h4>Upload Address Proof(All Fields are Compulsory) <span class="step">(Step 7 / 7)</span></h4>
				                <div class="form-group">
									<label for="photo">Address File(Only .jpeg or .jpg format)<span style="color:red;">*</label><br>
				                    <input width="300px" type="file" name="photo" enctype="multipart/form-data" class="photo form-control" id="photo" ng-model="photo" required/>
				                </div>
	            				
	            				<br>
	            				<button type="button" class="btn btn-previous"><i class="fa fa-angle-left"></i> Previous</button>
	            				<button type="submit" class="btn">Submit</button>
	            			</fieldset>
	                    	
	                    </form>
	                    
	                </div>
	            </div>
			</div>
		</div>
		
		

        <!-- Javascript -->
       
 		
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>
