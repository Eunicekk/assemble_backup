let $nameInput = $('input[type=text]');
let $emailInput = $('input[type=email]');
let $icon01 = $('.material-symbols-rounded');
let $icon02 = $('.material-symbols-outlined');
let $findId = $('.find-id');
let $findEmail = $('.find-email');

let $findErrorMsg = $('.find-error');
let $nameErrorMsg = $('.name-error');
let $emailErrorMsg = $('.email-error');
let $memberFindBtn = $('.member-find button');

// 이름 input에 focus/blur가 갔을 때 발생하는 이벤트
$nameInput.on('focus', function(){
    $icon01.css('color', '#1B4568');
    $findId.css('border', '1px solid #1B4568');
})
$nameInput.on('blur', function(){
    $icon01.css('color', '#777777');
    $findId.css('border', '1px solid #DADADA');
})

// 이메일 주소 input에 focus/blur가 갔을 때 발생하는 이벤트
$emailInput.on('focus', function(){
    $icon02.css('color', '#1B4568');
    $findEmail.css('border', '1px solid #1B4568');
})
$emailInput.on('blur', function(){
    $icon02.css('color', '#777777');
    $findEmail.css('border', '1px solid #DADADA');
})

function findUserCheck(data){
    if(data) {
        console.log("success");
        $nameErrorMsg.css('display', 'none');
        $emailErrorMsg.css('display', 'none');
        $findErrorMsg.css('display', 'none');
        $("find-form").submit();
    } else {
        $nameErrorMsg.css('display', 'none');
        $emailErrorMsg.css('display', 'none');
        $findErrorMsg.css('display', 'flex');
    }
}

// 이름이나 이메일 주소가 입력되지 않은 상태로 계정찾기 버튼을 누를 경우 경고 문구 노출
$memberFindBtn.on('click', function(){
    if($nameInput.val() === ""){
        $nameErrorMsg.css('display', 'flex');
        $emailErrorMsg.css('display', 'none');
        $findErrorMsg.css('display', 'none');
    }else if($emailInput.val() === ""){
        $nameErrorMsg.css('display', 'none');
        $emailErrorMsg.css('display', 'flex');
        $findErrorMsg.css('display', 'none');
    }else{
        // $.ajax({
        //     type: 'POST',
        //     url: '/check/findUser', // 로그인 체크 API 엔드포인트
        //     data: {
        //         name: $nameInput.val(),
        //         email: $emailInput.val()
        //     },
        //     success: findUserCheck,
        //     error: function(xhr, status, error) {
        //         console.log(this.data);
        //         // AJAX 요청 실패 시 처리
        //         console.log(xhr.responseText); // 서버로부터 받은 응답 내용 출력
        //         console.log(error); // 발생한 오류 출력
        //         alert('서버 오류가 발생했습니다.');
        //     }
        // });
    }
})
