let loginIdBtn = document.querySelector(".login-id-button");
let loginSnsBtn = document.querySelector('.login-sns-button');
let loginId = document.querySelector(".login-id");
let loginSns = document.querySelector(".login-sns");
let icon01 = document.querySelector(".icon01");
let icon02 = document.querySelector(".icon02");
let loginIdInput = document.querySelector("input[type=text]");
let loginPwInput = document.querySelector("input[type=password]");
let loginIdDiv = document.querySelector(".login-id div:nth-child(1)");
let loginPwDiv = document.querySelector(".login-id div:nth-child(2)");
let icon03 = document.querySelector(".icon03");
let icon04 = document.querySelector(".icon04");

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

loginIdInput.addEventListener('focus', function(){
    icon03.style.color = "#1B4568";
    loginIdDiv.style.border = "1px solid #1B4568";
})
loginIdInput.addEventListener('blur', function(){
    icon03.style.color = "#777777";
    loginIdDiv.style.border = "1px solid #dadada";
})
loginPwInput.addEventListener('focus', function(){
    icon04.style.color = "#1B4568";
    loginPwDiv.style.border = "1px solid #1B4568";
})
loginPwInput.addEventListener('blur', function(){
    icon04.style.color = "#777777";
    loginPwDiv.style.border = "1px solid #dadada";
})

let loginErrorMsg = document.querySelector('login-error');
let idErrorMsg = document.querySelector('id-error');
let pwErrorMsg = document.querySelector('pw-error');

