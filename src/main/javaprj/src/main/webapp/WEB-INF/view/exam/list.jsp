<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>${p} page</div>
	<section>
	<h1>성적목록${name}</h1>
		<table>
	<caption>
		┌───────────────────────────────┐<br>
        │           성적출력              │<br>
        └───────────────────────────────┘<br>
	</caption>
			<thead>
				<tr>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>총점</th>
					<th>평균</th>
					<th>성적</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="exam" items = "${list}" begin="1">
				<tr>
					<td><a href="detail">${exam.name}</a></td>
					<td>${exam.kor}</td>
					<td>${exam.eng}</td>
					<td>${exam.math}</td>
					<td>${exam.total}</td>
					<td><fmt:formatNumber pattern = ".00" value=""/>${exam.avg}</td>
					<td></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</section>
	
	<section>
		<form>
			<fieldset>
				<legend>페이지입력</legend>
				<label>page</label><input name="p">
				
			
			</fieldset>
			<fieldset>
				<legend>좋아하는 색상</legend>
				<label><input name = "c" type="checkbox">빨강</label>
				<label><input name = "c" type="checkbox">파랑</label>
			</fieldset>
			
			<div>
				
				<button>전송</button>
			</div>
		</form>
	</section>
	
	<section>
		<form method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>파일업로드</legend>
				<label>파일선택<input style="display: none;" multiple type="file" name="img"></label>
				<button>업로드</button>
			</fieldset>
			
		</form>
	</section>
	
	
	<section>
		<div>
			<img src="/javaprj/upload/pigma.PNG">
		</div>
		
		<div>
			<a download href="/javaprj/upload/pigma.PNG">다운 </a>
		</div>
		
		<div>
		
		</div>
		
	</section>
	
	<nav id = "pager">
		<ul>
			<li><a href="?p=1&c="빨강">1</a></li>
			<li><a href="?p=2">2</a></li>
			<li><a href="?p=3">3</a></li>
			<li><a href="?p=4">4</a></li>
			<li><a href="?p=5">5</a></li>
		</ul>
	
	</nav>
	
	
</body>
</html>