let $id = $('.id');
let $pw = $('.pw');
let $pw_check = $('.pw_check');
let $email = $('.email');
let $name = $('.name');
let $nickname = $('.nickname');

let $msg01 = $('.error-msg-01');
let $msg02 = $('.error-msg-02');
let $msg03 = $('.error-msg-03');
let $msg04 = $('.error-msg-04');

// 아이디 중복검사
$('#id_check').on('click', function(){
    $.ajax({
        type: 'GET',
        url: '/check/checkId',
        data: {
            userId: $id.val()
        },
        success: idCheck,
        error: function(xhr, status, error) {
            console.log(this.data);
            // AJAX 요청 실패 시 처리
            console.log(xhr.responseText); // 서버로부터 받은 응답 내용 출력
            console.log(error); // 발생한 오류 출력
            alert('서버 오류가 발생했습니다.');
        }
    })
});

function idCheck(data){
    if(data) {
        console.log("success");
        $msg01.text("사용 가능한 아이디입니다.");
    } else {
        $msg01.text("이미 존재하는 아이디입니다.");
    }
}

// 비밀번호 확인
$('.pw_check').on('focus', function(){
    if($pw_check.val() === $pw.val()) {
        $msg03.text("비밀번호가 일치합니다.");
    }else{
        $msg03.text("비밀번호가 일치하지 않습니다.");
    }
})

// 입력하지 않았을 때 경고 처리 및 닉네임 중복 검사
$('.signup_btn').on('click', function(){
    if($id.val() == ''){
        $msg01.text("아이디를 입력해 주세요.");
    }else if($pw.val() == ''){
        $msg02.text("비밀번호를 입력해 주세요.")
    }else if($pw_check.val() == ''){
        $msg02.text("");
        $msg03.text("비밀번호를 확인해 주세요.")
    }else if($nickname.val() == ''){
        $msg02.text("");
        $msg03.text("");
        $msg04.text("닉네임을 입력해 주세요.")
    }else{
        $.ajax({
            type: 'GET',
            url: '/check/checkNickname',
            data: {
                userNickname: $nickname.val()
            },
            success: nicknameCheck,
            error: function(xhr, status, error) {
                console.log(this.data);
                // AJAX 요청 실패 시 처리
                console.log(xhr.responseText); // 서버로부터 받은 응답 내용 출력
                console.log(error); // 발생한 오류 출력
                alert('서버 오류가 발생했습니다.');
            }
        })
    }
})

function nicknameCheck(data){
    if(data) {
        $("#signup").submit();
    } else {
        $msg04.text("이미 존재하는 닉네임입니다.");
    }
}

// 비밀번호 유효성 검사
const regex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*()_+])[a-zA-Z\d!@#$%^&*()_+]{8,}$/;

$pw.on('blur', function(){
    if(regex.test($(this).val())){
        $msg02.text("사용 가능한 비밀번호입니다.");
    }else{
        $msg02.text("영어, 숫자, 특수문자를 1개 이상 포함한 8자리 이상의 비밀번호로 설정하세요.");
    }
});