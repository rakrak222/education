<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서관</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/styles.css">
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
    <section id="regist" class="section"> <!-- class 추가 -->
        <h1>도서등록</h1>
        <form action="" method="post" class="book-form">
            <input type="hidden" name="action" value="register">
            <label for="name">제목:</label>
            <input type="text" id="name" name="name" required class="text-input">

            <label for="writter">저자:</label>
            <input type="text" id="writter" name="writter" required class="text-input">

            <label for="ISBM">ISBM:</label>
            <input type="text" id="ISBM" name="ISBM" required class="text-input">

            <button type="submit" class="submit-button">제출</button>
        </form>
    </section>

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
    
    <section id="search" class="section"> <!-- class 추가 -->
        <h1>도서검색</h1>
        <form action="list" method="post" class="search-form">
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
                <tr>
                    <td>${searchResult.name}</td>
                    <td>${searchResult.writter}</td>
                    <td>${searchResult.ISBM}</td>
                    <td>${searchResult.state}</td>
                    <td>1층</td>
                </tr>
            </table>
        </c:if>
    </section>
    
    <section id="revise" class="section revise-section"> <!-- class 추가 -->
        <h1>도서수정</h1>
        <form action="" method="post" class="revise-form">
            <input type="hidden" name="action" value="revise">
            <label for="bookName">수정할 도서 제목:</label>
            <input type="text" id="bookName" name="bookName" required class="text-input">
            
            <label for="attribute">수정할 항목:</label>
            <select name="attribute" id="attribute">
                <option value="name">제목</option>
                <option value="writter">저자</option>
                <option value="ISBM">ISBM</option>
            </select>
            
            <label for="newValue">새로운 값:</label>
            <input type="text" id="newValue" name="newValue" required class="text-input">
            
            <button type="submit" class="submit-button">수정</button>
        </form>
    </section>
</main>
</body>
</html>
