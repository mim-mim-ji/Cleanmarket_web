<style>
header.masthead {
	display: none;
}
</style>


<br />
<br />
<div class="container">

	<div class="row">
		<div class="col-lg-12">
			<div class="card">
				<div class="card-header text-white"
					style="background-color: #643691;">게시글 등록</div>
				<div class="card-body">

					<form role="form" method="post">

						<div class="form-group">
							<label>작성자</label> 
							<input type="text" class="form-control"
								name='writer' value="${login.name}" readonly>
						</div>

						<div class="form-group">
							<label>제목</label> <input type="text" class="form-control"
								name='title'>
						</div>

						<div class="form-group">
							<label>내용</label>
							<textarea class="form-control" rows="5" name='content'></textarea>
						</div>

						<input type="submit" value="등록" class="btn form-control"
							style="background-color: #643691; margin-top: 0; height: 40px; color: white; border: 0px solid #f78f24; opacity: 0.8">
						&nbsp;&nbsp; <a class="btn form-control"
							href="<c:url value='/board/list'/>"
							style="cursor: pointer; margin-top: 0; height: 40px; color: white; background-color: orange; border: 0px solid #388E3C; opacity: 0.8">취소</a>
					</form>



				</div>
			</div>
		</div>
	</div>
</div>


<ul class="sc-gKLXLV KuQhq">
	<li class="sc-bvCTgw erFeQZ">이미지 등록<input type="file"
		accept="image/jpg, image/jpeg, image/png" multiple=""></li>
	<li draggable="false" class="sc-gCKARq cFJZqB"><div
			class="sc-fObBmV kkBunL">대표이미지</div>
		<img src="https://media.bunjang.co.kr/images/crop/608744836_w404.jpg"
		alt="상품이미지">
	<button type="button" class="sc-ePAWwb ginAKz"></button></li>
</ul>




<h6>이미지 등록</h6>
<input type="file" id="image" accept="image/jpg, image/jpeg, image/png"
	onchange="setImage(event);" multiple>

<div id="image_container" style="width: 200px; height: auto;">
	상품이미지</div>

function setImage(event) {
		
		for (var image of event.target.files) {
			var reader = new FileReader();
			reader.onload = function(event) {
				var img = document.createElement("img");
				img.setAttribute("src", event.target.result);
				document.querySelector("div#image_container").appendChild(img);
			};
			console.log(image);
			reader.readAsDataURL(image);
		}
	}
	
	$("input[id=image]").change(function(){
	    
	    var ext = $(this).val().split(".").pop().toLowerCase();
	    
	    if($.inArray(ext,["gif","jpg","jpeg","png","bmp"]) == -1) {
	        alert("gif, jpg, jpeg, png, bmp 파일만 업로드 해주세요.");
	        $("input[id=image]").val("");
	        return;
	    }
	    
	    var fileSize = this.files[0].size;
	    var maxSize = 1024 * 1000 * 10;
	    if(fileSize > maxSize) {
	        alert("파일용량을 초과하였습니다.");
	        return;
	    }
	    
	    var file  = this.files[0];
	    var _URL = window.URL || window.webkitURL;
	    var img = new Image();
	    
	    img.src = _URL.createObjectURL(file);
	    img.onload = function() {
	        
	        if(img.width > 640 || img.height > 640) {
	            alert("이미지 가로 640px, 세로 640px로 맞춰서 올려주세요.");
	            $("input[id=image]").val("");
	        } 
	    }
	});
