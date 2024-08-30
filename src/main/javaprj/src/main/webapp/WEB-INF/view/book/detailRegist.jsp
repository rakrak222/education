<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/regist.css">
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
<main>
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
</main>
</body>
</html>