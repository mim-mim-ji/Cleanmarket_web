<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- 검색 Modal-->
<div class="modal fade" id="search">
	<div class="modal-dialog">
		<div class="modal-content" >			
			<form action="<c:url value='/search' />">			
				<input type="text" name="keyword" placeholder="검색어를 입력하세요"  
				style="width: 90%; padding-left: 10px; height: 50px"> &nbsp;
				<button type="submit" style="background: transparent; border: none">
					<i class="fas fa-search" id="search-btn" style="height: 30px; color: green; "></i>
				</button>	
			</form>	
		</div>
	</div>
</div>

