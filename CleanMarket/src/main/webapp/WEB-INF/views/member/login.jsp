<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<br>

<div class="modal-body">

	<form method="post" name="signInForm" style="margin-bottom: 0;">
		<table
			style="cellpadding: 0; cellspacing: 0; margin: 0 auto; width: 70%">
			<tr>
				<td style="text-align: left">
					<p>
						<strong>아이디를 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="idCheck"></span>
					</p>
				</td>
			</tr>
			<tr>
				<td><input type="text" name="memID" id="signInId"
					class="form-control tooltipstered" maxlength="14"
					
					style="margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de"
					placeholder="최대 14자"></td>
			</tr>
			<tr>
				<td style="text-align: left">
					<p>
						<strong>비밀번호를 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="pwCheck"></span>
					</p>
				</td>
			</tr>
			<tr>
				<td><input type="password" name="memPassword" id="signInPw" 
					size="17" maxlength="20"class="form-control tooltipstered"
					maxlength="20"  
					style="ime-mode: inactive; margin-bottom: 25px; height: 40px; border: 1px solid #d9d9de"
					placeholder="최소 8자"></td>
			</tr>

			<!-- 자동 로그인 체크박스 -->
			<tr>
				<td><input type="checkbox" id="auto-login" name="autoLogin">
					자동로그인<br></td>
			</tr>			

			<tr>
				<td style="width: 100%; text-align: center; colspan: 2;">
				<input
					type="submit" value="로그인" class="btn form-control tooltipstered" id="signIn-btn"
					style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">
				</td>
			</tr>
			<tr>
				<td style="width: 100%; text-align: center; colspan: 2;">
				<input
					type="button" value="회원가입" class="btn form-control tooltipstered" id="signUp-btn"
					style="background-color: orange; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">
				</td>
			</tr>
			<tr>
				<td style="padding-top: 10px; text-align: center">
					<p>
						<strong><a href="#">아이디/비밀번호 찾기</a></strong>
					</p>
				</td>
			</tr>

		</table>
	</form>
</div>

<script>

	const message = "${msg}";
	if (message == "loginnull") {
		alert("로그인 먼저 해주세요");
		location.href="<c:url value='/login'/>";
	}

	//로그인 요청시 DB와 비교한 확인값
	const result = "${msg}";
	if (result == "loginSuccess") {
		location.href = "/cleanmarket";
	} else if (result == "pwFail") {
		alert("비밀번호가 틀렸습니다");
	} else if (result == "idFail") {
		alert("일치하는 아이디가 없습니다");
	}

	//로그인 버튼 클릭 이벤트
	$('#signIn-btn').click(function() {

		if ($("#signInId").val() == "") {

		} else {
			// /login매핑
			formElement.attr("action", "/login");
			formElement.submit();
		}
	})

	//사용자가 회원가입 버튼을 눌렀을 때 이벤트 처리
	$('#signUp-btn').click(function() {
		console.log("회원가입 버튼이 클릭됨!");
		location.href = "/cleanmarket/join_type_select";
	})
</script>



<jsp:include page="../include/footer.jsp" />