<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Startmin - Bootstrap Admin Theme</title>

<!-- Bootstrap Core CSS -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="resources/css/metisMenu.min.css" rel="stylesheet">

<!-- Timeline CSS -->
<link href="resources/css/timeline.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="resources/css/startmin.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="resources/css/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="resources/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">

			<ul class="nav navbar-nav navbar-left navbar-top-links">
				<li><a href="#"><i class="fa fa-home fa-fw"></i> EPM TOOL</a></li>
			</ul>

			<ul class="nav navbar-right navbar-top-links">

				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						UserName<b class="caret"></b>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> User
								Profile</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i>
								Logout</a></li>
					</ul></li>
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<span class="input-group-btn">
									<button class="btn btn-primary" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div>
						</li>
						<li><a href="home" class="active"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a></li>
						<li><a href="newTask"><i class="fa fa-edit fa-fw"></i> New Task</a></li>
						<li><a href="taskDetails"><i class="fa fa-edit fa-fw"></i> Task Details</a></li>								
						<li><a href="#"><i class="fa fa-files-o fa-fw"></i>Contact Us</span></a></li>
					</ul>
				</div>
			</div>
		</nav>

		<div id="page-wrapper">
		<div class="row">
		<div class="col-md-12">
					<h3 class="page-header" style="text-align: center;">TASK DETAILS</h3>
				</div>
			<div class="col-md-12" style="border: 1px tdin rgb(86, 180, 239); box-shadow: 0px 1px 3px #B7B2B2 inset, 0px 0px 8px #B7B2B2; overflow-x: auto;">
			<br>
				<table class="table table-bordered" style="font-size: 13.5px;">
					<thead>
						<tr style="background-color: #1a2732;">
							<th style="width: 5%"><font color="white">TASK NO.</font></th>
							<th style="width: 5%"><font color="white">OWNER_ID</font></th>
							<th style="width: 8%"><font color="white">TASK NAME </font></th>
							<th style="width: 16%"><font color="white">TASK DESC</font></th>
							<th style="width: 8%"><font color="white">TASK STATUS</font></th>
							<th style="width: 8%"><font color="white">TASK TYPE</font></th>
							<th style="width: 8%"><font color="white">START DATE</font></th>
							<th style="width: 8%"><font color="white">COMMIT DATE</font></th>
							<th style="width: 8%"><font color="white">END DATE</font></th>
							
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${task}" var="taskDetails">
					    <tr>
					        <td>${taskDetails.id}</td>
							<td>${taskDetails.ownerUserId}</td>
							<td>${taskDetails.taskName}</td>
							<td>${taskDetails.taskDescription}</td>
							<td>${taskDetails.taskStatus}</td>
							<td>${taskDetails.taskType}</td>
							<td>${taskDetails.taskStartDate}</td>
							<td>${taskDetails.taskCommitDate}</td>
							<td>${taskDetails.taskClosedDate}</td> 
					    </tr>
						</c:forEach>
					</tbody>
				</table>
		</div>
		</div>
		</div>
	</div>
	</div>
	<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="resources/js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="resources/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="resources/js/metisMenu.min.js"></script>

	<!-- Morris Charts JavaScript -->
	<script src="resources/js/raphael.min.js"></script>
	<script src="resources/js/morris.min.js"></script>
	<script src="resources/js/morris-data.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="resources/js/startmin.js"></script>

</body>
</html>
