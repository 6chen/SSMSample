<%--
  Created by IntelliJ IDEA.
  User: YUSIN
  Date: 9/22/15
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h3>Employee Information</h3>
		<hr/>
		<table class="table table-hover">
			<thead>
				<td>EMPNO</td>
				<td>ENAME</td>
				<td>JOB</td>
				<td>MGR</td>
				<td>HIREDATE</td>
				<td>SAL</td>
				<td>COMM</td>
				<td>DEPTNO</td>
			</thead>
			<tbody>
				<c:forEach varStatus="i" var="emp" items="${empList}">
					<tr>
						<td>${emp.empNo}</td>
						<td>${emp.eName}</td>
						<td>${emp.job}</td>
						<td>${emp.mgr}</td>
						<td>${emp.hireDate}</td>
						<td>${emp.sal}</td>
						<td>${emp.comm}</td>
						<td>${emp.deptNo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="/js/jquery-2.1.4.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</body>
</html>
