console.log($("#userNickname").val());
console.log($("#userEmail").val());


$(".modify-btn").click(function(){
    console.log($("#userNickname").val());
    console.log($("#userEmail").val());
    $.ajax({
        url: "/check/modify",
        type: "PATCH",
        data: JSON.stringify({
                userNickname: $("#userNickname").val(),
                userEmail: $("#userEmail").val(),
                userId: $("#userId").text()
            }),
        contentType: "application/json-patch+json; charset=utf-8",
        success: function(){
            alert("회원 정보가 수정되었습니다.");
            window.location.href = "/mypage";
        }
    });
});

$("#secede-btn").click(function(){
    alert("서비스를 탈퇴하셨습니다. 다음에 다시 찾아와 주세요:)");
});

// 이미지 파일 처리
// $(document).ready(function() {
//     // 이벤트 핸들러를 직접 호출하여 초기 실행을 수행
//     handleInputChange();
// });
//
// function handleInputChange(event) {
//     let $input = $(".post-image");
//     let $imgBox = $(".img-box"); // 이미지가 나타날 요소를 선택
//
//     // 파일 객체를 얻음
//     let file = event ? event.target.files[0] : $input.prop("files")[0];
//
//     console.log(file);
//     appendImg(file, $imgBox);
// }
//
// function appendImg(file, $imgBox) {
//     let src = URL.createObjectURL(file);
//
//     // 이미지가 나타날 요소의 속성을 변경하여 이미지 표시
//     $imgBox.attr("src", src);
// }

