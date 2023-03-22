let $loginIdBtn = $('.login-id-button');
let $loginSnsBtn = $('.login-sns-button');
let $loginId = $('.login-id');
let $loginSns = $('.login-sns');
let $icon01 = $('.icon01');
let $icon02 = $('.icon02');
let $loginIdInput = $('input[type=text]');
let $loginPwInput = $('input[type=password]');
let $loginIdDiv = $('#id-div');
let $loginPwDiv = $('#password-div');
let $icon03 = $('.icon03');
let $icon04 = $('.icon04');
let $loginBtn = $('.login-id button');
let $errorMsg = $('.error-msg');


// ID 로그인 버튼을 클릭했을 때 폼 노출시키는 이벤트
$loginIdBtn.on('click', function(){
    $loginId.css('display', 'flex');
    $loginSns.css('display', 'none');
    $loginIdBtn.css('border-bottom', 'none');
    $loginIdBtn.css('background-color', '#ffffff');
    $loginIdBtn.css('color', '#1B4568');
    $loginSnsBtn.css('border-bottom', '1px solid #c6c6c6');
    $loginSnsBtn.css('background-color', '#f8f9fa');
    $loginSnsBtn.css('color', '#777777');
    $icon01.css('color', '#1B4568');
    $icon02.css('color', '#777777');
})

// SNS 로그인 버튼을 클릭했을 때 SNS 로그인 버튼들 노출시키는 이벤트
$loginSnsBtn.on('click', function(){
    $loginId.css('display', 'none');
    $loginSns.css('display', 'flex');
    $loginIdBtn.css('border-bottom', '1px solid #c6c6c6');
    $loginIdBtn.css('background-color', '#f8f9fa');
    $loginIdBtn.css('color', '#777777');
    $loginSnsBtn.css('border-bottom', 'none');
    $loginSnsBtn.css('background-color', '#ffffff');
    $loginSnsBtn.css('color', '#1B4568');
    $icon01.css('color', '#777777');
    $icon02.css('color', '#1B4568');
})

// 아이디 input에 focus/blur가 갔을 때 발생하는 이벤트
$loginIdInput.on('focus', function(){
    $icon03.css('color', '#1B4568');
    $loginIdDiv.css('border', '1px solid #1B4568');
})
$loginIdInput.on('blur', function(){
    $icon03.css('color', '#777777');
    $loginIdDiv.css('border', '1px solid #dadada');
})

// 비밀번호 input에 focus/blur가 갔을 때 발생하는 이벤트
$loginPwInput.on('focus', function(){
    $icon04.css('color', '#1B4568');
    $loginPwDiv.css('border', '1px solid #1B4568');
})
$loginPwInput.on('blur', function(){
    $icon04.css('color', '#777777');
    $loginPwDiv.css('border', '1px solid #dadada');
})

// 아이디 혹은 비밀번호가 입력되지 않은 상태로 로그인 버튼을 누를 경우 경고 문구 노출
$loginBtn.on('click', function(){
    if($loginIdInput.val() == ''){
        $errorMsg.text("아이디를 입력해 주세요.");
    }else if($loginPwInput.val() == ''){
        $errorMsg.text("비밀번호를 입력해 주세요.");
    }else{
        $errorMsg.text("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
    }
})
