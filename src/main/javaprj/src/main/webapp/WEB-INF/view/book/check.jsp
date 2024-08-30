<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/check.css">
</head>

<body>
<header class="main-header">
    <h1><a href="list">도서관</a></h1>
    <nav>
        <ul>
            <li><a href="regist">도서등록</a></li>
            <li><a href="check">도서조회</a></li>
            <li><a href="search">도서검색</a></li>
            <li><a href="revise">도서수정</a></li>
        </ul>
    </nav>
</header>
<main class="main-content">
    <section id="check" class="section"> <!-- class 추가 -->
        <h1>도서조회</h1>
        <table class="book-table">
            <tr>
                <th>제목</th>
                <th>저자</th>
                <th>ISBN</th>
                <th>대출여부</th>
                <th>위치</th>
            </tr>
            <c:forEach var="book" items="${list}">
                <tr>
                    <td>${book.name}</td>
                    <td>${book.writter}</td>
                    <td>${book.ISBM}</td>
                    <td>${book.state}</td>
                    <td>1층</td>
                </tr>
            </c:forEach>
        </table>
    </section>
</main>
</body>
</html>