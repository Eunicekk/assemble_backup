let bannerBtn = document.querySelectorAll("input[name=banner-radio]");
let banner = document.querySelector("#banner-img");

// 배너 클릭에 따라 변환
for(let i = 0; i < bannerBtn.length; i++) {
    bannerBtn[i].addEventListener("click", () => {
        if(i === 0) {
            banner.style.transform = "translate(0)"
        }
        else {
            banner.style.transform = "translate(-100vw)"
        }
    })
}

// 배너 시간에 따라 자동 변환
let auto = setInterval(autoChangeBanner, 5000);
banner.addEventListener("mouseenter", () => {
    clearInterval(auto);
})
banner.addEventListener("mouseleave", () => {
    auto = setInterval(autoChangeBanner, 5000);
})
function autoChangeBanner() {
    if(bannerBtn[0].checked === true) {
        bannerBtn[1].checked = true;
        banner.style.transform = "translate(-100vw)"
    }
    else {
        bannerBtn[0].checked = true;
        banner.style.transform = "translate(0)"
    }
}

let findPosition = document.getElementById("find-position-box");
let findPositionBtn = document.getElementById("find-position");
let findPositionCheck = document.getElementById("find-position-check");

findPositionBtn.addEventListener("click", () => {
    if(findPositionCheck.checked) {
        findPosition.style.display = "none";
        findPositionCheck.checked = false;
    } else {
        findPosition.style.display = "flex";
        findPositionCheck.checked = true;
    }
})

// 필터링
let topic = document.querySelectorAll("input[name=topic-radio]");
let subject = document.querySelectorAll("input[name=filter]");
let label = document.getElementsByClassName("filter-label");



if(!subject.values()) {
    for(let k = 0; k < subject.length; k++) {
        label[k].style.opacity = "1";
    }
}

for(let j = 0; j < label.length; j++) {
    if(label[j].className.indexOf("pop") !== -1) {
        label[j].style.display = "initial";
    } else {
        label[j].style.display = "none";
    }
}

for(let i = 0; i < topic.length; i++) {
    topic[i].addEventListener("click", () => {
        let topicValue = topic[i].value;
        for(let j = 0; j < label.length; j++) {
            if(label[j].className.indexOf(topicValue) !== -1) {
                label[j].style.display = "initial";
            } else {
                label[j].style.display = "none";
            }
        }
    })
}
$(".filter-label").each(function () {
    this.style.opacity = "1";
})
for(let i = 0; i < subject.length; i++) {
    subject[i].addEventListener("click", () => {
        if($("input[name=filter]:checked").length === 0) {
            $(".filter-label").each(function () {
                this.style.opacity = "1";
            })
        } else {
            $(".filter-label").each(function () {
                this.style.opacity = "0.3";
            })
            $("input[name=filter]:checked + label").each(function () {
                this.style.opacity = "1"
            })
        }
    })
}




// 스터디 완료된 그룹들만 나열
let completeCheckButton = document.getElementById("complete-check-button");
let completeCheckButtonCircle = document.getElementById("complete-check-button-circle");
let completeCheck = document.getElementById("complete-check");

completeCheckButton.addEventListener("click", () => {
    if(completeCheck.checked) {
        completeCheckButtonCircle.style.transform = "translate(-20px)";
        completeCheckButton.style.backgroundColor = "#c1cbd8";
        completeCheck.checked = false;
    } else {
        completeCheckButtonCircle.style.transform = "translate(0)";
        completeCheckButton.style.backgroundColor = "#1a4568";
        completeCheck.checked = true;
    }
})

let searchButton = document.getElementById("search-button");
let searchInput = document.getElementById("search-input");

searchButton.addEventListener("click", () => {
    searchInput.style.display = "initial";
})

//별표 클릭 시, 관심 목록 추가 and 색 입히기
let favorites = document.getElementsByClassName("favorites");
let favoritesCheck = document.getElementsByClassName("favorites-check");

for(let i = 0; i < favorites.length; i++) {
    favorites[i].addEventListener("click", function (e) {
        e.preventDefault();
        if(favoritesCheck[i].checked) {
            favorites[i].style.color = "#9f9f9f";
            favoritesCheck[i].checked = false;
            console.log(favoritesCheck[i].checked)
        } else {
            favorites[i].style.color = "#ffe302";
            favoritesCheck[i].checked = true;
            console.log(favoritesCheck[i].checked)
        }

    })
}



//스크롤 탑
let scrollMoveTop = document.getElementById("scroll-move-top");

scrollMoveTop.addEventListener("click", () => {
    window.scrollTo({top: 0, behavior: "smooth"});
})