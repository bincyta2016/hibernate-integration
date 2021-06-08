<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Add new policy</h1>
   <form:form method="post" action="/hibernate/editsave">    
        <table>
         <tr>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
        <tr>
        <td>Policy Name:</td>
        <td><form:input path="name"/></td>
        </tr>
        <tr>
				<td>Category:</td>
				<td><form:select path="category">
						<form:option value="life" label="life Inusrance"></form:option>
						<form:option value="Vehiche" label="Vehicle Insurance"></form:option>
						<form:option value="Health" label="Health Insurance"></form:option>
					</form:select></td>
		</tr>
        <tr>
        <td>Sum Assured:</td>
        <td><form:input path="sum_assured"/></td>
        </tr>
        <tr>
        <td>Premium:</td>
        <td><form:input path="premium"/></td>
        </tr>
        <tr>
        <td>Tenure:</td>
        <td><form:input path="tenure"/></td>
        </tr>
        <tr>    
          <td></td>    
          <td><input type="submit" value="Update" onclick="if (!(confirm('Are you sure?'))) return false"/></td>    
         </tr> 
         </table>
         </form:form>     
</body>
</html>