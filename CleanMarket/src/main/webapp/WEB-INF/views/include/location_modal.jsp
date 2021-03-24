<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!-- 검색 Modal-->
<div class="modal fade" id="location">
	<div class="modal-dialog">
		<div class="modal-content" >
			<form action="<c:url value='/location'/>" style="width: 100%; padding-top: 10px; height: 100px">
				<table>
					<tr>
						<td style="text-align: center; width: 100%">
							<p>
								<input type="text" id="sample6_address" placeholder="도로명 주소" style="width: 60%">
								<input type="text" id="sample6_extraAddress" placeholder="동네명" style="width: 20%">
								<input type="button" onclick="sample6_execDaumPostcode()" value="검색" style="width: 10%;"> 
								<input type="hidden" name="location" id="address">
							</p>
						</td>
					</tr>
					<tr>
						<td style="text-align: center;">
							<button type="submit" id="location-btn">확인</button>
							<input type="button"  value="초기화" id="reset_location">
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
</div>

<script>


	//초기화 버튼 클릭 이벤트
	$('#reset_location').click(function() {
		document.getElementById("sample6_address").value = null;
		document.getElementById("sample6_extraAddress").value = null;
		document.getElementById("address").value = null;
	})
	

	function sample6_execDaumPostcode() {
		new daum.Postcode(
				{
					oncomplete : function(data) {
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
						if (data.userSelectedType === 'R') {
							// 법정동명이 있을 경우 추가한다. (법정리는 제외)
							// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
							if (data.bname !== ''
									&& /[동|로|가]$/g.test(data.bname)) {
								extraAddr += data.bname;
							}
							// 건물명이 있고, 공동주택일 경우 추가한다.
							if (data.buildingName !== ''
									&& data.apartment === 'Y') {
								extraAddr += (extraAddr !== '' ? ', '
										+ data.buildingName : data.buildingName);
							}
							
							//읍면동
							if(data.bname !== ''
								&& /[리|길]$/g.test(data.bname)){
								extraAddr += data.bname;
							}

							// 조합된 참고항목을 해당 필드에 넣는다.
							document.getElementById("sample6_extraAddress").value = extraAddr;

						} else {							
							document.getElementById("sample6_extraAddress").value = '';
						}

						// 우편번호와 주소 정보를 해당 필드에 넣는다.
						//document.getElementById('sample6_postcode').value = data.zonecode;
						document.getElementById("sample6_address").value = addr;
						
						document.getElementById("address").value = extraAddr.split(',')[0];						
						
					}
				}).open();
	}
</script>
