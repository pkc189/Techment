<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

form{
display:flex;
flex-direction: column;
width:30%;
margin-top:5px


}

</style>

</head>
<body>






	<form action="login.jsp">
		<input type="text" name="u" placeholder="username"> <input
			type="password" name="p" placeholder="password"> <input
			type="submit" value="submit">
	</form>



<%

String username = request.getParameter("u");
String password = request.getParameter("p");


try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("class found");

	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:5000/user?autoReconnect=true&useSSL=false", "root", "Bodygaurd@2013");


	
	System.out.println("Connected");
	
	String n=request.getParameter("userName");  
	String p=request.getParameter("userPass");  
	
	
	Statement stmt = con.createStatement();

	PreparedStatement ps=con.prepareStatement(  
			"SELECT * FROM user.registeruser where NAME=? AND PASS=?");  
			  
			ps.setString(1,n); 
			ps.setString(2,n); 

			ResultSet rs=ps.executeQuery();  
			 if(rs.next())
			 {
				 out.print("Login Succesfull");  
			 }
	
			else
				out.print("Your are not registered, Please do registser <a href='register.html'>register</a>");  

} catch (Exception e) {
	e.printStackTrace();
}




%>



</body>
</html>