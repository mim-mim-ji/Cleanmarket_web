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
<br/>
<br/>

<div class="container">

<div class="row">
  <div class="col-lg-12">
    <div class="card">
      <div class="card-header text-white" style="background-color: #643691;">Q&A 수정</div>
      <div class="card-body">

        <form role="form" method="post">

        	<input type="hidden" name="itemNo" value="${itemNo}" />
        
          <div class="form-group">
            <label>작성자</label>
            <input type="text" class="form-control" name="qnaWriter" value="${login.memID}" readonly>
          </div>
          
          <div class="form-group">
            <label>제목</label>
            <input type="text" class="form-control" name="qnaTitle" placeholder="${qna.qnaTitle }"
            value="${qna.qnaTitle}">
          </div>

          <div class="form-group">
            <label>내용</label>
            <textarea class="form-control" rows="5" name="qnaContent" required>${qna.qnaContent }</textarea>
          </div>

		 <input type="checkbox" id="qnaHidden" name="qnaHidden" checked>&nbsp; 비밀글 설정<br>
			
        <input class="btn" type="submit" value="수정" style="background-color: orange; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8"/>
          
          <a class="btn" href="/cleanmarket/qna/detail/${qna.qnaNo}"
		style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">취소</a>&nbsp;&nbsp;
          
        
        </form>

      </div>
    </div>
  </div>
</div>
</div>



<jsp:include page="../include/footer.jsp" />
