<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/search.css">
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
    <section id="search" class="section"> <!-- class 추가 -->
        <h1>도서검색</h1>
        <form action="" method="post" class="search-form">
            <fieldset>
                <input type="hidden" name="action" value="search">
                <input class="search-txt" type="text" name="keyword" placeholder="조회할 책 이름 입력">
                <button class="search-btn" type="submit">검색</button>
            </fieldset>
        </form>
        <h2>검색 결과</h2>
        <c:if test="${not empty searchResult}">
            <table class="search-results">
                <tr>
                    <th>제목</th>
                    <th>저자</th>
                    <th>ISBN</th>
                    <th>대출여부</th>
                    <th>위치</th>
                </tr>
	            <c:forEach var="book" items="${searchResult}">
	                <tr>
	                    <td>${book.name}</td>
	                    <td>${book.writter}</td>
	                    <td>${book.ISBM}</td>
	                    <td>${book.state}</td>
	                    <td>1층</td>
	                </tr>
	            </c:forEach>
            </table>
        </c:if>
    </section>
</main>
</body>
</html>