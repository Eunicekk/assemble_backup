let nameInput = document.querySelector(".find-id input");
let emailInput = document.querySelector(".find-email input");
let icon01 = document.querySelector(".material-symbols-rounded");
let icon02 = document.querySelector(".material-symbols-outlined");
let findId = document.querySelector(".find-id");
let findEmail = document.querySelector(".find-email");

nameInput.addEventListener('focus', function(){
    icon01.style.color = "#1B4568";
    findId.style.border = "1px solid #1B4568";
})
nameInput.addEventListener('blur', function(){
    icon01.style.color = "#777777";
    findId.style.border = "1px solid #dadada";
})
emailInput.addEventListener('focus', function(){
    icon02.style.color = "#1B4568";
    findEmail.style.border = "1px solid #1B4568";
})
emailInput.addEventListener('blur', function(){
    icon02.style.color = "#777777";
    findEmail.style.border = "1px solid #dadada";
})