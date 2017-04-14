<html>
<head>
<link rel="stylesheet" href="login.css">
<link rel="stylesheet" href="bootstrap.min.css">
<style>
	button{
		width:100;
		height:30;
	}
	input{
		width:300;
		height:30;
	}
	select {
	    width: 300;
	    height: 30;
	}
	div{
		width:800;
	}
	body{
		background-color:#00ccff;
	}
</style>
</head>
	<body>
	<h1 align="center">Regional Transport Office</h1>
		<div class="login">
		<div class="heading">
		<div class="heading">
		  <div>
			    <h2>Sign Up </h2>
			    <form action="login.jsp">
			    	  <div class="input-group input-group-lg">
				        <span class="input-group-addon"><i class="fa fa-user"></i></span> 
				        <input type="text" name="firstname" class="form-control" placeholder="first name">
				      </div>
				      <div class="input-group input-group-lg">
				        <span class="input-group-addon"><i class="fa fa-user"></i></span>
				        <input type="text" name="lastname" class="form-control" placeholder="last name">
				      </div>
				       <div class="input-group input-group-lg">
				        <span class="input-group-addon"><i class="fa fa-calendar"></i></span>
				        <span id="label" class="input-group-addon"></span>
				      
				        <input type="date" name="dateOfBirth" class="form-control"
				        >
				      </div>
				      
				      <div class="input-group input-group-lg">
				        <span class="input-group-addon"><i class="fa fa-male"></i></span>
				       
				        <select class="form-control">
				        	<option class="form-control">gender</option>
				        	<option class="form-control">male</option>
				        	<option class="form-control">female</option>
				        </select>
				      </div>
				       
				      <div class="input-group input-group-lg">
				        <span class="input-group-addon"><i class="fa fa-envelope-o fa-fw"></i></span>
				      
				        <input type="text" name="username" class="form-control" placeholder="email">
				      </div>
					  <div class="input-group input-group-lg">
					  	 <span class="input-group-addon"><i class="fa fa-phone"></i></span>
					  	 
				         <input type="text" class="form-control" placeholder="Contact number">
					  </div>
					    <button type="submit" class="float">Sign Up</button>
			       </form>
		 	</div>
		 </div>
	</body>
</html>