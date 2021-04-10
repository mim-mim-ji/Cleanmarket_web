<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<style>
header.masthead {
	display: none;
}
</style>

<div>
	<div align="right"
		style="background-color: white; margin-top: 20px; height: 30px; opacity: 0.8;">
		<div class="container">
			<a href="<c:url value='/item/write'/>"
				style="border-radius: 0px; color: #404040; margin-top: 20px;"><i
				class="fas fa-pen">&nbsp; 판매하기</i></a>&nbsp; &nbsp;
			<c:if test="${location == null }">
				<a data-toggle="modal" data-target="#location"
					style="border-radius: 0px; color: #404040; margin-top: 20px;"><i
					class="fas fa-map-marker-alt">&nbsp;희망거래지역</i></a>
			</c:if>
			<c:if test="${location != null }">
				<a data-toggle="modal" data-target="#location"
					style="border-radius: 0px; color: #404040; margin-top: 20px;"><i
					class="fas fa-map-marker-alt">&nbsp;${location}</i></a>&nbsp; &nbsp;
				<a href="<c:url value='/cleanmarket/reset'/>"
					style="border-radius: 0px; color: #404040; margin-top: 20px;"><i
					class="fas fa-redo">&nbsp; 재설정</i></a>
			</c:if>
		</div>

	</div>
</div>
<br>

