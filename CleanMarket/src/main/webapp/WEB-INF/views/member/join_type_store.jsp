<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<form action="<c:url value='/join/store_detail'/>" name="signup" id="signUpForm" method="post">
	<div class="modal-content">
		<div class="modal-header">
			<h4 class="modal-title">
				<span style="color: #643691;">가맹점주회원으로 가입하기</span>
			</h4>
		</div>
		<div class="modal-body">
			<table
				style="cellpadding: 0; cellspacing: 0; margin: 0 auto; width: 100%">
				<tr>
					<td style="text-align: left">
						<p>
							<strong>아이디를 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="idChk"></span>
						</p>
					</td>

				</tr>
				<tr>
					<td><input type="text" name="memID" id="mem_id"
						class="form-control tooltipstered" maxlength="14"
						required="required" aria-required="true"
						style="margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de"
						placeholder="숫자와 영어로 4-10자"></td>

				</tr>

				<tr>
					<td style="text-align: left">
						<p>
							<strong>비밀번호를 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="pwChk"></span>
						</p>
					</td>
				</tr>
				<tr>
					<td><input type="password" size="17" name="memPassword" id="mem_password"
						 class="form-control tooltipstered" maxlength="20"
						required="required" aria-required="true"
						style="ime-mode: inactive; margin-bottom: 25px; height: 40px; border: 1px solid #d9d9de"
						placeholder="영문과 특수문자를 포함한 최소 8자"></td>
				</tr>
				<tr>
					<td style="text-align: left">
						<p>
							<strong>비밀번호를 재확인해주세요.</strong>&nbsp;&nbsp;&nbsp;<span
								id="pwChk2"></span>
						</p>
					</td>
				</tr>
				<tr>
					<td><input type="password" size="17" name="memPassword_check" id="mem_password_check"
						 class="form-control tooltipstered" maxlength="20"
						required="required" aria-required="true"
						style="ime-mode: inactive; margin-bottom: 25px; height: 40px; border: 1px solid #d9d9de"
						placeholder="비밀번호가 일치해야합니다."></td>
				</tr>

				<tr>
					<td style="text-align: left">
						<p>
							<strong>이름을 입력해주세요.</strong>&nbsp;&nbsp;&nbsp;<span id="nameChk"></span>
						</p>
					</td>
				</tr>
				<tr>
					<td><input type="text" name="memName" id="mem_name"
						class="form-control tooltipstered" maxlength="6"
						required="required" aria-required="true"
						style="margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de"
						placeholder="한글로 최대 6자"></td>
				</tr>


				<tr>
					<td style="text-align: left">
						<p>
							<strong>연락처를 입력해주세요</strong>&nbsp;&nbsp;&nbsp;
							<span id="phone"></span>
						</p>
					</td>
				</tr>
				<tr>
					<td><input type="tel" name="memPhone" id="mem_phone"
						class="form-control tooltipstered" required="required"
						aria-required="true"
						style="margin-bottom: 25px; width: 100%; height: 40px; border: 1px solid #d9d9de">
					</td>
				</tr>
				
				<tr>
					<td style="width: 100%; text-align: center; colspan: 2;">
					<input type="submit" value="다음" 
						style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">
					</td>
				</tr>

			</table>
		</div>
	</div>
</form>

<jsp:include page="../include/footer.jsp" />