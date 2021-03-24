<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<div align="center">
	<br><br>
	<h2>회원가입 완료</h2>
	${memName} 님 환영합니다 <br><br>
	
	<a href="<c:url value='/'/> ">
	<button style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">
	크린마켓 이용하러 가기</button></a>
	

</div>

<jsp:include page="../include/footer.jsp" />