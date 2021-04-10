<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />
<br>
<br>


<div class="container" align="center">
	<div>
		<h2>MY PAGE</h2>
		<h5>${login.memName}님 안녕하세요</h5><hr>
		<input type="hidden" name="memNo" value="${login.memNo }">
		<input type="hidden" name="memID" value="${login.memID }">
	</div>

	<div class="container">
		<div class="row" style="padding-bottom: 10px">
			<div class="col">
				<a href="/cleanmarket/mypage/items/selling" role="button" class="btn btn-primary btn-lg"
					style="background-color: orange">판매내역</a>
			</div>
			<div class="col">
				<a href="#" role="button" class="btn btn-primary btn-lg"
					style="background-color: orange">구매내역</a>
			</div>
			<div class="col">
				<a href="#" role="button" class="btn btn-primary btn-lg"
					style="background-color: orange">관심목록</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<a href="#" role="button" class="btn btn-primary btn-lg"
					style="background-color: orange">&nbsp;&nbsp; 쿠폰 &nbsp;&nbsp;</a>
			</div>
			<div class="col">
				<a href="<c:url value='/mypage/modify' />" role="button" class="btn btn-primary btn-lg" 
					style="background-color: orange">정보수정</a>
			</div>
			<div class="col">
				<a href="/cleanmarket/mypage/qna_list" role="button" class="btn btn-primary btn-lg" 
					style="background-color: orange">&nbsp;&nbsp; Q&A &nbsp;&nbsp;</a>
			</div>
		</div>
	</div>
</div>
<br>

<jsp:include page="../include/footer.jsp" />