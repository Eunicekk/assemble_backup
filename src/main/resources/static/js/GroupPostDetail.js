// 별점
let $star = $(".star-score label");

$star.on("click", function(){
    $(this).children().css("text-shadow", "0 0 0 #1B4568");
    $(this).prevAll('label').children().css("text-shadow", "0 0 0 #1B4568");
    $(this).nextAll('label').children().css("text-shadow", "0 0 0 rgb(203, 203, 203)");
})

// 평가
$('.user-info').on("click",function(){
    $(this).next('.user-score').toggle();
})