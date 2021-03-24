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
	<div align="right" style="background-color: white; margin-top: 20px; height: 30px; opacity: 0.8;">
		<div class="container">
			<a href="<c:url value='item/write'/>" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-pen">&nbsp; 판매하기</i></a>&nbsp; &nbsp;
			<c:if test="${location == null }">
				<a data-toggle="modal" data-target="#location" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-map-marker-alt">&nbsp;희망거래지역</i></a>
			</c:if>
			<c:if test="${location != null }">
				<a data-toggle="modal" data-target="#location" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-map-marker-alt">&nbsp;${location}</i></a>&nbsp; &nbsp;
				<a href="<c:url value='/cleanmarket/reset'/>" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-redo">&nbsp; 재설정</i></a>
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
					style="background-color: #643691;">카테고리 > ${item.itemCategory}</div>

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
									<div style="font-size: x-large;">
										${item.itemPrice}원
									</div>
									<div>
										<c:if test="${item.itemPriceOption=='y'}">
											<h5><span class="badge badge-success">가격협의가능</span></h5>
										</c:if>
										<c:if test="${item.itemPriceOption=='n'}">
											<h5><span class="badge badge-danger">가격협의불가능</span></h5>
										</c:if>
									</div>
									<div>
										<span>거래지역 1: ${item.itemFiradd}</span><br>
										<c:if test="${not empty item.itemSecadd}">
											<span>거래지역 2: ${item.itemSecadd}</span>
										</c:if>
									</div>
									<div>등록일 : ${item.itemRegdate }</div>
								</div>
								<div class="itemHeartCnt">
									<a href="#" style="border-radius: 0px; color: #404040"> <i
										class="far fa-heart">&nbsp; ${item.itemHeartCnt }</i></a>
								</div>
								<div>조회수: ${item.itemViewCnt }</div>
							</div>
						</div>
						<hr>

						<form id="formObj" role="form"
							action="<c:url value='/item/delete'/>" method="post">

							<input type="hidden" name="itemNo" value="${item.itemNo}" /> <input
								type="button" value="목록" class="btn" id="list-btn"
								onClick="history.go(-1)"
								style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;

							<c:if test="${login.memNo == item.memNo}">

								<input type="button" value="수정" class="btn" id="modBtn"
									style="background-color: orange; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">&nbsp;&nbsp;
	          
	          			<input type="submit" value="삭제" class="btn" href="#"
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

		//변수 선언 : 타입이 없음
		//변수는 let, 상수는 const로 선언(ES6 -> 2015)
		//const formElement = document.getElementById("formObj") -> 자바스크립트 사용시
		const formElement = $("#formObj");

		//수정 버튼 클릭 이벤트
		const modifyBtn = $("#modBtn");
		modifyBtn.click(function() {
			console.log("수정 버튼이 클릭됨!");

			//폼의 속성 변경
			formElement.attr("action", "/item/modify");
			formElement.attr("method", "get");
			formElement.submit();

		})

	}); //제이쿼리의 끝
</script>


<jsp:include page="../include/footer.jsp" />