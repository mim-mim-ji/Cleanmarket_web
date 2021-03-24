<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<div>
	<div align="right" style="background-color: white; margin-top: 20px; height: 30px; opacity: 0.8;">
		<div class="container">
			<a href="<c:url value='item/write'/>" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-pen">&nbsp; 판매하기</i></a>&nbsp; &nbsp;
			<c:if test="${location==null }">
				<a data-toggle="modal" data-target="#location" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-map-marker-alt">&nbsp;희망거래지역</i></a>
			</c:if>
			<c:if test="${location!=null }">
				<a data-toggle="modal" data-target="#location" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-map-marker-alt">&nbsp;${location}</i></a>&nbsp; &nbsp;
				<a href="<c:url value='/cleanmarket/reset'/>" style="border-radius: 0px; color: #404040; margin-top: 20px;"><i class="fas fa-redo">&nbsp; 재설정</i></a>
			</c:if>
		</div>
			
	</div>
</div>

<div class="owl-item" style="width: 100%">
	<div class='item holder section '
		style='background-image: url(https://cdn.imweb.me/thumbnail/20210224/9bca30e69d209.jpg); background-color: #dddddd; background-repeat: no-repeat; background-size: cover; background-position: 50% 50%;'>
		<div class='op _op' style='position: relative; z-index: 11;'>
			<div class='header-content _visual_height m_ratio'>
				<div class='text _text_wrap'>
					<div class='text-wrap _text fr-view'>
						<h1 style="text-align: center;">
							<br>
						</h1>
						<h1 style="text-align: center;">
							<span style="font-size: 30px; color: white;">크린마켓에서는&nbsp;</span><span
								style="font-size: 30px; color: white;">비대면 중고거래 가능</span>
						</h1>
						<p style="text-align: center;">
							<br>
						</p>
						<h6 style="text-align: center;">
							<span style="font-size: 20px;color: white;">희망 거래 지역 설정하고 중고거래 하자!</span>
						</h6>
						<p>
							<br>
						</p>
						<p>
							<br>
						</p>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


 <%@ include file="../include/location_modal.jsp" %>
 
 <jsp:include page="../item/list.jsp" />