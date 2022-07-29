<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Students of a Class</title>

</head>
<body >
<div id="page" >
	<jsp:include page="Left_list.jsp" />

	
		<div id="wrapper">

			<div id="header">
				<h3>Students of ${SUBJECT} class section ${SECTION} </h3>
			</div>
		</div>


		<div id="container">

			<div id="content">

				<table>

					<tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>

					</tr>

					<c:forEach var="tempStudent" items="${STUDENT_LIST}">
						<tr>
							<td>${tempStudent.id}</td>
							<td>${tempStudent.firstName}</td>
							<td>${tempStudent.lastName}</td>
							<td>${tempStudent.age}</td>
							<td>${tempStudent.aclass}</td>



						</tr>


					</c:forEach>

				</table>
			</div>
		</div>
	</div>

</body>
</html>
