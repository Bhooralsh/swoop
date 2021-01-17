<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<head>
<title>ATM Overages</title>

<spring:url value="/resources/core/css/hello.css" var="coreCss" />
<spring:url value="/resources/core/css/bootstrap.min.css"

	var="bootstrapCss" />
<link href="${bootstrapCss}" rel="stylesheet" />
<link href="${coreCss}" rel="stylesheet" />
</head>

<spring:url value="/" var="urlHome" />
<spring:url value="/users/add" var="urlAddUser" />
 <spring:url value="/users/openRecord" var="openEntriesURL" /> 
 <spring:url value="/users/closeRecord" var="closeEntriesURL" /> 


<nav class="navbar navbar-inverse ">
	<div class="container1">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">List Of Atm Overages</a>
		</div>
		<div class="container1">
		<div class="navbar-header">
			<a class="navbar-brand" href="${openEntriesURL}">Open</a>
		</div>
		
		<div class="container1">
		<div class="navbar-header">
			<a class="navbar-brand" href="${closeEntriesURL}">Closed</a>
		</div>
		
		
		
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlAddUser}">New Overage</a></li>
			</ul>
		</div>
		 <div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlEditUser}">edit entry</a></li>
			</ul>
		</div>
		 
		
	</div>
</nav>