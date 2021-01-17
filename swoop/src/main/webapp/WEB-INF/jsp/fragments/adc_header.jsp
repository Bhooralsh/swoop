<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page isELIgnored="false"%>
					
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 
	
  
<!DOCTYPE html>
<html lang="en">
<title>ATM OverAges JS BANK</title>


<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<spring:url value="/resources/core/css/w3.css" var="css1" />
<spring:url value="/resources/core/css/css.css" var="css2" />
<spring:url value="/resources/core/css/css1.css" var="css3" />
<spring:url value="/resources/core/css/font-awesome.min.css" var="css4" />
<link href="${css1}" rel="stylesheet" />
<link href="${css2}" rel="stylesheet" />
<link href="${css3}" rel="stylesheet" />
<link href="${css4}" rel="stylesheet" />

<spring:url value="/users" var="urlHome" />
<spring:url value="/" var="Home" />
<spring:url value="/users/add" var="urlAddUser" />
 <spring:url value="/users/openRecord" var="openEntriesURL" /> 
 <spring:url value="/users/closeRecord" var="closeEntriesURL" /> 
<spring:url value="/users/revert" var="revertURL" /> 
<spring:url value="/users/super/close" var="superURL" /> 

<style>
body,h1,h2,h3,h4,h5,h6 {font-family: "Lato", sans-serif}
.w3-bar,h1,button {font-family: "Montserrat", sans-serif}
.fa-anchor,.fa-coffee {font-size:200px}
</style>
<body>

<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-red w3-card w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-red" href="javascript:void(0);" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
    <a href="${Home}" class="w3-bar-item w3-button w3-padding-large w3-white">Home</a>
    
       
   

 
     
    <%--  <a href="${superURL}" class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">New OpenOverage</a> --%>
   
  </div>
  

  
</div>

<!-- Header -->
<header class="w3-container w3-red w3-center" style="padding:20px 16px">
 </header>