<div class="container">

	<div class="row">
		<div class="col-lg-12">
			<div class="card">
				<div class="card-header text-white"
					style="background-color: #643691;">카테고리 >
					${item.itemCategory}</div>

				<div class="container">
					<div class="card-body" style="float: left;">
						<a class="portfolio-link"> <img
							class="img-thumbnail img-fluid"
							style="width: 500px; height: auto;"
							src="https://cdn.imweb.me/thumbnail/20161229/586468cb9e57e.jpg">
						</a>
					</div>

					<div class="card-body">
						<div class="portfolio-caption" align="left">
							<div class="item-detail" style="text-align: left;">
								<div class="itemInfo">
									<h2>
										<a style="margin-top: 0; height: 40px; color: black;">
											${item.itemTitle} </a> &nbsp;
									</h2>
									<div style="font-size: x-large;">${item.itemPrice}원</div>
									<div>
										<c:if test="${item.itemPriceOption=='y'}">
											<h5>
												<span class="badge badge-success">가격협의가능</span>
											</h5>
										</c:if>
										<c:if test="${item.itemPriceOption=='n'}">
											<h5>
												<span class="badge badge-danger">가격협의불가능</span>
											</h5>
										</c:if>
									</div>
									<div>판매자 아이디: ${member.memID}</div>
									<div>
										<span>거래지역 1: ${item.itemFiradd}</span><br>
										<c:if test="${item.itemSecadd!='null'}">
											<span>거래지역 2: ${item.itemSecadd}</span>
										</c:if>
									</div>
									<div>등록일 : ${item.itemRegdate }</div>
								</div>


								<div>
									조회수: ${item.itemViewCnt } &nbsp;
									<a style="border-radius: 0px; color: #404040" href="#"
										id="itemHeartCnt"> <i class="far fa-heart">&nbsp;
											${item.itemHeartCnt}</i></a>											
								</div>

								<div><strong>${item.itemState }</strong></div>
								
							</div>
						</div>
						<hr>

						<form id="formObj" role="form"
							action="<c:url value='/item/delete'/>" method="post">

							<input type="hidden" name="itemNo" id="itemNo"
								value="${item.itemNo}" />
							<!-- 로그인한 회원의 memNo -->
							<input type="hidden" name="memNo" id="memNo"
								value="${login.memNo}" />

							<c:if test="${login.memNo != item.memNo}">
								<input type="button" value="연락하기" class="btn" id="chat-btn"
									style="background-color: green; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;
								
								<input type="button" value="구매하기" class="btn" id="buy-btn"
									style="background-color: orange; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;
														
							</c:if>

							<input type="button" value="목록" class="btn" id="list-btn" onClick="history.go(-1)"
								style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;

							<c:if test="${login.memNo == item.memNo}">

								<input type="button" value="수정" class="btn" id="modBtn"
									style="background-color: orange; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;
	          
	          					<input type="submit" value="삭제" class="btn"
									onclick="return confirm('정말로 삭제하시겠습니까?')"
									style="background-color: red; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;
												
        					</c:if>
						</form>
					</div>
				</div>
				<hr>
				<div class="container">
					<div class="card-body">
						<div>
							<h5>상품 상세정보</h5>
							<span>${item.itemContent }</span>
						</div>
					</div>
				</div>
				<hr>
				<div class="container">
					<div class="card-body">
						<h5>Q&A</h5>
						<span style="font-size: small;">상품에 대해 궁금한 점이 있으면 문의주세요</span> <br>

						<table class="table table-bordered table-hover">
							<thead>
								<tr
									style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">
									<th>#번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>작성일자</th>
								</tr>
							</thead>
							<!-- qna목록이 들어갈 공간 -->
							<c:forEach var="qna" items="${qnalist}">
								<c:if test="${qna.qnaNo!=null}">
									<tr style="color: #643691;">
										<td>${qna.qnaNo}</td>
										<td>
											<c:choose>
												<c:when test="${login.memID == qna.qnaWriter || login.memNo == item.memNo}">
													<a href="<c:url value='/qna/detail/${qna.qnaNo}'/>"
														style="margin-top: 0; height: 40px; color: orange;">
														${qna.qnaTitle}</a> &nbsp; 
												</c:when>
												<c:otherwise>
													<a href="#" onclick="alert('비밀글입니다'); return false;"
														style="margin-top: 0; height: 40px; color: orange;">
														${qna.qnaTitle}</a> &nbsp; 
												</c:otherwise>
											</c:choose>
											<c:if test="${qna.qnaHidden=='y'}">
												<i class="fas fa-lock"></i>
											</c:if>
											
										</td>

										<td>${qna.qnaWriter}</td>

										<td><fmt:formatDate value="${qna.qnaRegdate}"
												pattern="yyyy년 MM월 dd일 a hh:mm" /></td>
									</tr>
								</c:if>								
							</c:forEach>							
						</table>

						<br>
						<form action="<c:url value='/qna/write'/>" id="qnaform">
							<input type="hidden" name="itemNo" id="itemNo"
								value="${item.itemNo}" /> <input type="button" value="글쓰기"
								class="btn" id="qna-btn"
								style="background-color: olive; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script>
	const message = "${msg}";
	if (message == "modSuccess") {
		alert("수정이 완료되었습니다");
	}

	//제이쿼리의 시작
	$(function() {

		const formElement = $("#formObj");

		//수정 버튼 클릭 이벤트
		const modifyBtn = $("#modBtn");
		modifyBtn.click(function() {
			console.log("수정 버튼이 클릭됨!");

			//폼의 속성 변경
			formElement.attr("action", "/cleanmarket/item/modify");
			formElement.attr("method", "get");
			formElement.submit();

		})
		
		/*
		//목록 버튼 클릭 이벤트
		const listbtn = $('#list-btn');
		listbtn.click(function() {
			location.href="/cleanmarket/";
		})
		*/
		
		//하트버튼 클릭 이벤트
		const itemHeartCnt = $('#itemHeartCnt');
		
		itemHeartCnt.click(function () {
			if(${login == null }){
				alert("로그인 먼저 해주세요");
				location.href="/cleanmarket/login";
			}else{
				
				//memNo 정보
	    		const memNo = $('#memNo').val();
	    		//itemNo 정보
	    		const itemNo = $('#itemNo').val();

				const heart = {
		    			memNo : memNo,
		    			itemNo : itemNo
		    	};
				
				$.ajax({
					url: "/cleanmarket/item/itemHeartCntUpdate",
	                type: "POST",
	                headers: {
	    				"Content-type" : "application/json"
	    			},
	    			dataType: "text",
	    			data: JSON.stringify(heart), //자바스크립객체를 json으로 변환
	                success: function (result)  {
						
						if(result === "delete"){
							console.log("기존 하트 제거");
							
						}else if(result === "insert"){
							console.log("DB저장 성공");
						}
					},
					error: function() {
						console.log("통신 실패");
					}
				});//ajax끝
			}
		})
		
		
		//글쓰기 버튼 클릭 이벤트
		const qnaBtn = $("#qna-btn");
		qnaBtn.click(function() {
			console.log("글쓰기 버튼이 클릭됨!");
			if(${login == null }){
				alert("로그인 먼저 해주세요");
				location.href="/cleanmarket/login";
			}else{
				$("#qnaform").submit();
			}
		})
		
		
		//qna 제목 클릭시 비밀글일때 처리
		$("#qnaHidden-chk").click(function () {
			console.log("비밀글클릭");
			if(${login.memName != qna.qnaWriter}){
				alert("비밀글입니다");
				
			}
				
		})
		
		
		
	});  //제이쿼리의 끝
	
	
</script>


<jsp:include page="../include/footer.jsp" />