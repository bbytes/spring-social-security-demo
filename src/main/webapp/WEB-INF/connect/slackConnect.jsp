<%@ taglib prefix="authz" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 <html>
 <head>
 </head>
 <body>
   <p>


<p>Please connect your local account with Slack</p>

<authz:authorize access="!hasRole('ROLE_USER_SLACK')">

 <form class="login"action="http://localhost:8080/connect/slack" method="POST">
	<p><input type="submit" value="Connect with Slack" /></p>
</form> 
</authz:authorize>

</body>
</html>

