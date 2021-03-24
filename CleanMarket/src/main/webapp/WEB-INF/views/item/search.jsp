<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />
 <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
 
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

<div align="center" class="container" style="width: 40%">
	<form action="<c:url value='/search' />">
		<input type="text" name="keyword" placeholder="${keyword }"
			style="width: 90%; padding-left: 10px; height: 40px"> &nbsp;
		<button type="submit" style="background: transparent; border: none">
			<i class="fas fa-search" id="search-btn"
				style="height: 40px; color: green"></i>
		</button>
	</form>
</div>


 <%@ include file="../include/location_modal.jsp" %>
<jsp:include page="../include/footer.jsp" />