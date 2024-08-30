<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/revise.css">
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