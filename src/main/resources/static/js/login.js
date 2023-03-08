let loginIdBtn = document.querySelector(".login-id-button");
let loginSnsBtn = document.querySelector('.login-sns-button');
let loginId = document.querySelector(".login-id");
let loginSns = document.querySelector(".login-sns");
let icon01 = document.querySelector(".icon01");
let icon02 = document.querySelector(".icon02");
let loginIdInput = document.querySelector("#id-input");
let loginPwInput = document.querySelector("#pw-input");
let loginIdDiv = document.querySelector("#id-div");
let loginPwDiv = document.querySelector("#password-div");
let icon03 = document.querySelector(".icon03");
let icon04 = document.querySelector(".icon04");
let loginBtn = document.querySelector(".login-id button");
let loginErrorMsg = document.querySelector(".login-error");
let idErrorMsg = document.querySelector(".id-error");
let pwErrorMsg = document.querySelector(".pw-error");

// ID 로그인 버튼을 클릭했을 때 폼 노출시키는 이벤트
loginIdBtn.addEventListener('click', function(){
    loginId.style.display = "flex";
    loginSns.style.display = "none";
    loginIdBtn.style.borderBottom = "none";
    loginSnsBtn.style.borderBottom = "1px solid #c6c6c6";
    loginIdBtn.style.backgroundColor = "#ffffff";
    loginSnsBtn.style.backgroundColor = "#f8f9fa";
    icon01.style.color = "#1B4568";
    icon02.style.color = "#777777";
    loginIdBtn.style.color = "#1B4568";
    loginSnsBtn.style.color = "#777777";
})
// SNS 로그인 버튼을 클릭했을 때 SNS 로그인 버튼들 노출시키는 이벤트
loginSnsBtn.addEventListener('click', function(){
    loginId.style.display = "none";
    loginSns.style.display = "flex";
    loginIdBtn.style.borderBottom = "1px solid #c6c6c6";
    loginSnsBtn.style.borderBottom = "none";
    loginIdBtn.style.backgroundColor = "#f8f9fa";
    loginSnsBtn.style.backgroundColor = "#ffffff";
    icon01.style.color = "#777777";
    icon02.style.color = "#1B4568";
    loginIdBtn.style.color = "#777777";
    loginSnsBtn.style.color = "#1B4568";
})

// 아이디 input에 focus/blur가 갔을 때 발생하는 이벤트
loginIdInput.addEventListener('focus', function(){
    icon03.style.color = "#1B4568";
    loginIdDiv.style.border = "1px solid #1B4568";
})
loginIdInput.addEventListener('blur', function(){
    icon03.style.color = "#777777";
    loginIdDiv.style.border = "1px solid #dadada";
})
// 비밀번호 input에 focus/blur가 갔을 때 발생하는 이벤트
loginPwInput.addEventListener('focus', function(){
    icon04.style.color = "#1B4568";
    loginPwDiv.style.border = "1px solid #1B4568";
})
loginPwInput.addEventListener('blur', function(){
    icon04.style.color = "#777777";
    loginPwDiv.style.border = "1px solid #dadada";
})

// 아이디 혹은 비밀번호가 입력되지 않은 상태로 로그인 버튼을 누를 경우 경고 문구 노출
loginBtn.addEventListener('click', function(){
    if(loginIdInput.value === ""){
        idErrorMsg.style.display = "flex";
        pwErrorMsg.style.display = "none";
        loginErrorMsg.style.display = "none";
    }else if(loginPwInput.value === ""){
        idErrorMsg.style.display = "none";
        pwErrorMsg.style.display = "flex";
        loginErrorMsg.style.display = "none";
    }else{
        idErrorMsg.style.display = "none";
        pwErrorMsg.style.display = "none";
        loginErrorMsg.style.display = "flex";
    }
})