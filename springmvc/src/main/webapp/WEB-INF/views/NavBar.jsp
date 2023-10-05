<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>

<style type="text/css">
fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: white;
	background-color: #333;
}

ul {
	list-style-type: none;
	background-color: black;
	overflow: hidden;
	background-color: #333;
}

li {
	float: right;
}

li a {
	display: block;
	margin: 0px;
	padding: 15px;
}

li a:hover {
	background-color: #111;
}
</style>
<meta charset="UTF-8">
</head>
<body>
        
	<ul>
		<li><a style="color: white;" href="./logout">Logout</a></li>
		<li><a style="color: white;" href="./search">Search Student</a></li>
		<li><a style="color: white;" href="./add">Add Student</a></li>
		<li><a style="color: white;" href="./update">Update Student</a></li>
		<li><a style="color: white;" href="./remove">Remove Student</a></li>
		<li><a style="color: white;" href="./home">Home</a></li>
	</ul>
</body>
</html>