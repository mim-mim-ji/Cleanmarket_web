<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<br><br>
<div class="container" align="center">
	<div>
		<h2>Q&A</h2>
		<hr>
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
					<th>상품이미지</th>
					<th>제목</th>
					<th>댓글수</th>
					<th>작성일자</th>
				</tr>
			</thead>

			<!-- 상품목록이 들어갈 공간 -->
			<c:forEach var="qna" items="${qnalist}">
				<tr style="color: #643691;">
					<td>${qna.qnaNo}</td>

					<td><a href="<c:url value='/item/content/${qna.itemNo}' />">상품이미지</a>
					</td>

					<td><a href="<c:url value='/qna/detail/${qna.qnaNo}' />">${qna.qnaTitle }</a>
						<c:if test="${qna.qnaHidden=='y'}">
							<i class="fas fa-lock"></i>
						</c:if></td>

					<td>댓글수</td>

					<td>${qna.qnaRegdate }</td>

				</tr>
			</c:forEach>
		</table>

	</div>
</div>

<jsp:include page="../include/footer.jsp" />
