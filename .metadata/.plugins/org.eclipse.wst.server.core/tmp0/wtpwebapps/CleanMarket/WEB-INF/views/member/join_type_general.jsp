<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="../include/header.jsp" />

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

<form action="<c:url value='/join_result'/>" name="signup" id="signUpForm" method="post">
	<input type="hidden" name="memType" id="mem_type" value="g">
	<input type="hidden" name="storeName" id="store_name" value=null>
	<div class="modal-content">
		<div class="modal-header">
			<h4 class="modal-title">
				<span style="color: #643691;">일반회원으로 가입하기</span>
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
					<td style="text-align: left">
						<p>
							<strong>주소 1 입력</strong>&nbsp;&nbsp;&nbsp;
							<span id="firadd"></span>
						</p>
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" id="sample6_postcode" placeholder="우편번호">
						<input type="button" onclick="sample6_execDaumPostcode()"
						value="우편번호 찾기"><br> <input type="text"
						id="sample6_address" placeholder="주소"><br> <input
						type="text" id="sample6_extraAddress" placeholder="참고항목">
						<input type="hidden" name="memFiradd" id="address" >

					</td>

				</tr>
				
				<tr>
					<td style="text-align: left">
						<p>
							<strong>주소 2 입력</strong>&nbsp;&nbsp;&nbsp;
							<span id="secadd"></span>
						</p>
					</td>
				</tr>
				<tr>
					<td>
						<input type="text" id="sample_postcode" placeholder="우편번호">
						<input type="button" onclick="sample_execDaumPostcode()" value="우편번호 찾기"><br> 
						<input type="text" id="sample_address" placeholder="주소"><br> 
						<input type="text" id="sample_extraAddress" placeholder="참고항목">
						<input type="hidden" name="memSecadd" id="address2" >
					</td>

				</tr>
				
				<tr>
					<td style="width: 100%; text-align: center; colspan: 2;">
					<input type="submit" value="회원가입" class="btn form-control tooltipstered" id="signup-btn"
						style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #388E3C; opacity: 0.8">
					</td>
				</tr>

			</table>
		</div>
	</div>
</form>

<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                   
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                document.getElementById("address").value = addr +' '+ extraAddr;
              
            }
        }).open();
    }
</script>

<script>
    function sample_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                   
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample_postcode').value = data.zonecode;
                document.getElementById("sample_address").value = addr;
                document.getElementById("address2").value = addr +' '+ extraAddr;
            }
        }).open();
    }
</script>

<jsp:include page="../include/footer.jsp" />