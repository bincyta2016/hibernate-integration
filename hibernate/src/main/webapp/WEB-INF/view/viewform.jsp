<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Policy</title>
</head>
<body>
<h1>Policy Details</h1>
   <table border="1">
     <thead><tr><th>Policy Id<th>Policy Name</th><th>Category</th><th>Sum Assured</th><th>Premium</th><th>Tenure</th><th>Edit</th><th>Delete</th></tr></thead> 
   
     <tbody>
    
           <c:forEach var="policy" items="${list}">
           
           
         <tr>
	      <th scope="row">${policy.id}</th>  
		   <td>${policy.name}</td>  
		   <td>${policy.category}</td>  
		   <td>${policy.sum_assured}</td> 
		   <td>${policy.premium}</td> 
		   <td>${policy.tenure}</td>
		     
		   <td><a href="editPolicy/${policy.id}">Edit</a></td>  
		   <td><a href="deletePolicy/${policy.id}" onclick="if (!(confirm('Are you sure you want to delete this policy details?'))) return false">Delete</a></td>  
		   </tr>  
	       
	     </c:forEach>
	     
	      
     </tbody>
   </table>
   <a href="/hibernate/policyform">Add Policy</a>
   <a href="/hibernate">Go to Home</a>
   

</body>
</html>
