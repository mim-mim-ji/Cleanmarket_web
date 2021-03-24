<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<style>
header.masthead {
	display: none;
}

.btn-orange {
	background-color: orange;
	color: white;
}

.btn-izone {
	background-color: #643691;
	color: white;
}

.page-active {
	background-color: #643691;
}

.intro-table {
	background-color: #FFFFFF;
	width: 100%;
	border: 2px solid #23C293;
}

.intro-tr {
	width: 100%;
	border: .8px solid gray;
}

td>span {
	padding: 1px 3px;
}
</style>

<br>

<div class="container">
	<div class="row">
		<div class="container">
			<div>
				<h5 style="text-align: left;">방금 올라온 물품</h5>
			</div>
			<div style="padding-top: 10px; float: left;">전체</div>
			<div style="padding-bottom: 10px; float: right;">
				<select id="condition" class="form-control" name="condition">
					<option value="recent" selected>등록순</option>
					<option value="like">인기순</option>
					<option value="min_price">낮은가격순</option>
					<option value="max_price">높은가격순</option>
					<option value="comment">상품평 많은순</option>
					<option value="abc">이름순</option>
					<option value="descabc">이름역순</option>
				</select>
			</div>
		</div>
	</div>

	<!-- Member Grid -->

	<section class="bg-light" id="portfolio"
		style="padding-top: 40px; padding-bottom: 0;">
		<div class="container">

			<div class="row">
				<div class="col-md-4 col-sm-6 portfolio-item">
					<a class="portfolio-link" href="#">
						<div class="portfolio-hover">
							<div class="portfolio-hover-content"></div>
						</div> <img class="img-thumbnail img-fluid"
						src="https://cdn.imweb.me/thumbnail/20161229/586468cb9e57e.jpg">
					</a>
					<div class="portfolio-caption" align="left">
						<div class="item-detail" style="text-align: left;">
							<div class="itemInfo">
								<h5>
									<a class="itemTitle"
										href="<c:url value='/item/content/${b.itemNo}'/>"
										style="color: black">상품제목</a>
								</h5>
								<div class="item-detail">
									<p class="itemPrice" style="">44,000원</p>
								</div>
							</div>
							<div class="itemHeartCnt">
								<a href="#" style="border-radius: 0px; color: #404040"> <i
									class="far fa-heart">&nbsp; 0</i></a>
							</div>
						</div>
					</div>
				</div>

				
				
				<!-- 게시물이 들어갈 공간 -->
				<c:forEach var="b" items="${items}">

					<div class="col-md-4 col-sm-6 portfolio-item">
						<a class="portfolio-link" href="<c:url value='/item/content/${b.itemNo}' />">
							<div class="portfolio-hover">
								<div class="portfolio-hover-content"></div>
							</div> <img class="img-thumbnail img-fluid"
							src="https://cdn.imweb.me/thumbnail/20161229/586468cb9e57e.jpg" alt="">
						</a>
						<div class="portfolio-caption" align="left">
							<div class="item-detail" style="text-align: left;">
								<div class="itemInfo">
									<h5>
										<a style="margin-top: 0; height: 40px; color: orange;"
											href="<c:url value='/item/content/${b.itemNo}' />">
											${b.itemTitle} </a> &nbsp;
										<c:if test="${b.newMark}">
											<span class="badge badge-pill badge-danger">new</span>
										</c:if>
									</h5>
									<div class="item-detail">
										<p class="itemPrice" style="">${b.itemPrice}원</p>
									</div>
								</div>
								<div class="itemHeartCnt">
									<a href="#" style="border-radius: 0px; color: #404040"> 
									<i class="far fa-heart">&nbsp; ${b.itemHeartCnt }</i></a>
								</div>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</section>

</div>

