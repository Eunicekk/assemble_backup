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

