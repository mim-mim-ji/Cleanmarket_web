<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<br><br>
<div class="container" align="center">
	<div>
		<h2>판매내역</h2>
		<hr>
	</div>
	<div class="container">
		<div class="row" style="padding-bottom: 10px">
			<div class="col">
				<a href="/cleanmarket/mypage/items/selling" role="button" class="btn btn-primary btn-lg"
					style="background-color: gray ;">판매중</a>
			</div>
			<div class="col">
				<a href="/cleanmarket/mypage/items/reserve" role="button" class="btn btn-primary btn-lg"
					style="background-color: #3498DB;">예약중</a>
			</div>
			<div class="col">
				<a href="/cleanmarket/mypage/items/store" role="button" class="btn btn-primary btn-lg"
					style="background-color: gray">매장보관중</a>
			</div>
			<div class="col">
				<a href="/cleanmarket/mypage/items/complete" role="button" class="btn btn-primary btn-lg"
					style="background-color: gray">거래완료</a>
			</div>
		</div>
	</div>
</div>

<br>
<div class="container">
	<div class="card-body">
		<table class="table table-bordered table-hover">
			<thead>
				<tr
					style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">
					<th>#번호</th>
					<th>이미지</th>
					<th>판매상품명</th>
					<th>구매자아이디</th>
					<th>입금완료일자</th>
					<th>거래매장</th>
					<th>위탁상태</th>
				</tr>
			</thead>
			<!-- 상품목록이 들어갈 공간 -->
			<c:forEach var="item" items="${itemlist}">
				<c:if test="${item.itemState == '예약중' }">
					<tr style="color: #643691;">
						<td>${item.itemNo}</td>
						<td>
							이미지
						</td>

						<td><a href="<c:url value='/item/content/${item.itemNo}' />">${item.itemTitle}</a></td>
						
						<td>구매자아이디</td>

						<td>입금완료일자</td>
						
						<td>거래매장</td>

						<td>위탁상태</td>					
					</tr>
				</c:if>
			</c:forEach>
		</table>

	</div>
</div>

<jsp:include page="../include/footer.jsp" />
