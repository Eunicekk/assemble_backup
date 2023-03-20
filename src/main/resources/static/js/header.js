let notification = document.getElementById("notification-box");
let notificationBtn = document.getElementById("notification-button");
let notificationCheck = document.getElementById("notification-check");
let notificationCloseBtn = document.getElementById("notification-box-close-button");
let myMenu = document.getElementById("my-menu-box");
let myMenuBtn = document.getElementById("my-menu-button");
let myMenuCheck = document.getElementById("my-menu-check");

// 알림 버튼 클릭 시, 알림창 띄우기와 제거
notificationBtn.addEventListener("click", ()=> {
    if(notificationCheck.checked) {
        notification.style.display = "none";
        notificationCheck.checked = false;
    }
    else {
        notification.style.display = "block";
        notificationCheck.checked = true;
    }
})

// x 표시 클릭 시, 알림창 제거
notificationCloseBtn.addEventListener("click", () => {
    notification.style.display = "none";
    notificationCheck.checked = false;
})

// 마이 메뉴창 띄우기, 제거
myMenuBtn.addEventListener("click", () => {
    if(myMenuCheck.checked) {
        myMenu.style.display = "none";
        myMenuCheck.checked = false;
    }
    else {
        myMenu.style.display = "flex";
        myMenuCheck.checked = true;
    }
})