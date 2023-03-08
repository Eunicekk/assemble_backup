let nameInput = document.querySelector("#name-input");
let emailInput = document.querySelector("#email-input");
let icon01 = document.querySelector(".material-symbols-rounded");
let icon02 = document.querySelector(".material-symbols-outlined");
let findIdDiv = document.querySelector(".find-id");
let findEmailDiv = document.querySelector(".find-email");
let findErrorMsg = document.querySelector(".find-error");
let nameErrorMsg = document.querySelector(".name-error");
let emailErrorMsg = document.querySelector(".email-error");
let memberFindBtn = document.querySelector(".member-find button");

// 이름 input에 focus/blur가 갔을 때 발생하는 이벤트
nameInput.addEventListener('focus', function(){
    icon01.style.color = "#1B4568";
    findIdDiv.style.border = "1px solid #1B4568";
})
nameInput.addEventListener('blur', function(){
    icon01.style.color = "#777777";
    findIdDiv.style.border = "1px solid #dadada";
})
// 이메일 주소 input에 focus/blur가 갔을 때 발생하는 이벤트
emailInput.addEventListener('focus', function(){
    icon02.style.color = "#1B4568";
    findEmailDiv.style.border = "1px solid #1B4568";
})
emailInput.addEventListener('blur', function(){
    icon02.style.color = "#777777";
    findEmailDiv.style.border = "1px solid #dadada";
})

// 이름이나 이메일 주소가 입력되지 않은 상태로 계정찾기 버튼을 누를 경우 경고 문구 노출
memberFindBtn.addEventListener('click', function(){
    if(nameInput.value === ""){
        nameErrorMsg.style.display = "flex";
        emailErrorMsg.style.display = "none";
        findErrorMsg.style.display = "none";
    }else if(emailInput.value === ""){
        nameErrorMsg.style.display = "none";
        emailErrorMsg.style.display = "flex";
        findErrorMsg.style.display = "none";
    }else{
        nameErrorMsg.style.display = "none";
        emailErrorMsg.style.display = "none";
        findErrorMsg.style.display = "flex";
    }
})